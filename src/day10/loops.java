package day10;

import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        int[] marks = new int[3];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < marks.length; i++) {
            do {
                System.out.println("Please enter the numbers obtained !");
                while (!sc.hasNextInt()) {
                    System.out.println("That's not a Number!");
                    sc.next();
                }
                marks[i] = sc.nextInt();
            }
            while (marks[i] <= 0 || marks[i] > 100);
        }
        int totalMarksObtained = 0;
        for (int mark : marks) {
            System.out.printf(" Marks : %d", mark);
            totalMarksObtained +=mark;
        }
        float percentage = ((totalMarksObtained)/(marks.length * 100f))*100;
        System.out.printf(" Total Percentage : %5.2f", percentage);
    }



    }