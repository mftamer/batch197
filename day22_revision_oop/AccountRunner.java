package day22_revision_oop;

public class AccountRunner {

    public static void main(String[] args) {

        Account savingAccount = new SavingAccount(1000);
        // When we need a variable whose data type is an interface, We should use constructor of its child class.

        savingAccount.deposit(350);
        savingAccount.withdraw(100);
        savingAccount.withdraw(2000);
        System.out.println("savingAccount.getBalance() = " + savingAccount.getBalance());

        Account checkingAccount = new CheckingAccount(5000);
        checkingAccount.deposit(300);
        checkingAccount.withdraw(500);
        System.out.println("checkingAccount.getBalance() = " + checkingAccount.getBalance());


    }

}
