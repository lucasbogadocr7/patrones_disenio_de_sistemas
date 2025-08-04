package org.example;

//ESTA ES LA CLASE RECEIVER, LA QUE SABE HACER LA LOGICA
public class ServidorLinux extends Servidor {

    public void conectar() {
        System.out.println("Conectando a servidor Linux...");
    }

    public void prender() {
        System.out.println("prendiendo servidor Linux...");
    }

    public void verificarConexion() {
        System.out.println("Verificando conexión...");
    }

    public void guardarLog() {
        System.out.println("Guardando log...");
    }

    public void apagar() {
        System.out.println("Apagando servidor...");
    }

    public void cerrarConexion() {
        System.out.println("Cerrando conexión...");
    }
}

