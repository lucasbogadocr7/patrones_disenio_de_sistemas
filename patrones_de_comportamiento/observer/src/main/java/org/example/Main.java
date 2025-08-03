package org.example;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Administracion admin = new Administracion();
        Compras compras = new Compras();

        biblioteca.attach(admin);
        biblioteca.attach(compras);

        Libro libro1 = new Libro("Cálculo I", "ok");
        Libro libro2 = new Libro("Sistemas Operativos", "dañado");

        biblioteca.devuelveLibro(libro1); // no notifica
        biblioteca.devuelveLibro(libro2); // notifica a todos
    }
}