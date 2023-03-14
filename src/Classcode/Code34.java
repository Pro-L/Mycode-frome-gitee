package Classcode;

/**
 * @author
 * @creat 2023-2-27
 *
 * 难度：容易，前提是看了y总的视频
 * 提醒：二分的前提条件是把数组一分为二段，只有二段才能用二分，三段就不行了
 *
 */
public class Code34 {
    public static void main(String[] args) {
        int[]nums = {5,7,7,8,8,10};
        int target = 6;
        int[] ans = searchRange(nums,target);
        for (int a : ans) {
            System.out.println(a);
        }
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        if (nums.length == 0) return ans;

        int l = 0,r = nums.length - 1,mid;

        //先分段数组，确定我们的答案在右边的一段(先确定左边界)
        while (l<r){
            mid = (l + r) / 2;
            if(nums[mid]>=target) r = mid;
            else l = mid + 1;
        }

        //当最终目标不是target的时候，直接返回ans
        if(nums[r] != target) return ans;
        ans[0] = r;

        //重置l,r,mid
        l = r;
        r = nums.length - 1;

        //已经确认了左端点，现在只用确认右端点，将剩下的数组二分，我们想要的答案在左半段
        //左半段采用二分的第二种模式
        while (l<r){
            mid = l + r + 1 >> 1;
            if(nums[mid]<=target) l = mid;
            else r = mid - 1;
        }

        //再次确认右端点是否威target
        if(nums[r]!= target){
            ans[0] = -1;
            return ans;
        }

        ans[1] = r;
        return ans;
    }
}
