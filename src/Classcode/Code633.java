package Classcode;

/**
 * @author
 * @creat 2023-2-24
 *
 *   完成情况：独立完成，但是最后输入数据过大时，参考了别人用long长整形
 *   难度：容易，但是要更加快，最好是rear = Math.sqrt（c） 这样使计算的量得以减少
 *
 */
public class Code633 {
    public static void main(String[] args) {
        System.out.println(judgeSquareSum(1000000));
    }

    public static boolean judgeSquareSum(int c) {
        long pre = 0,rear = (long) Math.sqrt(c);

        while (pre<=rear){
            long ans = pre * pre + rear * rear;

            if(ans==c) return true;

            else if(ans>c) rear--;

            else if (ans<c) pre++;
        }


        return false;

    }
}
