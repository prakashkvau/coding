package leetcode;

// https://leetcode.com/problems/two-sum/
import java.util.HashMap;
import java.util.Map;

public class Problem1 {
    public int[] twoSum(int[] nums, int target) {
        int[] ret = new int[2];
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i< nums.length; i++) {
            int temp = target-nums[i];
            if (m.containsKey(temp)) {
                ret[0] = i;
                ret[1] = m.get(temp);
                break;
            } else {
                m.put(nums[i], i);
            }
        }

        return ret;
    }

    public static void main(String[] args) {
        Problem1 solution = new Problem1();
        int[] data = new int[]{1, 8, 11, 15, 2, 7};
        int[] ret = solution.twoSum(data, 9);
        for (int i =0; i< ret.length; i++) {
            System.out.println(ret[i]);
        }
    }
}
