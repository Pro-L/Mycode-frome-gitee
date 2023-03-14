package Classcode;

import java.util.Arrays;

public class Code204 {
    public static void main(String[] args) {
        System.out.println(countPrimes(10));
    }

    public static int countPrimes(int n){
        boolean[] isprime = new boolean[n];
        Arrays.fill(isprime,true);

        //从2开始筛选，i*i一定不是素数，把他筛出去
        for (int i = 2; i< n; i++) {
            if(isprime[i]){
                for (int j = i * i; j < n; j+=i) {
                    isprime[j] = false;
                }
            }
        }

        //计算isprime数组里面有几个是true的元素
        int cout = 0;
        for (int i = 2; i < n; i++) {
            if(isprime[i]){
                cout++;
            }
        }
        return cout;
    }

}
