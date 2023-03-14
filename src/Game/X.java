package Game;


import java.util.Scanner;

class X {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();

        char[] arr = s.toCharArray();

        int index1 = 0;
        while (arr[index1]=='0'){
            index1++;
        }

        int index2 = 0;
        if(s.contains(".")){
            index2 = s.indexOf(".");
        } else if (!s.contains(".")) {
            index2 = s.length();
        }

        for(int j = index1;j<index2;j++){
            System.out.print(arr[j]);
        }
    }
}
