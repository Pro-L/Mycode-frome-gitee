package Classcode;

/**
 * @author
 * @creat 2023-3-02
 */
public class Code33 {
    public static void main(String[] args) {
        int[] nums = {4,5,6,0,1,2};
        int target = 0;
        System.out.println(search(nums, target));
    }

    public static int search(int[] nums, int target) {
        int l = 0,r = nums.length - 1,mid;

        while (l<r){
            mid = l + r >> 1;
            if(nums[mid]<=nums[nums.length - 1]) r = mid;
            else l = mid + 1;
        }

        if(r==0) return check(nums,0, nums.length - 1, target);
        else if (target>nums[nums.length -1]) {
            return check(nums,0,r - 1,target);
        }
        else return check(nums,r,nums.length - 1,target);
    }

    public static int check(int[] nums,int l,int r,int target){
        int mid;
        while (l<r){
            mid = l + r >> 1;
            if(nums[mid]>=target) r = mid;
            else l = mid + 1;
        }
        if(nums[r]==target) return r;
        return -1;
    }
}
