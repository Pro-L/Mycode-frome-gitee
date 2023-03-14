package Classcode;

/**
 * @author
 * @creat 2022--25
 */
public class Test {

    //map 里存放的 String 是new 的时候，只要里面的内容相等，都可以识别为相同
//    public static void main(String[] args) {
//        String s1 = new String("www");
//        String s2 = new String("www");
//
//
//        Map<String,Integer> map = new HashMap<String, Integer>();
//        if (map.containsKey(s1)==false) map.put(s1,1);
//        else map.put(s1,map.get(s1) + 1);
//        if (map.containsKey(s2)==false) map.put(s2,1);
//        else map.put(s2,map.get(s2) + 1);
//
//        System.out.println(map);
//    }
//-------------------------------------------------------------------------------

    public static void main(String[] args) {
        String s = "aaa";
        System.out.println(s.substring(0,s.length()));
    }
}
