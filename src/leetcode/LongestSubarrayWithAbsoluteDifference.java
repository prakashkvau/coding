package leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * https://leetcode.com/contest/weekly-contest-187/problems/longest-continuous-subarray-with-absolute-diff-less-than-or-equal-to-limit/
 */
public class LongestSubarrayWithAbsoluteDifference {
  public int longestSubarray(int[] nums, int limit) {
    Deque<Integer> maxd = new ArrayDeque<>();
    Deque<Integer> mind = new ArrayDeque<>();
    int i = 0, j;
    for (j = 0; j < nums.length; ++j) {
      while (!maxd.isEmpty() && nums[j] > maxd.peekLast()) maxd.pollLast();
      while (!mind.isEmpty() && nums[j] < mind.peekLast()) mind.pollLast();
      maxd.add(nums[j]);
      mind.add(nums[j]);
      if (maxd.peek() - mind.peek() > limit) {
        if (maxd.peek() == nums[i]) maxd.poll();
        if (mind.peek() == nums[i]) mind.poll();
        ++i;
      }
    }
    return j - i;
  }

  public static void main(String[] args) {
    LongestSubarrayWithAbsoluteDifference longestSubarrayWithAbsoluteDifference = new LongestSubarrayWithAbsoluteDifference();
//    System.out.println(longestSubarrayWithAbsoluteDifference.longestSubarray(new int[]{4, 8, 5, 1, 7, 9}, 6));
    System.out.println(longestSubarrayWithAbsoluteDifference.longestSubarray(new int[]{8, 2, 4, 7}, 4));
  }
}
