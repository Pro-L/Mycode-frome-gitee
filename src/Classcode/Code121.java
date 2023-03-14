package Classcode;

/**
 * @author
 * @creat 2023-2-20
 *
 *
 * 难度：中等难度
 * 完成情况：独立完成暴力算法，参考他人思路完成贪心算法
 *
 */
public class Code121 {
    public static void main(String[] args) {
        int[] prices = {7,6,4,3,1};
        System.out.println(maxProfit(prices));
    }


    public static int maxProfit(int[] prices) { //解法1.贪心算法
        int mini = prices[0];
        int maxprofit = 0;

        //每次都用现在的价格减去先前最低的价格，得出最大利润，于此同时，更新当前最低价格。
        for (int i = 1; i < prices.length; i++) {
            maxprofit = Math.max(maxprofit,prices[i] - mini);
            mini = Math.min(mini,prices[i]);
        }

        return maxprofit;
    }

    public static int maxProfit2(int[] prices){ //解法2.暴力破解
        int maxprice = 0;
        int profit = 0;

        for (int i = prices.length - 1; i >=0 ; i--) {
            for (int j = i - 1; j >=0 ; j--) {
                profit = prices[i] - prices[j];
                if (profit>maxprice)
                    maxprice = profit;
            }
        }

        return maxprice;
    }
}
