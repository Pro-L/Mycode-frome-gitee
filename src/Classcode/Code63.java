package Classcode;

/**
 * @author
 * @creat 2023-3-05
 */
public class Code63 {
    public static void main(String[] args) {
       int[][] obstacleGrid = {{0,0},{1,1},{0,0}};

        System.out.println(uniquePathsWithObstacles(obstacleGrid));
    }

    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        //第一个就是障碍，好狗
        if(obstacleGrid[0][0]==1) return 0;
        int m = obstacleGrid[0].length;
        int n = obstacleGrid.length;

        int[][] dp = new int[n][m];

        //初始化dp数组的第一行和第一列
        dp[0][0] = 1;
        for (int i = 1; i < m; i++) {
            if(obstacleGrid[0][i]==0&&dp[0][i -1]==1) dp[0][i] = 1;
            else dp[0][i] = 0;
        }
        for (int i = 1; i < n; i++) {
            if(obstacleGrid[i][0]==0&&dp[i -1][0]==1) dp[i][0] = 1;
            else dp[i][0] = 0;
        }

//        show(dp,m,n);

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if(obstacleGrid[i][j]==1) dp[i][j] = 0;
                else dp[i][j] = dp[i-1][j]  + dp[i][j - 1];
            }
        }

//        show(dp,m,n);

        return dp[n - 1][m - 1];
    }

    public static void show(int[][] dp,int m,int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(dp[i][j] + "");
            }
            System.out.println();
        }
    }
}
