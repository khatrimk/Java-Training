package day18.assertion;

public class AssertionTest {
    public static void main(String[] args) {
        int x =-2;

//        if (x<0)throw new IllegalArgumentException("X<0");


        assert x>=0: "x<0";

        System.out.println(Math.sqrt(x));

    }
}
