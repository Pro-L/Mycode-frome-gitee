package Classcode;

/**
 * @author
 * @creat 2023-3-04
 */
public class Code509 {
    public static void main(String[] args) {
        int a = 3;
        System.out.println(fib(a));
    }

    public static int fib(int n) {
        if(n<=1) return n;
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}
