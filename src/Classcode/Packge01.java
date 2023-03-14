package Classcode;

import java.security.PublicKey;

public class Packge01 {
	public static void main(String[] args) {
		int[] weigth = new int[3];
		weigth[0] = 1;
		weigth[1] = 3;
		weigth[2] = 4;
		
		int[] value = new int[3];
		value[0] = 15;
		value[1] = 20;
		value[2] = 30;
		
		int item_num = 3;
		int bag_capacity = 4;
		
		
		int[][] dp = new int[item_num][bag_capacity + 1];
		
//		//初始化阶段
//		for (int i = 0; i < dp.length; i++)	dp[i][0] = 0;//背包容量为0的时候
//		for (int i = 0; i < dp[0].length; i++) {//第一行
//			 if(i>=weigth[0]) dp[0][i] = value[0];
//		}
//		
//		for (int i = 1; i < dp.length; i++) {
//			for (int j = 1; j < dp[0].length; j++) {
//				if(j>=weigth[i])
//					dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - weigth[i]]+ value[i]);
//				else dp[i][j] = dp[i -1][j];
//			}
//		}
//		
//		show(dp);
		
		int[] dp2 = new int[bag_capacity + 1];
		for (int i = 0; i < weigth.length; i++) {
			for (int j = bag_capacity; j >= weigth[i]; j--) {
				dp2[j] = Math.max(dp2[j], dp2[j - weigth[i]] + value[i]);
				show2(dp2);
			}
		}
		

		
	}

//--------------------------------------------------------------------//
	public static void show(int[][] dp) {
		int m = dp.length;
		int n = dp[0].length;
		
		for (int i = 0; i < dp.length; i++) {
			for (int j = 0; j < dp[0].length; j++) {
				System.out.print(dp[i][j] + "");
			}
			System.out.println();
		}
	}
	
	private static void show2(int[] dp2) {
		for (int i : dp2) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
