package day14;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>(15);
        students.add(new Student(1,"ABC"));
        students.add(new Student(2,"ABCD"));
        students.add(new Student(3,"ABCDE"));
        students.add(new Student(4,"ABCR"));
        students.add(new Student(5,"ABCF"));
        students.add(new Student(6,"ABCF"));


        //add new data in middle
        students.add(1, new Student(7,"ABCFW"));

        System.out.println(students);

        //set and replace new data
        students.set(1,new Student( 8,"ASDF"));
        System.out.println(students);

        //adding one list in another list
        ArrayList<Student> students1 = new ArrayList<>(15);


        //"add "is for adding single data  ,
        // "addall" is use for copy whole list to another.
        // note: both list should be same type of list

        students1.addAll(students);
        System.out.println(students1);


        //checking changes on list between students and students1 ,while adding in list
        students1.add(1,new Student(9,"ASDFGH"));

        System.out.println(students1);
        System.out.println(students);
        //changes will appear only in one list when we use:addAll
        //if we use ; = (students = students1) then change will appear on both list


        //data remove using index
        students.remove(0);
        System.out.println(students);

        //data remove using object
        students.remove(new Student(8,"ASDF"));
        System.out.println(students);

        //Getting data from array list
        Student abc = students1.get(5);
        System.out.println(abc);

    }



}
