package org.example;

public interface Visitable {
    double accept(Visitor visitor); // <- relación directa
}
