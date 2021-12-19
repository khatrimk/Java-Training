package day13;

import java.util.Date;

public class ObjectClassTest {

    public static void main(String[] args) {
        Student student1 = new Student(1,"ABC");
        Student student2 =new Student(1,"ABCD");

        System.out.println(student1.toString());
        System.out.println(student2.toString());



        System.out.println (student1.equals(student2));


        Date date = new Date();
        System.out.println(date);




    }
}
