package day10.school;

import java.util.Scanner;

public class Exam {


    public static void main(String[] args) {


        Subject[] subjects = new Subject[2];

        Scanner sc1 = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        Scanner in = new Scanner(System.in);

        System.out.println("What is your name?");
        String student = in.nextLine();
        System.out.printf("  %s", student );

        System.out.println(" your Roll Number is !");
        String rollNumber = in.nextLine();
        System.out.println(rollNumber);

        for (int i = 0; i < subjects.length; i++) {
            subjects[i] =new Subject();
            do {

                System.out.println("Please enter name of subject");
                String subjectName = sc1.nextLine();
                subjects[i].setName(subjectName);


                System.out.printf("Please enter the numbers obtained in %s \n ",subjectName);
                while (!sc.hasNextInt()) {
                    System.out.println("That's not a Number!");
                    sc.next();
                }
                subjects[i].setMarks(sc.nextInt());
            }
            while (subjects[i].getMarks() <= 0 || subjects[i].getMarks() > 100);
        }
        int totalMarksObtained = 0;
        for (Subject subject : subjects) {
            totalMarksObtained += subject.getMarks();
        }
        float percentage = ((totalMarksObtained) / (subjects.length * 100f)) * 100;
        System.out.printf(" Total Percentage obtain is : %5.2f", percentage);
    }
}
