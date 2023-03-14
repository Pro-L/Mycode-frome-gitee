package Classcode;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author
 * @creat 2023--16
 *
 * 难度：中等偏难
 * 完成情况：看视频+自己理解写出
 *
 * 思路：每次考虑最小的气球，考虑最右点，此种贪心情况能射的最多
 *
 */
public class Code452 {
    public static void main(String[] args) {
        int[][] points = {{1, 2}, {3, 4}, {5, 6}, {7, 8}};
        int[][] points1 = {{10, 16}, {2, 8}, {1, 6}, {7, 12}};
        int[][] points2 = {{2, 3}, {2, 3}};
        System.out.println(findMinArrowShots(points));
        System.out.println(findMinArrowShots(points1));
        System.out.println(findMinArrowShots(points2));
    }

    public static int findMinArrowShots(int[][] points) {
        int count = 1;

        //贪心排序（按照活动排序）
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o1[1],o2[1]);
            }
        });

        //先考虑第一个射点，
        int shoot = points[0][1];

        for (int i = 1; i < points.length; i++) {
            //如果射点比下一个气球的左端点要大，就是可以射到，一直射下去
            if(shoot>=points[i][0])
                continue;
            //如果射不到了，就要重新射一支箭，再以这个气球的右端点为射点，一直射下去
            else {
                count++;
                shoot = points[i][1];
            }
        }

        return count;
    }

}
