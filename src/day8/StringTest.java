package day8;

import java.util.Locale;

public class StringTest {
    public static void main(String[] args) {
        var hello = "Hello";

        var helloSubString = "Hello".substring(0, 3);
        System.out.println(helloSubString);


        String expletive = "Expletive";
        String PG13 = "deleted";
        String message = expletive + " " + PG13;

        System.out.println(message);

        int age = 13;
        String rating = "PG" + age;

        String value = 13 + "";  //Bad way of doing instead use String.valueof()

        System.out.println(rating);

        String all = String.join("/", "S", "M", "L", "XL");
        System.out.println(all);

        String reapply = String.join(" ", "Expletive", "deleted");
        System.out.println(reapply);

        String repeated = "Java".repeat(5);
        System.out.println(repeated);

        System.out.println(hello == "Hello");
        System.out.println(hello == "Hello".substring(0, 5));

        System.out.println(hello == "Hello".substring(0, 3));

        System.out.println("Hel" == "Hel");

        System.out.println("Hel" == "hel");
        System.out.println("Hel" == helloSubString);
        System.out.println("hell" == helloSubString); //== check on memory

        System.out.println("Hel".equals(helloSubString));
        /*
       .equals checks on content
       always use .equals  for String.
      */

      System.out.println("Hel".equalsIgnoreCase("hel"));
      System.out.println("Y" == "y");
      System.out.println("Y".equalsIgnoreCase("y"));

/*
      String userInput = "Yes";
      String userInputLowerCase = userInput.toLowerCase();
      System.out.println(userInputLowerCase.equals("yes"));
*/

      String empty = " ";
      System.out.println(empty.length());

        System.out.println(empty.isEmpty());
        System.out.println(empty.isBlank());

      String eMail = " manojid@gmail.com";
      System.out.println(eMail.trim().length()); //trim only remove front and last empty space.

//      String nullString = null;
//      System.out.println(nullString.length());  // if we put null value then it will show null Exception

      String nullString = null;
      if(nullString != null){
        System.out.println(nullString.length());
      }




    }
}
