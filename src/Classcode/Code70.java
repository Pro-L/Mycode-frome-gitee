package Classcode;

/**
 * @author
 * @creat 2022--14
 *
 * 动态规划问题：走楼梯
 */


//回溯花费时间太大
/*public class Code70 {
    public static void main(String[] args) {
        long star = System.currentTimeMillis();
        int sum = 0;
        int n = 45;
        sum = run(n);
        System.out.println(sum);
        long end = System.currentTimeMillis();
        System.out.println("程序运行使用了：" + (end - star) + "ms");
    }

    public static int run(int n){
        if(n==0||n==1) return 1;

        return run(n-1) + run(n - 2);
    }

}
*/

public class Code70 {
    public static void main(String[] args) {
        System.out.println(climbStairs(4));
    }
    public static int climbStairs(int n) {
        int first = 1,second = 2,sum = 0;

        if (n==0) return 0;
        if (n==1) return first;
        if (n==2) return second;

        for (int i = 3; i <=n ; i++) {
            sum = first + second;
            first = second;
            second = sum;
        }

        return sum;
    }
}















