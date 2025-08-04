package org.example;

public abstract class Motor {

    //método template
    public final void realizarFasesMotor() {
        admision();
        compresion();
        consumirCombustible(); // este es el hook abstracto que cambia
        escape();
    }

    protected void admision() {
        System.out.println("Descenso del pistón, se abre válvula de admisión.");
        bajarPiston(); // este puede ser redefinido en subclases
    }

    protected void compresion() {
        System.out.println("El pistón asciende, comprime el contenido.");
    }

    protected abstract void consumirCombustible(); // este cambia según el motor

    protected void escape() {
        System.out.println("Se abre válvula de escape. Pistón expulsa gases.");
    }

    protected abstract void bajarPiston(); // hook opcional redefinible
}

