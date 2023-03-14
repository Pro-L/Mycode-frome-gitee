package Classcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author
 * @creat 2023-3-13
 *
 * 提示：1.map和set都可以完成此题，鉴于不能放重复元素，其实set数据结构更合适
 *      2.map和set都可以识别字符串里面的内容，即使是new的不同的String对象，都可以读取里面的内容
 *
 */
public class Code929 {
    public static void main(String[] args) {
        String[] strings = {"a@leetcode.com","b@leetcode.com","c@leetcode.com"};
        System.out.println(numUniqueEmails(strings));
    }

    public static int numUniqueEmails(String[] emails) {
//        Map<String,Integer> map = new HashMap<String, Integer>();
        Set<String> set = new HashSet<String>();

        for (String s : emails) {
            //定位@符号的位置，将字符串分割成前后两段，前段为用户名，后为网址段
            int sign1 = 0;
            while (sign1 < s.length() && s.charAt(sign1) != '@') sign1++;
            String firstString = s.substring(0,sign1);

            //处理用户名段＋号的问题，遇到加号就把后面的不要了
            int signPlus = 0;
            while (signPlus < firstString.length() && s.charAt(signPlus) != '+') signPlus++;
            firstString = firstString.substring(0,signPlus);

            //处理.号的问题
            int begin = 0;
            int signPoint = 0;
            String tempt = "";
            //定位.号的位置，把点号前的都截取下来
            while (signPoint < firstString.length()){
                while (signPoint < firstString.length() && firstString.charAt(signPoint) != '.') signPoint++;
                tempt += firstString.substring(begin,signPoint);
                begin = ++signPoint;    //这个++signPoint很有趣，如果是+1，就会出现后来是begin=5，end=4这种情况了
                //必须先更新signPoint的状态先再赋值
                if (begin > firstString.length()) break;
            }

            //得到总和String，加入到set中，用map也可以
            tempt += s.substring(sign1,s.length());
//            if (map.containsKey(tempt)==false) map.put(tempt,1);
            set.add(tempt);
        }

        //这道题用set更合适
        return set.size();
//        return map.size();
    }
}
