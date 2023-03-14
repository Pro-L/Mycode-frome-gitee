package Classcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author
 * @creat 2023--18
 *
 * 难度：简单
 * 完成情况：自主完成，参考结尾，结尾判断返回值和字符串长度非常巧妙
 *
 */
public class Code409 {
    public static void main(String[] args) {
        String s = "abccccdd";
        System.out.println(longestPalindrome(s));
    }

    public static int longestPalindrome(String s) {
        int ans = 0;
        Map map = new HashMap();

        //统计字符串里各个字符出现的次数
        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);

            //map里没有字母
            if (map.containsKey(temp)==false){
                map.put(temp,1);
            }
            //map里有该字母
            else if (map.containsKey(temp)==true){
                map.put(temp,(int)map.get(temp) + 1);
            }
        }

        //为偶数直接加，为奇数-1再加（1）的情况也无所谓，最后来处理
        for (Object a:map.values()) {
            if((int)a%2==0){
                ans += (int)a;
            }else {
                ans += (int)a - 1;
            }
        }

        //这一步非常巧妙，当答案短于字符串长度的时候，肯定有一个奇数个数的字母，返回值再+1便可
        if (ans<s.length()) return ans + 1;
        return ans;
    }
}
