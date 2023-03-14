package Classcode;

/**
 * @author
 * @creat 2022--01
 *
 * code74
 * 1。运用逐行逐列扫描的方式，当一列数的某一个小于目标值时，改为行扫描
 */
public class Code74 {
    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println(searchMatrix(matrix, 13));

    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        boolean isture = false;
        int m = matrix[0].length;
        int n = matrix.length;

        for (int i = n -1; i >=0 ; i--) {
            if (matrix[i][0]==target){
                isture = true;
            }

            if(matrix[i][0]<target){
                for (int j = 1; j < m; j++) {
                    if (matrix[i][j]==target){
                        isture = true;
                    }
                }
            }
        }

        return isture;
    }
}
