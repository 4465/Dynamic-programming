package leetcode.stairs;

import java.util.*;

/**
 * @author 刘威甫
 * @date 2022/8/23 11:23
 * @description 最小花费爬楼梯 LeetCode746
 */
public class MinCostClimbingStairs {

    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length];
        int len = dp.length;
        dp[0] = cost[0];
        dp[1] = cost[1];
        for (int i = 2; i < len; i++) {
            dp[i] = Math.min(dp[i-1], dp[i-2]) + cost[i];
        }
        return Math.min(dp[cost.length-1], dp[cost.length - 2]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] cost = new int[n];
        for (int i = 0; i < n; i++) {
            cost[i] = sc.nextInt();
        }
    }


}
