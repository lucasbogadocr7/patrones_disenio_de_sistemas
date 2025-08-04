package org.example;

public class GoldState extends State {

    public GoldState(Account cuenta) {
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
        double balance = cuenta.getBalance();
        double interest = balance * 0.05; // 5% de interés
        System.out.println("Pagando interés: " + interest);
        cuenta.setBalance(balance + interest);
        stateChangeCheck(); // por si el interés lo cambia de categoría (teórica posibilidad)
    }

    @Override
    public void stateChangeCheck() {
        double balance = cuenta.getBalance();
        if (balance < 0) {
            cuenta.setState(new RedState(cuenta));
        } else if (balance < 1000) {
            cuenta.setState(new SilverState(cuenta));
        }
    }
}
