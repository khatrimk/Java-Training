package day4;

import java.util.ArrayList;

public class College {

    public static void main(String[] args) {
        Teacher teacher = new Teacher();

        Student student = new Student();


        Person person = new Student();
        ((Student) person).getRollNumber();


        Person person1 = new Teacher();
        ((Teacher)person1).getSalary();
//        ((Student)person1).getRollNumber();

        ArrayList<Person> arrayList = new ArrayList<>();
        arrayList.add(new Student());
        arrayList.add(new Teacher());

        ArrayList<Student>arrayList1 = new ArrayList<>();
        arrayList.add(new Student());

        ArrayList<Teacher>arrayList2 = new ArrayList<>();
        arrayList.add(new Teacher());




    }
}
