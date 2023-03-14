package Classcode;

/**
 * @author
 * @creat 2023-3-04
 */
public class Code62 {
    public static void main(String[] args) {
        int m = 3;
        int n = 7;
        System.out.println(uniquePaths(m, n));
    }

    public static int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];

        //第一行全部初始化为1
        for (int i = 0; i < n; i++) dp[0][i] = 1;
        //第一列全部初始化为1
        for (int i = 0; i < m; i++) dp[i][0] = 1;

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i -1][j] + dp[i][j - 1];
            }
        }

        return dp[m - 1][n - 1];
    }
    public static void show(int[][] dp,int m,int n){
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(dp[i][j] + "");
            }
            System.out.println();
        }
    }
}
