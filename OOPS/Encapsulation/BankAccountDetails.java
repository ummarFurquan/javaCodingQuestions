package OOPS.Encapsulation;

public class BankAccountDetails {
    //This is an example of encapsulation in JAVA

    //Class named BankAccountDetails


    // These two instance variables are private, so they cannot be accessed by any other class outside this
    private long accountNumber;

    private double balance = 0;


    //Creating a constructor that only accepts accountNumber as a parameter because that is unique for every object that will be created

    public BankAccountDetails(long accountNumber) {
        if(accountNumber < 0){
            throw new IllegalArgumentException("Should be +ve");
        }else{
        this.accountNumber = accountNumber;
        }
    }

    //Now we will provide methods to deposit and withdraw from the account;
    public void depositFunc(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid Amount, Should be greate than 1");
        } else {
            this.balance += amount;
        }
    }

    public void withdrawFunc(double amount) {
        if (amount < 0) {
            System.out.println("Amount Should be greate than 1");
        } else if (amount > balance) {
            System.out.println("Insufficient Balance");
        } else {
            this.balance -= amount;
        }
    }

    //Now we will Provide setters and getters only for the relevant fields

    public long getAccountNumber() {
        return accountNumber;
    }

    //This is not necessary because once the accountNumber is create it cannot be changed for the same object
//    public void setAccountNumber(long accountNumber) {
//        this.accountNumber = accountNumber;
//    }

    public double getBalance() {
        return balance;
    }


    //This is also not necessary because the amount should only be changed via depoit and withdraw functions
//    public void setBalance(double balance) {
//        this.balance = balance;
//    }
}
