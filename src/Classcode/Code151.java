package Classcode;

public class Code151 {
    public static void main(String[] args) {
        String s = "   a good   example";
        System.out.println("反反转前" + s);
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        int lefe = 0,right = s.length() - 1;

        //减去两端空格
        while (s.charAt(lefe)==' '){
            lefe++;
        }

        while (s.charAt(right)==' '){
            right--;
        }

        String a = new String();

        for (int i = lefe; i < right + 1; i++) {
            a += s.charAt(i);
        }
        s = "";

        //处理中间中间的空格
        String b = "";
        int p = 0,cout = 0;
        while (p<a.length()){
            if(a.charAt(p)!=' '){
                b += a.charAt(p);
                p++;
            } else if (a.charAt(p)==' ') {
                if(a.charAt(p +1)!=' '){
                    b += " ";
                    cout++;
                }
                p++;
            }
        }


        //反向输出
        a = "";
        a +=" ";
        a = a + b;
        b = "";
        int index = a.length() - 1;
        //从空格到最后一个字母截取，但是数组头部会多一个空格
        for (int i = a.length() - 1; i >=0 ; i--) {
            if(a.charAt(i)==' '){
                for (int j = i; j <= index; j++) {
                    b += a.charAt(j);
                }
                index = i - 1;
            }
        }
        //去除数组头部的空格
        s = "";
        for (int i = 1; i < b.length(); i++) {
            s += b.charAt(i);
        }


        return s;
    }
}