package Classcode;

/**
 * @author
 * @creat 2022--17
 * 求2的幂数，有自己写的暴力算法和官方题解二分查找法，自己写的理解了，还差官方的解释没写没理解
 */
public class Code69 {
    public static void main(String[] args) {
        int x = 2147395600;
        System.out.println(mySqrt(x));
    }
    public static int mySqrt(int x) {
        //暴力破解法，已经理解
        long ans =  0;
        for (long i = 0; i < x; i++) {
            if(i*i<=x&&(i+1)*(i+1)>x){
                ans = i;
                break;
            }
        }
        return (int)ans;
    }

    public static int mySqrt1(int x) {
        //二分查找法，还没有理解
        int l = 0, r = x, ans = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if ((long) mid * mid <= x) {
                ans = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }
}
