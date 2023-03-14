package Game;


import java.util.Scanner;

public class W {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = "";

        //分选
        int gcout = 0,dcout = 0,ucout = 0,fcout = 0,ecout = 0;
        for (int i = 0; i < a.length(); i++) {
            char jj = a.charAt(i);
            if(jj=='G'||jj=='g'){
                gcout++;
            }

            if (jj=='D'||jj=='d'){
                dcout++;
            }

            if (jj=='U'||jj=='u'){
                ucout++;
            }

            if (jj=='F'||jj=='f'){
                fcout++;
            }

            if(jj=='E'||jj=='e'){
                ecout++;
            }
        }

        int all = gcout + dcout + ucout + fcout + ecout;
        for (int i = 0; i < all; i++) {
            if(gcout!=0){
                b += "G";
                gcout--;

                if(dcout!=0){
                    b +="D";
                    dcout--;
                }

                if(ucout!=0){
                    b +="U";
                    ucout--;
                }

                if(fcout!=0){
                    b +="F";
                    fcout--;
                }

                if(ecout!=0){
                    b +="E";
                    ecout--;

                }
                continue;
            }

            if(dcout!=0){
                b +="D";
                dcout--;
                if(ucout!=0){
                    b +="U";
                    ucout--;
                }

                if(fcout!=0){
                    b +="F";
                    fcout--;
                }

                if(ecout!=0){
                    b +="E";
                    ecout--;

                }
                continue;
            }

            if(ucout!=0){
                b +="U";
                ucout--;
                if(fcout!=0){
                    b +="F";
                    fcout--;
                }

                if(ecout!=0){
                    b +="E";
                    ecout--;

                }
                continue;
            }

            if(fcout!=0){
                b +="F";
                fcout--;
                if(ecout!=0){
                    b +="E";
                    ecout--;

                }
                continue;
            }

            if(ecout!=0){
                b +="E";
                ecout--;
               continue;
            }
        }

        System.out.println(b);
    }
}
