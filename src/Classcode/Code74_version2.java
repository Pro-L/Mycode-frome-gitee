package Classcode;

/**
 * @author
 * @creat 2023-3-01
 *
 * 反思：以前不懂这一类型题目得解法，看了y总的视频好多了
 *
 */
public class Code74_version2 {
    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7}, {10,11,16,20},{23,30,34,60}};
        int target = 3;
        System.out.println(searchMatrix(matrix, target));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==0) return false;

        int n = matrix[0].length,m = matrix.length;

        int l = 0,r = n * m - 1,mid;

        while (l<r){
            mid = l + r >> 1;
            //  mid/n可以得出y坐标，mid%n可以得出x坐标
            if(matrix[mid/n][mid%n]>=target) r = mid;
            else l = mid + 1;
        }

        if (matrix[r/n][r%n]==target) return true;
        return false;
    }
}
