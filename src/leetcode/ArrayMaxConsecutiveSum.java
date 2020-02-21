package leetcode;

public class ArrayMaxConsecutiveSum {
    static int arrayMaxConsecutiveSum(int[] inputArray, int k) {
        int sum = 0;
        int prev = 0;
        for (int i = 0 ; i < k; i++) {
            sum += inputArray[i];
            prev+= inputArray[i];
        }

        for (int i = k ; i < inputArray.length; i++) {
             prev = prev-inputArray[i-k] + inputArray[i];
            sum = Math.max(sum, prev);
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] n = new int[]{2, 3, 5, 1, 6};
        System.out.println(arrayMaxConsecutiveSum(n, 2));
    }
}
