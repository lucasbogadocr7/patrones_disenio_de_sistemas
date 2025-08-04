package org.example;

public class MotorDiesel extends Motor {

    @Override
    protected void consumirCombustible() {
        System.out.println("Alta presión provoca combustión del combustible.");
    }

    @Override
    protected void bajarPiston() {
        System.out.println("Pistón baja creando vacío que aspira aire.");
    }
}
