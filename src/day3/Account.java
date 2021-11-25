package day3;

public class Account {

    private String accountHolderName;  //default null
    private String accountNumber;  //defaut null
    private double accountBalance;  //defaut 0.0


    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }



    public void transferBalance(Account from, Account to, double amountToBeTransferred) {
        //Transferring balance logic
        //logic to check if balance is available
        from.accountBalance -= amountToBeTransferred;  // accountBalance = accountBalance - amountToBeTransferred
        to.accountBalance += amountToBeTransferred;  // accountBalance = accountBalance + amountToBeTransferred


    }

    public void deposit(Account a, double amountToBeDeposit){
        //logic to check negative balance deposited
        a.accountBalance += amountToBeDeposit;

    }
}
