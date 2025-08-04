package org.example;

public class ServidorWindows extends Servidor {
    public void conectar() { System.out.println("Conectando a servidor Windows..."); }
    public void apagar() {System.out.println("apagando");}
    public void verificarConexion() { System.out.println("Verificando conexión..."); }
    public void prender() { System.out.println("Iniciando servidor Windows..."); }
    public void guardarLog() { System.out.println("Registrando log en sistema Windows..."); }
    public void cerrarConexion() { System.out.println("Cerrando conexión con Windows..."); }
}
