package Classcode;

/**
 * @author
 * @creat 2022-\-10
 */
public class Code1827 {
    public static void main(String[] args) {
        int[] nums = {1,1,1};
        System.out.println(minOperations(nums));

    }

    public static int minOperations(int[] nums) {
        //********************************************
        // 如果数组长度为1，则为特殊情况，操作数为0步
        if (nums.length==1){
            return 0;
        }

        //********************************************
        //当数组长度不为0时间

        int cout = 0;   //计算操作的步数
        for (int i = 0; i < nums.length - 1; i++) {
            int temp = 0;

            //前一个比后一个大时，将前一个减去后一个并加上1，则为操作数
            if (nums[i]>=nums[i+1]){
                temp = nums[i] - nums[i+1] +1 ;
                nums[i+1] += temp;
            }
            cout += temp;
        }

        return cout;
    }
}
