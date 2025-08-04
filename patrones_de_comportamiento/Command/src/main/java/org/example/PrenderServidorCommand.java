package org.example;

public class PrenderServidorCommand implements Command {
    private ServidorLinux servidor;

    public PrenderServidorCommand(ServidorLinux servidor) {
        this.servidor = servidor;
    }

    public void execute() {
        servidor.conectar();
        servidor.verificarConexion();
        servidor.prender();         // método específico de prender
        servidor.guardarLog();
        servidor.cerrarConexion();
    }
}

