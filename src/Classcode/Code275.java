package Classcode;

/**
 * @author
 * @creat 2023-3-03
 *
 * 二段性：右边这段的最左元素一定比其自身的值大于等于
 *
 */
public class Code275 {
    public static void main(String[] args) {
        int[] citations = {0,1,3,5,6};
        System.out.println(hIndex(citations));
    }

    public static int hIndex(int[] citations) {
        //考虑只有只有一个元素的情况
        if(citations.length==1){
            if(citations[0]>=1) return 1;
            else return 0;
        }

        int l = 0,r = citations.length - 1,mid;

        while (l<r){
            mid = l + r >> 1;
            //取右半部分，右半部分的最左元素，一定不小于（citation。length - 自身坐标）
            if(citations[mid]<(citations.length - mid)) l = mid + 1;
            else r = mid ;
        }

        //最后再判断下，边界的时候，是否比自身大于等于，不等就没戏
        if(citations[r]>=citations.length - r)return citations.length - r;
        return 0;
    }
}
