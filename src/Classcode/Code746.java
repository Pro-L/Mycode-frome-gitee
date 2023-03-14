package Classcode;

/**
 * @author
 * @creat 2022--21
 *
 * 最小爬楼梯耗费钱:动态规划
 *
 * 情况：1.第一个函数是上课的时候，不是很了解的情况下完成的
 *      2.第二个函数是自行学习的时候，了解到一点点dp思维完成的
 *
 */
public class Code746 {
    public static void main(String[] args) {
        int[] a = {10,15,20};
        //System.out.println(minCostClimbingStairs(a));
        System.out.println(miniCost(a));
    }

    public static int minCostClimbingStairs(int[] cost) {

        int n = cost.length;
        int[] dp = new int[n];
        dp[0] = cost[0];
        dp[1] = cost[1];

        for (int i = 2; i <n ; i++) {
            dp[i] = Math.min(dp[i - 1], dp[i - 2]) + cost[i];
        }
        return Math.min(dp[n-1],dp[n-2]);
    }

    public static int miniCost(int[] cost){
        if(cost.length==1||cost.length==0) return 0;

        int n = cost.length;
        int[] dp = new int[n];
        dp[0] = cost[0];
        dp[1] = cost[1];

        for (int i = 2; i < n ; i++) {
            dp[i] = Math.min(dp[i-1],dp[i-2]) + cost[i];
        }

        return Math.min(dp[n - 1], dp[n - 2]);
    }

}
