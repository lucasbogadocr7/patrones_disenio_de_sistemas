package org.example;

//este es el subject concreto
public class Biblioteca extends Subject {
    public void devuelveLibro(Libro libro) {
        System.out.println("Libro devuelto: " + libro.getTitulo());
        if (libro.getEstado().equals("dañado")) {
            System.out.println("¡Libro dañado! Notificando...");
            notifyObservers(); // aquí está el disparador del evento
        }
    }
}


