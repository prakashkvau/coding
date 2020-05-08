package leetcode;

/**
 * https://leetcode.com/explore/challenge/card/may-leetcoding-challenge/534/week-1-may-1st-may-7th/3316/
 */
public class FirstBadOne {
  public int firstBadVersion(int n) {
    int low = 0;
    int high = n - 1;
    int returnResult = -1;
    while (low <= high) {
      int mid = (low + high) >>> 1;
      boolean res = isBadVersion(mid + 1);
      if (res) {
        returnResult = mid + 1;
        high = mid - 1;
      } else {
        low = mid + 1;
      }
    }

    return returnResult;
  }

  public boolean isBadVersion(int value) {
    if (value >= 2)
      return true;
    return false;
  }

  public static void main(String[] args) {
    FirstBadOne firstBadOne = new FirstBadOne();
    System.out.println(firstBadOne.firstBadVersion(5));
  }
}
