package day22_revision_oop;
/*
Let's say you want to create a banking application, and you need to define an interface
for different types of accounts, such as saving accounts and checking accounts.
Both account types share common methods like
        deposit,
        withdraw,
        and getBalance,
but each type may have its own specific rules and behaviors.
 */
public interface Account {

    void deposit(double amount);

    void withdraw(double amount);

    double getBalance();


}
