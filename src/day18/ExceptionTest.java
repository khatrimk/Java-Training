package day18;

public class ExceptionTest {

    public void calculateAgeOfUser(int age) throws AgeRestrictionException {
        if (age < 18) {
            throw new AgeRestrictionException("You are below 18, so you cannot login to our website");
        } else {
            System.out.println("You can login to our system");
        }


    }

    public static void main(String[] args) {
        ExceptionTest exceptionTest = new ExceptionTest();

        try {
            exceptionTest.calculateAgeOfUser(18);
            exceptionTest.calculateAgeOfUser(17);
            //db close incorrect position
        } catch (AgeRestrictionException e) {
            //e.getLocalizedMessage() is use for showing message for user
            System.out.println(e.getLocalizedMessage());

            //we use e.printStackTrace() to check exception
//            e.printStackTrace();
        }finally {
            //db close correct position
            System.out.println("Finally will always execute");
        }

    }

}
