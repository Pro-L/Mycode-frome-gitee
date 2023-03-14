package Classcode;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author
 * @creat 2022--11
 * 贪心算法题目：活动规划
 */
public class Code435 {
    public static void main(String[] args) {

        int[][] intervals = {{1,2},{2,3},{3,4},{1,3}};

        System.out.println(eraseOverlapIntervals(intervals));

    }

    public static int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length==0){
            return 0;
        }

        //讲活动结束时间排序，越早结束的时间就越要选择
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });

        int cout = 1;
        int pre = intervals[0][1];
        //计算有几个节点是合适不重叠的，吧合适的记录下来存在cout中
        for (int i = 1; i < intervals.length; i++) {
            if(intervals[i][0]>=pre){
                pre = intervals[i][1];
                cout++;
            }
        }

        //length - cout 的长度就是要删除去的长度
        return intervals.length - cout;
    }




}
