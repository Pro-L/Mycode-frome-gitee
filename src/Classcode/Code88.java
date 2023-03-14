package Classcode;

/**
 * @author
 * @creat 2023-2-20
 *
 * 难度：中等，但是想不出来，参考别人的题解
 * 思路：比较个数组的数值，从尾部开始，然后复制到nums1最后面的0位置上
 *      情况1：nums2复制完了，此时结束，因为原本nums1已经排好顺序了
 *      情况2：nums2还没复制完，nums1已经复制完了，直接把剩余的nums2复制过去就好
 *
 * 更简易的思路：把nums1看作是一个空白的数组，比较两个数组，把最大的从尾部填充到空白数组nums1中
 *             因为是从尾部填充，所以不用担心原来nums1的数据被覆盖，用两个数组就直接实现了三个数组的才能解决的问题
 *
 */
public class Code88 {
    public static void main(String[] args) {
       int[] nums1 = {1,2,3,0,0,0};
       int[] nums2 = {2,5,6};
       int m = 3,n = 3;
       merge(nums1,m,nums2,n);

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        //指向空白0位置的尾部指针
        int tail = m-- + n-- - 1;

        while (m>=0 && n>=0){
            nums1[tail--] = nums1[m] > nums2[n] ? nums1[m--] : nums2[n--];
        }

        //情况2：
        while (n>=0){
            nums1[tail--] = nums2[n--];
        }
    }
}
