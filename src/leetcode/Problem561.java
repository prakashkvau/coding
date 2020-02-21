//_561. com.datastructures.MyArray Partition I
package leetcode;
import java.util.Arrays;

/**
 * Given an array of 2n integers, your task is to group these integers into n pairs of integer,
 * say (a1, b1), (a2, b2), ..., (an, bn) which makes sum of min(ai, bi) for all i from 1 to n as large as possible.
 *
 * Input: [1,4,3,2]
 * Output: 4
 * Explanation: n is 2, and the maximum sum of pairs is 4 = min(1, 2) + min(3, 4).
 *
 * n is a positive integer, which is in the range of [1, 10000].
 * All the integers in the array will be in the range of [-10000, 10000].
 *
 * # Sort and add all values and grab 2 at a time and calculate value O(nlgn)
 * # Move number to their index, if duplicate exists add it to max and remove from array. At the end pair and add to sum O(n)
 */
class Problem561
{
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        //combine two number at a time
        int sum = 0;
        for (int i = 0 ; i < nums.length; i=i+2) {
            sum = sum + Math.min(nums[i], nums[i+1]);
        }

        return sum;
    }

    public static void main(String[] args) {
        Problem561 solution = new Problem561();
        int[] a = new int[] {1,4,3,2};
        int ret = solution.arrayPairSum(a);
        System.out.println(ret);
    }

}