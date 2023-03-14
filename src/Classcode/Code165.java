package Classcode;

/**
 * @author
 * @creat 2023-3-13
 *
 * 反思：这道题很巧妙地运用了Interger.parseInt这一函数，将字符串转成字母
 *      省去自己写判断001和1是不是相同这一功能函数
 *
 *      另外：i==x ？ 0：。。。和j==y ？ 0：。。。这两个三目运算符用的好
 *      巧妙避免一个字符串的指针走到尾部的时候，出现溢出的情况，此时这个已经
 *      走完的字符串后的字母都应该是0了，非常巧妙
 *
 */
public class Code165 {
    public static void main(String[] args) {
        String version1 = "1.0", version2 = "1.0.1";
        System.out.println(compareVersion(version1, version2));
    }

    public static int compareVersion(String version1, String version2) {
        int i = 0,j = 0;
        int x = 0,y = 0;

        while (x < version1.length() || y < version2.length()){
            while (x < version1.length() && version1.charAt(x)!='.') x++;
            while (y < version2.length() && version2.charAt(y)!='.') y++;

            //这一步很关键，当某一个字符串走到尽头的时候，也就是i==x或者y==j的时候，赋值为0就好
            Integer a = i==x ? 0:Integer.parseInt(version1.substring(i,x));
            Integer b = y==j ? 0:Integer.parseInt(version2.substring(j,y));

            //用完记得更新开始坐标
            i = ++x;
            j = ++y;

            if(a>b) return 1;
            if(a<b) return -1;
        }

        return 0;
    }
}
