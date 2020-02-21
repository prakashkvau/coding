package leetcode;
/**
 * Given a binary matrix A, we want to flip the image horizontally, then invert it, and return the resulting image.
 * To flip an image horizontally means that each row of the image is reversed.  For example, flipping [1, 1, 0] horizontally results in [0, 1, 1].
 * To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0. For example, inverting [0, 1, 1] results in [1, 0, 0].
 * 
 * 
 * # com.datastructures.MyArray has only 0,1
 * # Inverse the number when you flip row
 */

class Problem832 {
    public static int[][] flipAndInvertImage(int[][] A) {
        int[][] resp = new int[A.length][A[0].length];
        int rowLength = A.length;
        int colLength = A[0].length;

        for (int i= 0; i< rowLength; i++) {
            // revert and flip res
            int[] reverseRes = new int[colLength];
            for (int j = 0; j < colLength; j++) {
                if (A[i][colLength-1-j] == 1) {
                    reverseRes[j] = 0;
                } else{
                    reverseRes[j] = 1; 
                }
            }
            resp[i] = reverseRes;
        }
        
        return resp;
    }

    public static void main(String[] args) {
        int[][] a = new int[][]{{1,0}, {1,0}, {1,1}};
        int[][] ret = flipAndInvertImage(a);

        for (int[] res : ret) {
            for (int i : res) {
                System.out.print(i + " ");
            }
            
            System.out.println("");
        }
    }
}