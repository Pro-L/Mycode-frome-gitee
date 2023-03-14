package Classcode;

/**
 * @author
 * @creat 2022--17
 */
public class Code231 {
    public static void main(String[] args) {
        int n = 30;
        System.out.println(isPowerOfTwo(n));

        System.out.println("***********************************");

        System.out.println(isPowerOfTwo1(n));
    }
    public static boolean isPowerOfTwo(int n) {
        //暴力破解算法
        if (n<=0){
            return false;
        }
        if (n==1){
            return true;
        }

        boolean istrue = true;

        while (istrue){
            if (n%2==0){
                n = n / 2;
                if (n==1) break;
            }else {
                istrue  = false;
            }
        }


        return istrue;
    }

    public static boolean isPowerOfTwo1(int n) {
        //题目中最大的2的幂是2的30次方，当n是他的因子的时候，肯定也是2的某次幂

        int BIG = 1<<30;

        return n>0&&BIG%n==0;
    }
}
