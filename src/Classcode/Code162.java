package Classcode;

/**
 * @author
 * @creat 2023-3-03
 *
 * 二段性：前一段斜率大于0，后一段斜率小于0
 *
 */
public class Code162 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(findPeakElement(nums));
    }

    public static int findPeakElement(int[] nums) {
        if(nums.length==1) return 0;

        int l = 0,r = nums.length - 1,mid;


        while (l<r){
            mid = l + r >> 1;
            if(nums[mid]<=nums[mid+1]) l = mid + 1;
            else r = mid;
        }
        return r;
    }
}
