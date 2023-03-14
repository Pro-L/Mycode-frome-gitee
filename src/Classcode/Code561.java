package Classcode;

import java.util.Arrays;

/**
 * @author
 * @creat 2023--18
 *
 * 难度：非常简单，
 * 思路：讲数组排序，最小的数和最大的数放在两端就好，贪心算法。
 * 思路2：更加贪心暴力，直接把数组下表为偶数的加起来就好
 */
public class Code561 {
    public static void main(String[] args) {
        int[] nums = {1,4,3,2};
        System.out.println(arrayPairSum(nums));
    }
    public static int arrayPairSum(int[] nums) {
        int sum = 0;

        Arrays.sort(nums);

        for (int i = 0; i < nums.length;i +=2 ) {
            sum += Math.min(nums[i],nums[i+1]);
        }

        /*     超级暴力算法
        for (int i = 0; i < nums.length;i +=2 ) {
            sum += nums[i];
        }

         */

        return sum;
    }
}
