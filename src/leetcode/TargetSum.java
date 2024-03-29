package leetcode;

public class TargetSum {
    public int findTargetSumWays(int[] nums, int S) {
        int[][] dp = new int[nums.length][2001];
        dp[0][nums[0] + 1000] = 1;
        dp[0][-nums[0] + 1000] += 1;

        for (int i = 1; i < nums.length; i++) {
            for (int j = -1000; j <= 1000; j++) {
                if (dp[i - 1][j + 1000] > 0) {
                    dp[i][j + nums[i] + 1000] += dp[i - 1][j + 1000];
                    dp[i][j - nums[i] + 1000] += dp[i - 1][j + 1000];
                }
            }

        }

        return S > 1000 ? 0 : dp[nums.length -1][S + 1000];

    }

    public static void main(String[] args) {
        TargetSum ts = new TargetSum();
        int[] n = new int[] { 1, 1, 1, 1, 1 };
        System.out.println(ts.findTargetSumWays(n, 3));
    }
}