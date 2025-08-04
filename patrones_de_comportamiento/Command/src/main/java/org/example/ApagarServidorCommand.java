package org.example;

//ESTA CLASE SERIA EL COMMAND CONCRETO, SOLO HACE EXECUTE() Y TIENE COMO ATRIBUTO A UN RECEIVER
//ASI COMO ES APAGAR, HAY OTRO COMMAND CONCRETO QUE ES PRENDER
public class ApagarServidorCommand implements Command {
    private ServidorLinux servidor;

    public ApagarServidorCommand(ServidorLinux servidor) {
        this.servidor = servidor;
    }

    public void execute() {
        servidor.conectar();
        servidor.verificarConexion();
        servidor.guardarLog();
        servidor.apagar();
        servidor.cerrarConexion();
    }
}
