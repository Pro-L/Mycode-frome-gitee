package Classcode;

/**
 * @author
 * @creat 2023-3-09
 */
public class Code151_Version2 {
    public static void main(String[] args) {
        String s = "a";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        if(s==null||s.length()==0) return "";
        String ans = "";
        int pre = s.length() - 1,rear = s.length() - 1;

        while (pre>=0){
            while (rear>=0&&s.charAt(rear)==' ') rear--;
            pre = rear;
            while (pre>=0&&s.charAt(pre)!=' ') pre--;
            ans += s.substring(pre + 1,rear + 1) + " ";
            rear = pre;
        }

        rear = ans.length() - 1;
        while (ans.charAt(rear)==' ') rear --;

        return ans.substring(0,rear + 1);
    }
}
