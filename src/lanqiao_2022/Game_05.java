package lanqiao_2022;

import java.math.BigInteger;

import javax.naming.StringRefAddr;

public class Game_05 {
	public static void main(String[] args) {
		int k = 5;
		int ok = -1;

		
		BigInteger last = new BigInteger("1");
		BigInteger ans = new BigInteger("1");
		
		for (int i = 2; i <= Integer.MAX_VALUE; i++) {
			ans = last.multiply(BigInteger.valueOf(i));
			last = ans;
			
			String string = ans.toString();
			int sign = 0;
			for (int j = string.length() - 1; j > 0; j--) {
				if(string.charAt(j)!='0') {
					sign = j;
					break;
				}
			}
		
			//看一下结尾有几个0
			if(string.length() - sign - 1 == k) {
				System.out.println(i);
				break;
			}
			else if(string.length() - sign > k){
				System.out.println(-1);
				break;
			}
		}
	}
}
