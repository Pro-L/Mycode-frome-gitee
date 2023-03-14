package Classcode;

import java.util.Arrays;

/**
 * @author
 * @creat 2022-11-21
 *
 * 吃饼干问题：贪心算法
 * 自主完成，简单
 *
 */
public class Code455 {
    public static void main(String[] args) {
        int[] arr = {1,2};
        int[] arr1 = {1,2,3};
        System.out.println(findContentChildren(arr, arr1));
    }

    public static int findContentChildren(int[] g, int[] s) {
        int sum = 0;
        int pre = 0;

        //对数组进行升序处理
        Arrays.sort(g);
        Arrays.sort(s);

        //开始分饼干
        for (int i = 0; i < g.length; i++) {

            for (int j = pre; j < s.length; j++) {
                if(g[i]<=s[j]){
                    sum++;
                    pre = j + 1;
                    break;
                }
            }
            if (s.length>0&&g[i]>s[s.length - 1]) return sum;
        }

        return sum;
    }
}
