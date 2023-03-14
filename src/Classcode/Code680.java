package Classcode;

/**
 * @author
 * @creat 2023-2-25
 *
 * 难度：中等，难点在于递归查询剩下的子串是否为回文字符串
 * 提示：因为只能删除一个字母，所以当两边不满足的时候，递归判断一次(pre + 1,rear)或者是(pre,rear - 1)
 *      当两者之一满足回文的时候，就可以返回正确了
 *
 * 类型：双指针 + 递归一次调用
 *
 */
public class Code680 {
    public static void main(String[] args) {
        String s = "ececabbacec";
        System.out.println(validPalindrome(s));
    }

    public static boolean validPalindrome(String s) {
        //转化为数组，操作更加方便
        char[] chars = s.toCharArray();

        int pre = 0,rear = s.length() - 1;

        while (pre<rear){
            if(chars[pre]==chars[rear]){
                pre++;
                rear--;
            } else {
                boolean check1 = check(chars,pre + 1,rear);
                boolean check2 = check(chars,pre,rear - 1);


                //当出现两边不相等的时候，递归看(pre + 1,rear) 或者是(pre,rear - 1)满不满足答案，应为只删除一次
                //所以判断一次就可以了
                if(check1 == true || check2 == true) break;
                else return false;
            }
        }

        return true;
    }

    public static boolean check(char[] chars,int pre,int rear){
        while (pre<rear){
            if (chars[pre]!=chars[rear]) return false;
            else {
                pre++;
                rear--;
            }
        }

        return true;
    }
}
