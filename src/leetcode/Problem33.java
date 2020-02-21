package leetcode;

class Problem33 {
    public int search(int[] nums, int target) {
        // find rotated index
        // if target > nums[0] search rindex, n-1
        // else search 0, rindex.
        if (nums.length == 0) {
            return -1;
        }
        int rindex = rotate_index(nums);
        if (rindex == 0 ){
            return binary_search(nums, 0 , nums.length -1, target);
        }
        if (nums[0] > target) {
            return binary_search(nums, rindex, nums.length - 1, target);
        }
        return binary_search(nums, 0, rindex, target);
    }

    private int binary_search(int[] nums, int start, int end, int target) {
        while(start<=end) {
            int mid = (start+end)/2;
            if (nums[start] == target) {
                return start;
            }
            if (nums[end] == target) {
                return end;
            }
            if (target > nums[mid]) {
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }


    private int rotate_index(int[] nums) {
        for (int i =1; i< nums.length; i++) {
            if (nums[i] < nums[i-1]) {
                return i;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Problem33 solution = new Problem33();
        int[] data = new int[] {1,3};
        int ret = solution.search(data, 3);
        System.out.println(ret);
    }
}

