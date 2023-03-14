package Classcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author
 * @creat 2023-.-17
 * 
 *
 * 完成情况，借助别人的一点点思路独立完成，主要遇到的困难是循环的设计，有几次溢出的情况找不到原因，
 *          所幸最后都解决了，最开始是想借助新class记录每一个字母的起点和终点，但是发现这样做太费时费力，后改为直接
 *          搜索遍历找就好了。
 *
 * 题目难度：中等偏下
 *
 */
public class Code763ver2 {
    public static void main(String[] args) {
        String s = "jpsegvwolkpystd";
        partitionLabels(s);
    }

    public static List<Integer> partitionLabels(String s) {
        List<Integer> ans = new ArrayList<Integer>();

        //先锚定起点和终点
        int start = 0,end = getEnd(s,s.charAt(0));

        while (start<s.length()){
            end = getEnd(s,s.charAt(start));
            //遍历起点到终点的所有字母，当新的终点比原先的的终点大的时候，扩大终点的数值，直到再也没有比现有终点大的终点
            //的时候停止遍历
            for (int i = start + 1; i < end; i++) {
                int newend = getEnd(s,s.charAt(i));
                if(newend>end){
                    end = newend;
                }
            }

            //更新起点数据
            ans.add(end - start + 1);
            start = end + 1;
        }




        return ans;
    }

    public static int getEnd(String s,char a){
        for (int k = s.length() - 1; k >= 0; k--) {
            if(s.charAt(k)==a){
                return k;
            }
        }
        return 0;
    }
}
