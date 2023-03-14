package Game;


import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        List coll = new ArrayList();

        for (int i = 0; i < 10; i++) {
            coll.add(i);
        }

        coll.remove(1);

        System.out.println(coll.get(1));
    }
}
