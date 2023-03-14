package Game;

import java.math.BigInteger;
import java.util.Scanner;

class U {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            BigInteger a = scan.nextBigInteger();
            BigInteger b = scan.nextBigInteger();
            BigInteger res = a.add(b);
            System.out.println(res);
        }

    }
}
