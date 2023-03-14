package Game;


import java.util.Scanner;

public class J {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n,nn;
        n = scan.nextInt();
        int[][] arr = new int[n][];
        String[] res = new String[n];
        for (int i = 0; i < n; i++) {
            res[i] = "No";
        }

        //读取键盘数据
        for (int i = 0; i < n; i++) {
            nn = scan.nextInt();
            arr[i] = new int[nn];
            for (int j = 0; j < nn; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int k = 0; k < getmax(arr[i]); k++) {
                int linshi = arr[i][0] % k;
                for (int j = 1; j < arr[i].length; j++) {
                    if (arr[i][j] % k != linshi){
                        break;
                    }
                }

            }
        }



    }


    public static int getmax(int[] a){
        int max = 0;
        for (int i = 0; i < a.length; i++) {
           if(a[i]>max){
               max = a[i];
           }
        }
        return max;
    }

}
