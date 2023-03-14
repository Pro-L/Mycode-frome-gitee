package Classcode;

/**
 * @author
 * @creat 2023-3-05
 /*
 * 题目解析：https://www.bilibili.com/video/BV1Mg411q7YJ/?spm_id_from=333.788&vd_source=a7380ff67911c9605d22a728f54ba8de
 * 理解情况：大概可以理解，状态转移方程有点难想
 *
 * 状态转移方程的理解 dp[i] = Math.max(j * (i - j)  , j * dp[i -j] )     dp[i] 表示数i拆后所成得到的最大值
 *         假设i为4，固定变量j，j先等于1
 *                        1  3  | 3又可以拆封 1 2 或者是 2 1，我们固定j，拆后面的数为dp[i- j],dp[i -j]就表示第二个数拆后相乘可以达到的最大值了
 *                                 这样我们就可以不漏任意一种情况而遍历所有拆分了。
 *                        2  2
 *                        3  1
 *
 */
public class Code343 {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(integerBreak(n));
    }

    public static int integerBreak(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;

        for (int i = 3; i <= n; i++) {
            for (int j = 1; j < i - 1; j++) {
                //这里因为j循环中，dp[i]的值不一定是答案，如当j = 1时，得到的dp
                //只是当前拆分循环中的最大而已，当j = 2时，可能结果就不一样了，所以省去
                //变量temple记录取得的最大值
                dp[i] = Math.max(Math.max(j*(i - j),j*dp[i - j]),dp[i]);
            }
        }

        for (int a : dp) {
            System.out.println(a);
        }

        return dp[n];
    }
}
