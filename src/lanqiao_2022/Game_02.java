package lanqiao_2022;

/*
 * 完成情况：已经完成，答案	3138
 * 			参考了别人的部分思路和代码
 * 
 */

public class Game_02 {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 2022; i <= 2022222022; i++) {
			String s = String.valueOf(i);
			StringBuilder uns = new StringBuilder(s);
			
			//如果是回文数的话
			boolean istrue = true;
			
			if (s.compareTo(uns.reverse().toString())==0) {
				for (int j = 0; j < s.length() / 2; j++) {
					if(s.charAt(j)>s.charAt(j+1))
						istrue = false;
					}
				if(istrue) {
					count++;
					System.out.println(i);
				}
			}

		}
		System.out.println("统计完成-------------");
		System.out.println(count);
	}
}
