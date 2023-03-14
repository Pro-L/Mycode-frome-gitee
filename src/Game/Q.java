package Game;


import java.util.Scanner;

public class Q {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int c,sum = 0;

        for (int a = 0; a < 50; a++) {
            for (int b = 0; b < 50; b++) {
                c = a + b;
                if(getnum(a)+getnum(b)+getnum(c)==(n - 4)){
                    sum++;
                }
            }
        }

        System.out.println(sum);
    }

    public static int getnum(int a){
        int[] arr = {6,2,5,5,4,5,6,3,7,6};
        int res = 0;

        while (a/10!=0){
           int linshi = a % 10;
           res += arr[linshi];
           a = a / 10;
        }

        res += arr[a];

        return res;
    }

}
