package Game;

import java.util.Scanner;

public class QQ {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int c,sum = 0;
        for(int a = 0; a <= 50; a++)
            for(int b = 0; b <= 50; b++){
                c = a + b;
                if (getnum(a) + getnum(b) + getnum(c) == n - 4 ) {
                    sum++;
                }
            }
        System.out.println(sum);
    }

    public static int getnum(int x){
        //用来记录0~9每个数字所需的火柴数
        int a[] = {6,2,5,5,4,5,6,3,7,6};
        int num = 0;

        while(x/10 != 0){
            int linshi= x % 10;
            num += a[linshi];
            x = x/10;
        }

        num += a[x];
        return num;
    }
}
