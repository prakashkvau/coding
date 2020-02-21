package leetcode;

import java.util.Arrays;

//https://leetcode.com/problems/product-of-array-except-self/
class Problem238 {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        res[0] = 1;

        for (int i = 1; i < n; i++) {
            res[i] = res[i - 1] * nums[i - 1];
        }

        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] *= right;
            right *= nums[i];
        }
        return res;
    }

    public static void main(String[] args) {
        Problem238 s = new Problem238();
        int[] data = new int[]{1,2,3};
        int[] ret = s.productExceptSelf(data);
        System.out.println(Arrays.toString(ret));
    }
}
