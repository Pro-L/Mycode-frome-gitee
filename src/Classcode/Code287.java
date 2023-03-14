package Classcode;

/**
 * @author
 * @creat 2023-3-04
 *
 * 完成情况：未完成，未理解
 *
 */
public class Code287 {
    public static void main(String[] args) {

    }
    public static int findDuplicate(int[] nums) {
        int n = nums.length - 1;
        int l = 0,r = nums.length - 1,mid,count = 0;

        while (l<r){
            mid = l + r >> 1;
            for (int x:nums) {
                if(x>=l&&x<=mid)
                    count++;
            }

            if(count>mid - l + 1) r = mid;
            else l = mid + 1;
        }
        return nums[r];
    }
}
