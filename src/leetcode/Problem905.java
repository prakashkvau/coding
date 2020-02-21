// 905. Sort com.datastructures.MyArray By Parity
package leetcode;

/**
 * Given an array A of non-negative integers, return an array consisting of all
 * the even elements of A, followed by all the odd elements of A. You may return
 * any answer array that satisfies this condition.
 * 
 * # Even add to the left of array, odd add to right
 */

class Problem905 {
    public static int[] sortArrayByParity(int[] A) {
        int size = A.length;
        int[] resp = new int[size];

        for (int i = 0, left = 0, right = size - 1; i < size; i++) {
            if (A[i] % 2 == 0) {
                resp[left] = A[i];
                left++;
            } else {
                resp[right] = A[i];
                right--;
            }
        }

        // Swap odd numbers
        for (int i = 0,right=size-1; i < size ; i++) {
            if (resp[i]%2 != 0) {
               int temp = resp[i];
               resp[i] = resp[right];
               resp[right] = temp;
               right--;
            }
        }

        return resp;
    }

    public static void main(String[] args) {
        int[] a = new int[] { 1, 2, 3 };
        int[] resp = sortArrayByParity(a);
        for (int res : resp) {
            System.out.println(res);
        }
    }
}