package Game;

import java.util.Scanner;
class F {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        String[][] name = new String[n][2];

        //************************************
        for (int i=0;i<n;i++){
            name[i][0] = scan.next();
            name[i][1] = scan.next();
        }


        //************************************
        String[][] change = new String[1][1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n -1; j++) {
                if(Integer.parseInt(name[j][1])<Integer.parseInt(name[j+1][1])){
                    change[0] = name [j];
                    name[j] = name [j+1];
                    name[j+1] = change[0];
                }
            }
        }

        //************************************
        for (int i = 0; i < n; i++) {
            System.out.print(name[i][0]+" ");
            System.out.println(name[i][1]);
        }
    }
}

