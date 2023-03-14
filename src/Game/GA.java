package Game;


import java.util.Scanner;

public class GA {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(),m = scan.nextInt();
        int ok = 0;
        //********************************************************
        int[][] arr = new int[n][m];
        //开始读取数据
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        //处理数据
        int[] resindex = new int[2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (int k = i; k < n; k++) {
                    for (int l = 0; l < m; l++) {
                        if (arr[i][j]==arr[k][l]&&i!=k&&j!=l&&arr[i][j]!=0&&arr[k][l]!=0){
                            ok = (Math.abs(l - j)) + (Math.abs(k - i));
                            arr[k][l] = 0;
                            arr[i][j] = 0;
                        }

                    }
                }
            }
        }

        System.out.print(ok);
    }


}
