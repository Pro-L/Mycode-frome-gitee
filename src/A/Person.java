package A;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author
 * @creat 2023-01-09
 */
public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Runtest{
    public static void main(String[] args) {
        Person a = new Person("aa",10);
        Person b = new Person("bb",20);

        Person[] list = {b,a};

        System.out.println("比较前的list是");
        for (Person i: list) {
            System.out.println(i.name + "的年龄是：" + i.age);
        }

        Arrays.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.age - o2.age;
            }
        });

        System.out.println("比较后的list是");
        for (Person i: list) {
            System.out.println(i.name + "的年龄是：" + i.age);
        }
    }
}
