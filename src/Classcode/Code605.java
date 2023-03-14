package Classcode;

/**
 * @author
 * @creat 2023-01-09
 *
 * 贪心算法：种花问题
 *
 */
public class Code605{
    public static void main(String[] args) {
        int[] flowered = {1,0,0,0,0,1};
        int n = 2;
        System.out.println(canPlaceFlowers(flowered,n));
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        boolean[] visit = new boolean[flowerbed.length];

        for (int i = 1; i < flowerbed.length; i++) {
            if (flowerbed[i - 1] == 0 && visit[i - 1] == false)
                visit[i] = true;
            else
                visit[i] = false;
        }

        for (int i = flowerbed.length - 2; i >=0 ; i--) {
            if (flowerbed[i + 1] == 0 && visit[i + 1] == false)
                visit[i] = true;
            else
                visit[i] = false;
        }


        int cout = 0;

        for (int i = 0; i < visit.length; i++) {
            if (visit[i] == true && flowerbed[i] == 0)
                cout++;
        }

        System.out.println(cout);
        return (n<=cout);
    }
}
