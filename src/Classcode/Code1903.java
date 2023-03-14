package Classcode;

/**
 * @author
 * @creat 2022--10
 */



//子字符串中最大奇数：1.如果该字符串中一个奇数都没有，他的子字符串中不可能出现奇数
//                2.如果存在奇数，那么从尾部开始扫描，扫描到有奇数出现的话，他的最大
//                  子字符串中最大的奇数一定是从【0，i】


public class Code1903 {
    public static void main(String[] args) {
        String a = "35427";
        System.out.println(largestOddNumber(a));
    }

    public static String largestOddNumber(String num) {
        //判断有没有奇数
        boolean have = false;

        int i = 0;
        for (i = num.length() - 1; i >= 0 ; i--) {
            //从最后开始扫描，如果扫描到奇数，记录他的位置
            if (num.charAt(i)%2!=0){
                have = true;
                break;
            }
        }

        if (have==true){
            return num.substring(0,i + 1);
        }else {
            return "";
        }

    }
}
