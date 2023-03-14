package Classcode;

/**
 * @author
 * @creat 2023-2-20
 *
 * 难度：很简单（双指针算法）
 *
 */
public class Code167 {
    public static void main(String[] args) {
        int[] numbers = {2,7,11,15};
        int target = 9;
        int[] ok = twoSum(numbers,target);
        for (int i : ok) {
            System.out.println(i);
        }
    }


    public static int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[2];

        int pre = 0,rear = numbers.length - 1;

        //因为数组是递增的，所以和大于目标的时候，尾指针往回走，小于目标的时候往前走，直到和为目标
        //而且题目设置了，一定会有解且不能重复元素，所以直接pre!=rear就好了
        while (pre!=rear){
            if(numbers[pre] + numbers[rear] == target){
                ans[0] = pre + 1;
                ans[1] = rear + 1;
                break;
            } else if(numbers[pre] + numbers[rear] >target){
                rear--;
            } else if (numbers[pre] + numbers[rear] < target) {
                pre++;
            }
        }

        return ans;
    }
}
