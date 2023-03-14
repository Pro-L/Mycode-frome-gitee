package Classcode;


import java.util.HashMap;
import java.util.Map;

public class Code290 {
    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat dog";
        System.out.println(wordPattern(pattern, s));


    }

    public static boolean wordPattern(String pattern, String s) {
        boolean isture = true;
        String[] word = s.split(" ");

        if(word.length!=pattern.length()){
            isture = false;
        }

        Map<Object,Integer> map = new HashMap<>();


        //哈希MAP，通过put方法把元素放到哈希MAP中去，并返回他的val值，如果两个都没添加过的话
        //返回null，两个都是null或者数值相同，说明关系一一对应了
        for (int i = 0; i < pattern.length(); i++) {
            if(map.put(pattern.charAt(i),i)!=map.put(word[i],i)){
                isture = false;
            }
        }

        return isture;
    }
}
