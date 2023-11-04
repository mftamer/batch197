package day22_revision_oop;

public class SavingAccount implements Account{
    private double balance;

    public SavingAccount(double initialBalance){
        this.balance=initialBalance;
    }
    @Override
    public void deposit(double amount) {
        balance+=amount;
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount){
            balance-=amount;
        } else {
            System.out.println("Not enough balance!");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
