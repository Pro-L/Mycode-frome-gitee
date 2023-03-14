package Classcode;

/**
 * @author
 * @creat 2023-2-28
 *
 * 题目：旋转数组
 *
 */
public class Code81 {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1};
        int target = 2;
        System.out.println(search(nums, target));
    }

    public static boolean search(int[] nums, int target) {
        int l = 0,r = nums.length - 1,mid,tempt = nums[0];

        while (l<r){
            mid = l + r + 1 >> 1;
            if(nums[mid]>=tempt) l = mid;
            else r = mid - 1;
        }

        return ckeck(nums,0,r,target) || ckeck(nums,r + 1, nums.length - 1, target);
    }

    public static boolean ckeck(int[] nums,int l,int r,int target){
        if(nums.length==0) return false;

        while (l<r){
            int mid = l + r >> 1;
            if(nums[mid]<target) l = mid + 1;
            else r = mid;
        }

        if(nums[r]==target) return true;
        return false;
    }
}
