package Classcode;

/**
 * @author
 * @creat 2023-3-09
 *
 * 完成情况：看题解，了解思路
 * 值得改进的思想，多用指针去遍历，太喜欢用map记录了
 *
 */
public class Code38 {
    public static void main(String[] args) {
        System.out.println(countAndSay(4));
    }

    public static String countAndSay(int n) {
        String s = "1";

        String ns;
        for (int i = 2; i <= n; i++) {
            ns = "";
            //双指针j，k判断最长的连续字符串
            for (int j = 0; j < s.length();) {
                int k = j;
                while (k < s.length() && s.charAt(j) == s.charAt(k)) k++;
                ns += "" + (k-j) + s.charAt(j);
                j = k;
            }
            s = ns;
        }
        return s;
    }
}
