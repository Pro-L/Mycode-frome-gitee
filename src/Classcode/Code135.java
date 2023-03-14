package Classcode;

import java.util.Arrays;

/**
 * @author
 * @creat 2022-11-26
 *
 *  分糖果问题：贪心算法
 *
 */
public class Code135 {
    public static void main(String[] args) {
        int[] a = {1,3,2,2,1};
        System.out.println(candy(a));
    }
    public static int candy(int[] ratings) {
        //用数组candy记录糖果的数量
        int[] candy = new int[ratings.length];
        Arrays.fill(candy,1);

        //从1开始，每个元素和左边比较，如果比左边的分数高，且糖果数比左边小的时候，永远比左边大1
        for (int i = 1; i < ratings.length ; i++) {
            if(ratings[i] > ratings[i - 1] && candy[i] <= candy[i - 1]){
                candy[i] = candy[i - 1] + 1;
            }
        }

        //从倒数第二个元素开始比较，如果他比右边的大，且糖果数又比右边的小的时候，永远比右边大1
        for (int i = ratings.length - 2; i >=0 ; i--) {
            if(ratings[i] > ratings[i + 1] && candy[i] <= candy[i + 1]){
                candy[i] = candy[i + 1] + 1;
            }
        }

        int sum = 0;
        for (int a:candy) {
            sum += a;
        }

        return sum;
    }
}
