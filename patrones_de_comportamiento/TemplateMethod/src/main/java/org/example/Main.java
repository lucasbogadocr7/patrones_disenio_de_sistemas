package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Motor m1 = new MotorNaftero();
        Motor m2 = new MotorDiesel();

        System.out.println("--- Motor Naftero ---");
        m1.realizarFasesMotor();

        System.out.println("\n--- Motor Diesel ---");
        m2.realizarFasesMotor();
    }
}