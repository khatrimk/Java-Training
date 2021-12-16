package day9;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        System.out.println("What iS your name?");
//        String name = in.nextLine();
//
//        System.out.println("What is your address?");
//        String address = in.nextLine();
//
//        System.out.println("How old are you?");
//        int age = in.nextInt();
//
//        System.out.println("Enter Password");
//        var password = in.nextLine();
//
//        System.out.println("Name :" + name);
//        System.out.println("Address :" + address);
//        System.out.println("Age :" + age);
//        System.out.println("Password :" + password);

        System.out.println("What iS your name?");
        String name = in.nextLine();

        System.out.println("What is your address?");
        String address = in.nextLine();

        System.out.println("How old are you?");
        int age = in.nextInt();

        System.out.println("Enter Password");
        var password = in.nextLine();

        System.out.printf("Name : %s",  name);
        System.out.printf("Address : %s",  address);
        System.out.printf("Age : %d",  age);
        System.out.println("Password :" + password);
    }
}
