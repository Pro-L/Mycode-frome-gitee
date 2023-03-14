package Game;


import java.util.Scanner;

class H {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cishu = scan.nextInt();
        int n,m,r,c,rd,cd;
        int time = 0;
        int x = 1,y = 1;

        for (int i = 0; i < cishu; i++) {
                n = scan.nextInt();
                m = scan.nextInt();
                r = scan.nextInt();
                c = scan.nextInt();
                rd = scan.nextInt();
                cd = scan.nextInt();

                //直接就扫中了
                if(r==rd||c==cd){
                    time = 0;
                }

                //没有直接扫中
                else {
                    for (int k = 0; k < 100000; k++) {
                        //等于边界时，这样移动
                        if (r==1){
                            x = Math.abs(x);
                        } else if (r==n) {
                            x = -(x);
                        } else if (c==1) {
                            y = Math.abs(y);
                        } else if (c==m) {
                            y = -(y);
                        }

                        r = r + x;
                        c = c + y;
                        time++;

                        if(r==rd||c==cd){
                            break;
                        }

                    }


                }

            System.out.println(time);
            time = 0;
            x = 1;
            y = 1;
        }

        
    }
}
