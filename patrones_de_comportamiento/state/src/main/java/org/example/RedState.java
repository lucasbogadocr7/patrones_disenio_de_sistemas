package org.example;

public class RedState extends State {
    public RedState(Account cuenta) {
        this.cuenta = cuenta;
    }

    public void deposit(double amount) {
        cuenta.setBalance(cuenta.getBalance() + amount);
        stateChangeCheck();
    }

    public void withdraw(double amount) {
        System.out.println("Operación denegada: cuenta en descubierto.");
    }

    public void payInterest() {
        System.out.println("Sin interés en descubierto.");
    }

    public void stateChangeCheck() {
        double balance = cuenta.getBalance();
        if (balance >= 0 && balance < 1000)
            cuenta.setState(new SilverState(cuenta));
        else if (balance >= 1000)
            cuenta.setState(new GoldState(cuenta));
    }
}

