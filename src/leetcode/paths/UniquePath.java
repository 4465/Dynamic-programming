package leetcode.paths;

import java.util.Scanner;

/**
 * @author 刘威甫
 * @date 2022/8/23 13:22
 * @description 不同路径 LeetCode 62
 */
public class UniquePath {
    public int uniquePaths(int m, int n) {
        int dp[][] = new int[m][n];

        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }
        for (int i = 0; i < n; i++) {
            dp[0][i] = 1;
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }

        return dp[m-1][n-1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        UniquePath up = new UniquePath();
        System.out.println(up.uniquePaths(m,n));
    }
}
