package day9;

public class ConditionalPractice {
    public static void main(String[] args) {
        int sales = 1;
        int target = 5;

        if (sales >= 2 * target) {
            System.out.println("Excellent");
        } else if (sales >= 1.5 * target) {
            System.out.println("Better");
        } else if (sales >= target) {
            System.out.println("Good");
        } else {
            System.out.println("Fired");
        }
    }
}