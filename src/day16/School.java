package day16;

import java.util.Arrays;

public class School {
    public static void main(String[] args) {
        Student student1 = new Student("ABC",5,04);
        Student student2 = new Student("XYZ",2,06);
        Student student3 = new Student("MAN",3,03);

        Student [] students = new Student[3];

        students[0] = student1;
        students[1] = student2;
        students[2]= student3;

        for (Student student: students ){
            System.out.println(student);
        }

        System.out.println("*******************");

        Arrays.sort(students);
        for(Student student: students){
            System.out.println(student);

        }

        System.out.println("*************");

        Teacher teacher1 = new Teacher("Ram",4000.1);
        Teacher teacher2 = new Teacher("SHYAM",8000.2);
        Teacher teacher3 = new Teacher("HARI",3000.3);

        Teacher[] teachers = new Teacher[3];

        teachers[0] = teacher1;
        teachers[1] = teacher2;
        teachers[2] = teacher3;

        for (Teacher teacher: teachers){
            System.out.println(teacher);
        }

        System.out.println("**************");

        Arrays.sort(teachers);
        for(Teacher teacher : teachers){
        System.out.println(teacher);
        }
    }


}
