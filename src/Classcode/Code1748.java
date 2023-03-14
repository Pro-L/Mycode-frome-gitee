package Classcode;

import java.util.HashMap;

public class Code1748 {
    public static void main(String[] args) {
        int[] num = {1,2,3,2};
        System.out.println(sumOfUnique(num));
    }

    public static int sumOfUnique(int[] nums) {
        int sum = 0;
        HashMap<Character,Integer> map = new HashMap<>();


        Integer a = 0;
        map.put((char)nums[0],a);
        for (Integer i = 1; i < nums.length; i++) {
            if (map.put((char)nums[i],i)!=null){

            }
        }


        return sum;
    }
}

