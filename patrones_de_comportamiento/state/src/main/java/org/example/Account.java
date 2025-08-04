package org.example;

public class Account {
    private State state;
    private double balance;

    public Account() {
        this.balance = 0;
        this.state = new SilverState(this); // estado inicial
    }

    public void deposit(double amount) {
        state.deposit(amount);
    }

    public void withdraw(double amount) {
        state.withdraw(amount);
    }

    public void payInterest() {
        state.payInterest();
    }

    public double getBalance() { return balance; }
    public void setBalance(double b) { balance = b; }
    public void setState(State s) { state = s; }
    public State getState() { return state; }
}

