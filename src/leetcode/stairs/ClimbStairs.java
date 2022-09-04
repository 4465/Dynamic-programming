package leetcode.stairs;

import java.util.*;

/**
 * @author 刘威甫
 * @date 2022/8/23 11:03
 * @description
 */
public class ClimbStairs {


    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            int n = sc.nextInt();
            ClimbStairs climbStairs = new ClimbStairs();
            int ans = climbStairs.climbStairs(n);
            System.out.println(ans);
        }

    }

}
