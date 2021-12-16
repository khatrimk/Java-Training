package day10;

import java.util.Scanner;

public class ArraysAndLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maths = 0;
        do {
            System.out.println("Please enter the numbers obtained in maths");
            while (!sc.hasNextInt()) {
                System.out.println("That's not a Number!");
                sc.next();
            }
            maths = sc.nextInt();
        }
        while (maths <=0 || maths>100);

        int english = 0;
        do {
            System.out.println("Please enter the numbers obtained in English");
            while (!sc.hasNextInt()) {
                System.out.println("That's not a Number!");
                sc.next();
            }
            english = sc.nextInt();
        }
        while (english <=0 || english>100);


        int nepali = 0;
        do {
            System.out.println("Please enter the numbers obtained in Neapli");
            while (!sc.hasNextInt()) {
                System.out.println("That's not a Number!");
                sc.next();
            }
           nepali = sc.nextInt();
        }
        while (nepali <=0 || nepali>100);


        float percentage = ((maths+english+nepali)/300f)*100;
        System.out.printf("Total Percentage : %5.2f", percentage);

//        System.out.println("Thank you! Got "+ maths);


    }
}