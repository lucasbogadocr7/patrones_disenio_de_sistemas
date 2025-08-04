package org.example;


//ESTA CLASE SERIA EL COMMAND GENERICO, CON UNA REFERENCIA AL COMANDO CONCRETO Y HACE
//EXECUTE SIN SABER LOS DETALLES DE ESTE
public class ControladorDeServidores {
    private Command comando;

    public void setCommand(Command comando) {
        this.comando = comando;
    }

    public void ejecutarComando() {
        comando.execute();
    }
}
