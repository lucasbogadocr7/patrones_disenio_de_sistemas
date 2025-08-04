package org.example;

public abstract class State {
    protected Account cuenta;

    public void setCuenta(Account cuenta) {
        this.cuenta = cuenta;
    }

    //cada uno de estos metodos sera sobreescrito en cada estado dependiendo su logica
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract void payInterest();
    public abstract void stateChangeCheck(); // valida la transicion de estado
}

