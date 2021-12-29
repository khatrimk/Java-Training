package day17;

import java.io.IOException;

public class ExceptionPractice {
    //java put InputOutput exception in high priority
    public void readFromFile() throws IOException {
        throw new IOException("Oops readFromFile is throwing exception");
    }

    //java put Runtime exception in low priority
    public void running() throws RuntimeException {
        throw new RuntimeException("Oops running is throwing exception");
    }

    public void arithmeticException()throws ArithmeticException{
        throw new ArithmeticException("Oops readFromFile is throwing exception");
    }

    public static void main(String[] args) {
        ExceptionPractice exceptionPractice = new ExceptionPractice();


        //use try catch for IOException.
//
//        try {
        //we have to write code here!
//            exceptionPractice.readFromFile();
//            System.out.println("In between Read file and running");
//        } catch (IOException e) {
//            System.out.println("In catch block of IOException");
//            e.printStackTrace();
//        }


        //Java will not suggest for RunTimeException, system will crush
        // so, we have to handle RunTimeException by our self by.
        //We can do multiple catch for same types of exception, if we parent class exception it will handle its child class exception
        // eg. RunTimeException parent is Exception,
        // RunTimeException can handle both ArithmeticException and IndexOutOfBoundsException
        // ArithmeticException and IndexOutOfBoundsException is child of RunTimeException
        //Note: not to use parent c ,try catch will take extra time while execute

//        try {
//            exceptionPractice.running();
//        }catch (RuntimeException e){
//            //in every exception there will be  e.printStackTrace();
//            e.printStackTrace();
//        }

//        try{
////            exceptionPractice.running();
//            exceptionPractice.arithmeticException();
//        }catch (ArithmeticException e){
//            System.out.println("In Catch Block of ArithmeticException");
//            e.printStackTrace();
//        }catch (IndexOutOfBoundsException e){
//            System.out.println("In Catch Block of IndexOutOfBoundsException");
//            e.printStackTrace();
//        }


//        try {
//            exceptionPractice.running();
//            exceptionPractice.arithmeticException();
//        }catch (Throwable e){
//            //in every exception there will be  e.printStackTrace();
//            e.printStackTrace();
//        }

        //we can handle exception in one catch block
        try{
            exceptionPractice.running();
            exceptionPractice.arithmeticException();
        }catch (ArithmeticException | IndexOutOfBoundsException e){
                e.printStackTrace();
        }

    }
}
