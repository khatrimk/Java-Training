package day9;

import java.util.Scanner;

public class Result {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int fullMark=100;
        int passMark = 40;
        int math = 40;
        int computer = 35;
        int nepali =80;
        int english = 35;
//        System.out.println(90% fullMark);

        if(math >=(90%  fullMark) ){
            System.out.println("A+");

        }else if (math>=(80%  fullMark)){
            System.out.println("A");
        } else if (math>=(60%fullMark)){
            System.out.println("B");
        } else if (math >=passMark){
            System.out.println("just Pass");
        }



        if(nepali >=(90%  fullMark) ){
            System.out.println("A+");

        } else if (nepali>=(80% fullMark)){
            System.out.println("A");
        }else if (nepali>=(60%fullMark)){
            System.out.println("B");
        } else if (nepali >=passMark){
            System.out.println("just Pass");
        }



        if(computer >=(90%  fullMark)){
            System.out.println("A+");

        } else if (computer>=(80% fullMark)){
            System.out.println("A");
        }else if (computer>=(60%fullMark)){
            System.out.println("B");
        } else if (computer >=passMark){
            System.out.println("just Pass");
        }

        if(english >=(90%  fullMark) ){
            System.out.println("A+");
        } else if (english>=(80% fullMark)){
            System.out.println("A");
        }else if (english>=(60%fullMark)){
            System.out.println("B");
        } else if (english >=passMark){
            System.out.println("just Pass");
        }

        else {System.out.println("Fail");
        }

        System.out.println("What is your Subject");
        String subject = in.nextLine();

        System.out.println("What iS your name?");
        String name = in.nextLine();

        System.out.println("What is your address?");
        String address = in.nextLine();

        System.out.println("How old are you?");
        int age = in.nextInt();



        System.out.printf("Name : %s",  name);
        System.out.printf(" Address : %s",  address);
        System.out.printf(" Age : %d",  age);
        System.out.printf(" Subject : %s", subject);


    }
}
