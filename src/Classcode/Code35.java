package Classcode;

/**
 * @author
 * @creat 2023-2-27
 *
 * 难度：中等偏下，但是对于初次接触二分算法，还是有一定的疑惑性，表现在当数组只有两个元素的时候
 *      一些细节部分，如>=漏了某个元素的时候，会出问题
 *
 */
public class Code35 {
    public static void main(String[] args) {
        int[] nums = {1,3};
        int target =3;
        System.out.println(searchInsert(nums, target));
    }
    public static int searchInsert(int[] nums, int target) {
        int pre = 0,rear = nums.length - 1,mid = 0;

        while (pre<rear){
            //二分
            mid = (pre + rear) / 2;

            //当元素相等的时候
            if(nums[mid]==target){
                return mid;
            }
            //当中间的纸大于目标的时候，rear往mid的后一位靠
            else if (nums[mid]>target) {
                if(mid - 1>0) rear = mid - 1;
                //特别注意，当数组只有两个数的时候，只能等于pre(mid-1就小于0了)
                //而pre = mid + 1就不会出现这种情况，无论怎么加都只会 <=rear
                else rear = pre;

                //还有一种解决方法,根据实际情况推算可以得出
                //rear = (pre + mid) / 2;
            }
            else if (nums[mid]<target) {
                pre = mid + 1;
            }
        }

        //跳出循环的时候，一定是pre和rear同时来到了最左端或者是最右端
        //此时判断他是大于还是小于，再返回下标就好
        if(nums[rear]<target) return rear + 1;
        else if (nums[rear]>=target) return rear;

        return mid;
    }
}
