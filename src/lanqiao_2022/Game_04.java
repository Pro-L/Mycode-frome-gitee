package lanqiao_2022;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 完成情况：已经完成
 * 
 * 12 10 15 20 6
 * 
 */

public class Game_04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] chengji = new int[n];
		
		for (int i = 0; i < n; i++) {
			chengji[i] = scan.nextInt();
		}
		
		Arrays.sort(chengji);
		
		int sign = 0;
		for (int i = 0; i < chengji.length - 1; i++) {
			sign = ((chengji.length - i )/ 2);
			if(chengji[i]>=chengji[sign]) System.out.println(0);
			else System.out.println(chengji[sign]  - chengji[i] + 1);
		}
		
	}
}
