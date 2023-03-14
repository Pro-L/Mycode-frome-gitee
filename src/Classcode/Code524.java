package Classcode;

import java.util.Arrays;
import java.util.List;

/**
 * @author
 * @creat 2023-2-25
 *
 * 思路：1.先判断字典里面的一个字符串是不是s的字串先
 *      2.如果是的话，比较t和答案ans的字母顺序
 *
 * 反思：没看清题目是子串，还以为是字母够了就行，就采用字典记录字母个数
 *
 * 题型：双指针+贪心算法
 *
 */
public class Code524 {
    public static void main(String[] args) {
        String s = "abpcplea";
        List<String> dictionary = Arrays.asList("ale","apple","monkey","plea");

        System.out.println(findLongestWord(s, dictionary));

    }

    public static String findLongestWord(String s, List<String> dictionary) {
        String ans = "";

        for (String t : dictionary) {
            //第一步，先筛选出字典中的每一个t是否是s的子串
            int i = 0,j = 0;
            while (i<s.length() && j<t.length()){
                if(s.charAt(i)==t.charAt(j)) j++;
                i++;
            }

            //当匹配上,也就是刚好等于t的长度的时候
            if(j==t.length()){
                //如果没有答案，就直接赋值为答案
                if (ans.length()==0){
                    ans = t;
                }
                //如果t比原来的答案长，那就选择t
                else if (t.length()>ans.length()) {
                    ans = t;
                }
                //如果t和原来的长度一样长，那就逐个开始比较字母
                else if (t.length()==ans.length()) {
                    for (int k = 0; k < t.length(); k++) {
                        if(t.charAt(k)!=ans.charAt(k)) {
                            //当t其中的某一个字母的ascii码的数值比ans要小的时候，就采用t
                            ans = (int) ans.charAt(k) > (int) t.charAt(k) ? t : ans;
                            break;
                        }
                    }
                }
            }
        }
        
        return ans;
    }
}
