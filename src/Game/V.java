package Game;


import java.util.Scanner;

public class V {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        //String[] s = new String[n];
        double x1,y1,x2,y2,x3,y3,x4,y4;
        double k1,k2;

        for (int i = 0; i < n; i++) {
            x1 = scan.nextDouble();
            y1 = scan.nextDouble();
            x2 = scan.nextDouble();
            y2 = scan.nextDouble();
            x3 = scan.nextDouble();
            y3 = scan.nextDouble();
            x4 = scan.nextDouble();
            y4 = scan.nextDouble();

            k1 = (y2 - y1)/(x2 - x1);
            k2 = (y4 - y3)/(x4 - x3);
            //**************************************平行
            if(k1==k2){
                //同一条直线
                if ((y1 - x1)==(y2 - x2)&&(y2 - x2)==(y3 - x3)&&(y3 - x3)==(y4 -x4)){
                    System.out.println("LINE");
                }
                //只是平行
                else {
                    System.out.println("NONE");
                }
            }

            //**************************************不平行
            if(k1!=k2){
                double x,y;
                y = ( (y1-y2)*(y4-y3)*x1 + (y4-y3)*(x2-x1)*y1 + (y2-y1)*(y4-y3)*x3 + (x3-x4)*(y2-y1)*y3 ) / ( (x2-x1)*(y4-y3) + (y1-y2)*(x4-x3) );
                x = (x2- x1) * (y - y1) / (y2 - y1) + x1;

                String resultx = String.format("%.2f",x);
                String resulty = String.format("%.2f",y);
                System.out.println("POINT" + " " + resultx + " " + resulty);
            }

        }

    }
}
