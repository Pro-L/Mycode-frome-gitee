package lanqiao_2022;

import java.math.BigInteger;
/*
 * 题目：星期计算
 * 完成情况：完成，参考别人用的类
 * 
 */

public class Game_01 {
	public static void main(String[] args) {
		BigInteger a = new BigInteger("20");
		BigInteger ans = new BigInteger("1");
		BigInteger modBigInteger = new BigInteger("7");
		for (int i = 1; i <= 22; i++) {
			ans = ans.multiply(a);
		}
		ans = ans.mod(modBigInteger);
		System.out.println(ans);
	}
}
