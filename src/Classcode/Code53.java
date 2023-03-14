package Classcode;

/**
 * @author
 * @creat 2023-3-04
 *
 * 情况：刚入门，一知半解，动态规划
 */
public class Code53 {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
        int res = Integer.MIN_VALUE,last = 0,now;

        for (int i = 0; i < nums.length; i++) {
            now = Math.max(last,0) + nums[i];
            res = Math.max(res,now);
            last = now;
        }
        return res;
    }
}
