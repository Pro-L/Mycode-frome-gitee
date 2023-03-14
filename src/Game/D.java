package Game;


import java.util.Scanner;

public class D {
    public static void main(String[] args){
        int n;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = "No";
        }

        for (int i = 0; i < n; i++) {
            int c = scan.nextInt();
            for (int j = 1; j < c; j++) {
                double a = Math.sqrt(c*c-j*j);
                String s = String.valueOf(a);
                int index=s.indexOf(".");
                if (s.length()==index+2) {
                    str[i] = "Yes";
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(str[i]);
        }


    }
}
