package Classcode;

import java.util.*;

/**
 * @author
 * @creat 2023-3-09
 *
 * 本题主要考察哈希表的使用
 *
 */
public class Code49 {
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(strs));
    }


    //      用map来记录数据，超出时间限制
//    public static List<List<String>> groupAnagrams(String[] strs) {
//        List<List<String>> list = new ArrayList<List<String>>();
//        boolean[] hasvisit = new boolean[strs.length];
//
//        for (int i = 0; i < strs.length; i++) {
//            List<String> list1 = new ArrayList<String>();
//            Map<Character, Integer> map1 = new HashMap<Character, Integer>();
//            //没有访问过，就创建map记录字母的多少
//            if (hasvisit[i] == false) {
//                list1.add(strs[i]);
//                for (int j = 0; j < strs[i].length(); j++) {
//                    char a = strs[i].charAt(j);
//                    if (map1.containsKey(a) == false) {
//                        map1.put(a, 1);
//                    } else {
//                        map1.put(a, map1.get(a) + 1);
//                    }
//                }
//                hasvisit[i] = true;
//            }
//
//            for (int j = i + 1; j < strs.length; j++) {
//                if (hasvisit[j]==false){
//                    Map<Character, Integer> map2 = new HashMap<Character, Integer>();
//                    for (int k = 0; k < strs[j].length(); k++) {
//                        char a = strs[j].charAt(k);
//                        if (map2.containsKey(a) == false) {
//                            map2.put(a, 1);
//                        } else {
//                            map2.put(a, map2.get(a) + 1);
//                        }
//                    }
//                    if (map2.equals(map1)) {
//                        list1.add(strs[j]);
//                        hasvisit[j] = true;
//                    }
//
//                }
//
//            }
//            if(list1.size()!=0)list.add(list1);
//        }
//        return list;
//    }


    //测试二：超出时间限制，答案正确
//    public static List<List<String>> groupAnagrams(String[] strs) {
//        List<List<String>> list = new ArrayList<List<String>>();
//        boolean[] hasvisit = new boolean[strs.length];
//
//        for (int i = 0; i < strs.length; i++) {
//            List<String> minilist = new ArrayList<String>();
//            if (hasvisit[i]==false){
//                char[] tempt = strs[i].toCharArray();
//                Arrays.sort(tempt);
//                minilist.add(strs[i]);
//                hasvisit[i] = true;
//
//                for (int j = i + 1; j < strs.length; j++) {
//                    if (hasvisit[j]==false){
//                        char[] comp = strs[j].toCharArray();
//                        Arrays.sort(comp);
//                        if(compare(comp,tempt)){
//                            minilist.add(strs[j]);
//                            hasvisit[j] = true;
//                        }
//                    }
//                }
//
//            }
//            if (minilist.size()!=0) list.add(minilist);
//        }
//
//        return list;
//    }
//
//    public static boolean compare(char[] a,char[] b){
//        for (int i = 0; i < a.length; i++) {
//            if (a[i]!=b[i]) return false;
//        }
//        return true;
//    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String,ArrayList<String>> map = new HashMap<String, ArrayList<String>>();

        for (String s: strs) {
            char[] a = s.toCharArray();
            Arrays.sort(a);
            String key = String.valueOf(a);
            if(map.containsKey(key)==false) map.put(key,new ArrayList<String>());
            map.get(key).add(s);
        }

        return new ArrayList(map.values());
    }

}
