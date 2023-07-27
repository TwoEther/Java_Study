package ch6;

public class Account {
    final int MIN_BALANCE = 0;
    final int MAX_BALANCE = 1000000;
    private int balance;
    String accountNumber;
    String person;

    Account(String accountNumber, String person, int balance){
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.person = person;

    }

    void deposit(int money){
        this.balance += money;
    }

    void withdraw(int money){
        this.balance -= money;
    }

    int getBalance(){
        return this.balance;
    }
    void setBalance(int balance){
        this.balance = balance;
    }

    String getPerson(){
        return this.person;
    }
    void getData(){
        System.out.printf("%s %s %d", this.accountNumber, this.person, this.balance);
    }
}
