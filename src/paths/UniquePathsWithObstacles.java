package paths;

import java.util.Scanner;

/**
 * @author 刘威甫
 * @date 2022/8/24 10:20
 * @description leetcode 63 不同路径2
 */
public class UniquePathsWithObstacles {

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {

        int[][] dp = new int[obstacleGrid.length][obstacleGrid[0].length];

        int n = dp.length;
        int m = dp[0].length;

        for (int i = 0; i < n; i++) {
            if(obstacleGrid[i][0] == 1) {
                break;
            }
            dp[i][0] = 1;
        }

        for (int i = 0; i < m; i++) {
            if(obstacleGrid[0][i] == 1) {
                break;
            }
            dp[0][i] = 1;
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if(obstacleGrid[i][j] == 1){
                    continue;
                }
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        return dp[n-1][m-1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        UniquePathsWithObstacles uniquePathsWithObstacles = new UniquePathsWithObstacles();
        int res = uniquePathsWithObstacles.uniquePathsWithObstacles(arr);
        System.out.println(res);

    }
}
