package leetcode;

public class SingleElementInSortedArray {
  // 1, 1, 2, 3, 3, 4, 4
  // second 3 (1, 1, 2, 3)
  // first 3 (
  public static int singleNonDuplicate(int[] nums) {
    int low = 0;
    int high = nums.length - 1;
    while (low < high) {
      int mid = (low + high) >>> 1;
      boolean halvesAreEven = (high - mid) % 2 == 0;

      if (nums[mid + 1] == nums[mid]) {
        if (halvesAreEven) low = mid + 2;
        else high = mid - 1;
      } else if (nums[mid - 1] == nums[mid]) {
        if (halvesAreEven) high = mid - 2;
        else low = mid + 1;
      } else {
        return nums[mid];
      }
    }

    return nums[low];
  }

  public static void main(String[] args) {
    singleNonDuplicate(new int[]{3, 3, 7, 7, 10, 11, 11});
  }
}
