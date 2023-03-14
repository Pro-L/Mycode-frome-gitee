package Classcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author
 * @creat 2023-3-05
 *
 *
 *
 */
public class Code118 {
    public static void main(String[] args) {
        int numRows = 3;
        System.out.println(generate(numRows));

    }
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list0 = new ArrayList<List<Integer>>();
        list0.add(new ArrayList<Integer>(1));
        list0.get(0).add(1);

        for (int i = 1; i < numRows; i++) {
            List<Integer> list = new ArrayList<Integer>(i + 1);

            for (int j = 0; j <= i; j++) {
               if(j==0 || j== i) list.add(1);
               else list.add(list0.get(i - 1).get(j - 1) + list0.get(i - 1).get(j));
            }
            list0.add(list);
        }

        return list0;
    }
}
