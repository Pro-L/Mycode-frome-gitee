package Game;


import java.util.Scanner;
class G {
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
                if (arr[i][j]!=0) {
                    resindex = find(arr[i][j], arr, i, j, n, m);
                    ok = (Math.abs(resindex[0] - i)) + (Math.abs(resindex[1] - j));
                    arr[resindex[0]][resindex[1]] = 0;
                }
            }
        }

        System.out.print(ok);
    }

    public static int[] find(int res,int[][] arr,int i,int j,int n,int m){
        int a = i,b = j;
        if(b<m){
            b++;
        }
        int[] index = new int[2];
        for (; a < n; a++) {
            for (; b < m; b++) {
                if(res==arr[a][b]&&arr[a][b]!=0){
                    index[0] = a;
                    index[1] = b;
                }
            }
        }

        return index;
    }

}