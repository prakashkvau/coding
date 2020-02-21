// 977. Squares of a Sorted com.datastructures.MyArray
package leetcode;
/**
 * Given an array of integers A sorted in non-decreasing order,
 * return an array of the squares of each number,
 * also in sorted non-decreasing order.
 *
 *  # Have two pointers and insert the higher square into the new array
 */

class Problem977 {
    public static int[] sortedSquares(int[] A) {
        int size = A.length;
        int[] resp = new int[size];
        int i = 0, index = 0, j = size - 1;
        
        while (index <= size-1) {
           if (Math.abs(A[i]) >= Math.abs(A[j])) {
               resp[size-1-index] = A[i]*A[i];
               i++;
           } else {
               resp[size-1-index] = A[j]*A[j];
               j--;
           }    
           index++;
        }

        return resp;
    }

    public static void main(String[] args) {
        int[] a = new int[]{1,-2,3};
        int[] resp = sortedSquares(a);
        for (int res : resp) {
            System.out.println(res);
        }
    }
}