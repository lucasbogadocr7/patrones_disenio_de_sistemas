package org.example;

public abstract class Servidor {
    public abstract void conectar();
    public abstract void verificarConexion();
    public abstract void prender();
    public abstract void apagar();
    public abstract void guardarLog();
    public abstract void cerrarConexion();
}

