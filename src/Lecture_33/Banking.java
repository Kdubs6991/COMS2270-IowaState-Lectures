package Lecture_33;

import java.util.ArrayList;

abstract class Account {
    private double balance;

    public Account(){
        System.out.println("New Account");
        balance = 20;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        balance -= amount;
    }

    public double getBalance(){
        return balance;
    }

    //an abstract method like this tells the subclasses to have this
    //method, but in the abstract class it does nothing itself
    public abstract String getAccountType();

    @Override
    public boolean equals(Object o){
        if (o instanceof Account){
            Account acc = (Account) o;
            return this.balance == acc.getBalance();
            //return this.balance == ((Account)o).getBalance();
        } else {
            return false;
        }
    }
}

class CheckingAccount extends Account{
    @Override
    public void withdraw(double amount){
        if (getBalance() >= amount){
            super.withdraw(amount);
        } else {
            System.out.println("Zeroing balance");
            super.withdraw(getBalance());
        }
    }

    @Override
    public String getAccountType(){
        return "Checking Account";
    }
}

class SavingsAccount extends Account{
    private double minBalance;

    public SavingsAccount(double minBalance){
        System.out.println("New Savings Account");
        this.minBalance = minBalance;
    }

    @Override
    public void withdraw(double amount){
        if (getBalance() - amount >= minBalance){
            super.withdraw(amount);
        } else {
            System.out.println("Zeroing balance");
            super.withdraw(getBalance());
        }
    }

    @Override
    public String getAccountType(){
        return "Savings Account";
    }
}

public class Banking {
    public static void processAccount(Account a){
        System.out.println("my account type is: " + a.getAccountType());
        a.deposit(200);
        a.withdraw(100);
        System.out.println(a.getBalance());
    }

    public static void main(String[] args) {
//        Account myAccount = new Account();
//        myAccount.deposit(200);
//        myAccount.withdraw(300);
//        System.out.println(myAccount.getBalance());

        System.out.println(); /*Spacer for readability*/

        CheckingAccount myCheckingAccount = new CheckingAccount();
        myCheckingAccount.deposit(200);
        myCheckingAccount.withdraw(100);
        System.out.println(myCheckingAccount.getBalance());

        System.out.println(); /*Spacer for readability*/

        SavingsAccount mySavingsAccount = new SavingsAccount(100);
        mySavingsAccount.deposit(200);
        mySavingsAccount.withdraw(100);
        System.out.println(mySavingsAccount.getBalance());

        System.out.println(); /*Spacer for readability*/

        Account mySavingsAccount2 = new SavingsAccount(100);
        Account myCheckingAccount2 = new CheckingAccount();
//        Account myAccount2 = new Account();
        ArrayList<Account> al = new ArrayList<Account>();
//        al.add(myAccount2);
        al.add(myCheckingAccount2);
        al.add(mySavingsAccount2);

        for (Account a : al){
            processAccount(a);
        }
    }
}
