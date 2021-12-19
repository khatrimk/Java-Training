package day14;

import java.util.ArrayList;

public class ObjectWrapperPractise {
    public static void main(String[] args) {
        ArrayList<Integer> ints = new ArrayList<>();


        ints.add(10);
        ints.add(20);
        ints.add(30);
        ints.add(40);

        System.out.println(ints);

        ints.add(2,110);
        System.out.println(ints);

        ints.set(3, 100);
        System.out.println(ints);

        ints.remove(0);
        System.out.println(ints);


        int x = ints.get(2);
        System.out.println(x);


        ArrayList<Integer> ints1 = new ArrayList<>();
        ints1.addAll(ints);
        System.out.println(ints1);

        ints1.add(90);
        System.out.println(ints1);

        int d = ints1.get(4);
        System.out.println(d);
//
        //using for loop

//        for (int i=0; i<ints.size(); i++) {
//            int d = ints.get(i);
//            System.out.println(d);


        for (int a : ints) {
            System.out.println(a);


        }

    }
}
