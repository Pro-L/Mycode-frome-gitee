package Classcode;

/**
 * @author
 * @creat 2023-3-01
 *
 * 思路：一定要找到一个check()判断条件，只满足其中一个区间
 *
 *      如   3,4,5
 *                      1,2
 *          端点是1，目标是第二段，第二段独有的性质是，任意一个数都比2小，这个性质是第二段独有的
 *
 */
public class Code153 {
    public static void main(String[] args) {
        int[] nums = {3,4,5,1,2};
        System.out.println(findMin(nums));
    }
    public static int findMin(int[] nums) {
        int l = 0,r = nums.length - 1,mid;

        while (l<r){
            mid = l + r >> 1;
            if(nums[mid] <= nums[nums.length -1])  r = mid;
            else l = mid + 1;
        }

        return nums[r];
    }
}
