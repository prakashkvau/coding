package leetcode;

import java.util.Arrays;

public class TrappingRainWater {

    /**
     * Given n non-negative integers representing an elevation map where the width of each bar is 1,
     * compute how much water it is able to trap after raining.
     * <p>
     * Input: [0,1,0,2,1,0,1,3,2,1,2,1]
     * Output: 6
     *
     * @param height
     * @return
     */
    public int trap(int[] height) {
        int left = 0, right = height.length - 1;
        int leftMax = 0, rightMax = 0;
        int ans = 0;
        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] >= leftMax) {
                    leftMax = height[left];
                } else
                    ans += (leftMax - height[left]);
                left++;
            } else {
                if (height[right] >= rightMax) {
                    rightMax = height[right];
                } else
                    ans += (rightMax - height[right]);
                right--;
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        TrappingRainWater trappingRainWater = new TrappingRainWater();
        int[] data = new int[]{1, 0, 1, 0};
        System.out.println(trappingRainWater.trap(data));
    }
}
