package lanqiao_2022;

import java.util.HashMap;
import java.util.Map;

/*
 * 完成情况：已经完成
 * 
 */

public class Game_03 {
	public static void main(String[] args) {
		String string = "AAAABBBBCC";
		String string2 = null;
		show(string);
		show(string2);
	}
	
	public static void show(String string) {
		//考虑string为空的情况
		if(string==null||string.length()==0) {
			System.out.println("");
			return;
		}
		
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for (int i = 0; i < string.length(); i++) {
			char a = string.charAt(i);
			if(map.containsKey(a)==false) {
				map.put(a,1);
			}else {
				map.put(a, map.get(a) + 1);
			}
		}
		
		System.out.println(map);
		int max = 0; 
		
		for (Integer a : map.values()) {
			if(a>=max) max = a; 
		}
		
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if(entry.getValue()==max) System.out.print(entry.getKey());
		}
	}
}
