package leetcode;

/**
 * Given an array A of non-negative integers, half of the integers in A are odd, and half of the integers are even.
 * Sort the array so that whenever A[i] is odd, i is odd; and whenever A[i] is even, i is even.
 * You may return any answer array that satisfies this condition.
 * Example 1:
 * Input: [4,2,5,7]
 * Output: [4,5,2,7]
 * Explanation: [4,7,2,5], [2,5,4,7], [2,7,4,5] would also have been accepted.
 */
class Problem922
{
    public int[] sortArrayByParityII(int[] A) {
        int[] res = new int[A.length];
        
        return res;
    }

    public static void main(String[] args) {
        Problem922 solution = new Problem922();
        int[] a = new int[] {1,4,3,2};
        int[] ret = solution.sortArrayByParityII(a);
        
        for (int i =0 ; i < ret.length; i++ ) {
            System.out.println(ret[i]);
        }
    }

}