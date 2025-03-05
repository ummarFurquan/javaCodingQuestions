package OOPS.Encapsulation;

public class Test {
    public static void main(String[] args) {

        //Creating an object using object Name Kunal

        BankAccountDetails kunal = new BankAccountDetails(123); // The constructor we created.

        System.out.println(kunal.getBalance());
        System.out.println(kunal.getAccountNumber());

        kunal.depositFunc(3450);
        System.out.println(kunal.getBalance()); // 3450


        kunal.depositFunc(-120); //  Invalid Amount, Should be greate than 1
        System.out.println(kunal.getBalance()); // 3450


        kunal.withdrawFunc(-3000);
        System.out.println(kunal.getBalance()); // 3450

        kunal.withdrawFunc(3000);
        System.out.println(kunal.getBalance()); // 450

    }
}
