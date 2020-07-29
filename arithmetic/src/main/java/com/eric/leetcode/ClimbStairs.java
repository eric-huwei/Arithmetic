package com.eric.leetcode;

/**
 * @DESCIRPTION 爬楼梯
 * @AUTHOR SCORPIO.HU
 * @DATE 2020/7/29 下午10:17
 */
public class ClimbStairs {

    public static int climbStairs(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(5));
    }
}
