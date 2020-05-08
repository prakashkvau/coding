package leetcode;

/**
 * https://leetcode.com/contest/weekly-contest-187/problems/check-if-all-1s-are-at-least-length-k-places-away/
 */
public class KLengthApart {
  public boolean kLengthApart(int[] nums, int k) {
    int count = 0;
    boolean startCounting = false;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 1) {
        if (startCounting && count < k) {
          return false;
        }
        if (startCounting && count >= k) {
          count = 0;
        }
        if (!startCounting) {
          startCounting = true;
        }
      } else if (startCounting) {
        count++;
      }


    }

    return true;
  }

  public static void main(String[] args) {
    KLengthApart kLengthApart = new KLengthApart();
    System.out.println(kLengthApart.kLengthApart(new int[]{1,0,0,0,1,0,0,1}, 2));
  }
}
