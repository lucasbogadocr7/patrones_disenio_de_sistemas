package org.example;

public class MotorNaftero extends Motor {

    @Override
    protected void consumirCombustible() {
        System.out.println("Se genera una chispa, explota la mezcla aire-combustible.");
    }

    @Override
    protected void bajarPiston() {
        System.out.println("Pistón baja creando vacío que aspira aire y combustible.");
    }
}

