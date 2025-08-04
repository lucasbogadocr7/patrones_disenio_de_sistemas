package org.example;

public class SilverState extends State {

    public SilverState(Account cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public void deposit(double amount) {
        cuenta.setBalance(cuenta.getBalance() + amount);
        stateChangeCheck();
    }

    @Override
    public void withdraw(double amount) {
        cuenta.setBalance(cuenta.getBalance() - amount);
        stateChangeCheck();
    }

    @Override
    public void payInterest() {
        System.out.println("Sin intereses en SilverState.");
    }

    @Override
    public void stateChangeCheck() {
        double balance = cuenta.getBalance();
        if (balance < 0) {
            cuenta.setState(new RedState(cuenta));
        } else if (balance >= 1000) {
            cuenta.setState(new GoldState(cuenta));
        }
    }
}

