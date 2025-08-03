package org.example;

public class Libro {
    private String titulo;
    private String estado;

    public Libro(String titulo, String estado) {
        this.titulo = titulo;
        this.estado = estado;
    }

    public String getEstado() { return estado; }
    public String getTitulo() { return titulo; }
}
