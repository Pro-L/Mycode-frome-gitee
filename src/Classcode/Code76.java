package Classcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author
 * @creat 2023-2-22
 */
public class Code76 {
    public static void main(String[] args) {
        String s = "ADOBECODEBANC", t = "ABC";
        minWindow(s,t);
    }


    public static String minWindow(String s, String t) {
        Map<Character,Integer> map = new HashMap<Character,Integer>();

        for (int i = 0; i < t.length(); i++) {
            char temp = t.charAt(i);

            if (map.containsKey(temp)==false){
                map.put(temp,1);
            }else {
                map.put(temp,map.get(temp) + 1);
            }
        }


        int left = 0,right = 0;



        return null;
    }
}
