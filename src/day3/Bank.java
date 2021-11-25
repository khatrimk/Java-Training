package day3;

public class Bank {

    public static void main(String[] args) {
        Account a1 = new Account();
        Account a2 = new Account();


        //     a1.accountHolderName = "Manoj";
        a1.setAccountHolderName("Manoj");
        //      a1.accountNumber = "10123";
        a1.setAccountNumber("10123");
        //      a1.accountBalance = 3000;
        a1.deposit (a1,3000);


        //      a2.accountHolderName = "Shyam";
        a2.setAccountHolderName("Shyam");
        //      a2.accountNumber = "20123";
        a2.setAccountNumber("20123");
        //       a2.accountBalance = 1000;
        a2.deposit(a2,1000);


        System.out.println(a1.getAccountBalance());
        System.out.println(a2.getAccountBalance());


        //Transfer balance 500 from a1 to a2
       // a1.setAccountBalance(3000-500);
      //  a2.setAccountBalance(1000+500);

        a1.transferBalance(a1,a2,500);

        System.out.println(a1.getAccountBalance());
        System.out.println(a2.getAccountBalance());


    }
}
