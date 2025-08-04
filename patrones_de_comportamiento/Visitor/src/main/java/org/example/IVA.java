package org.example;

// Implementación concreta del Visitor
public class IVA implements Visitor {
    public double visit(ProductoNormal p) {
        return p.getPrecio() * 1.21;
    }

    public double visit(ProductoDescuento p) {
        return p.getPrecio() * 1.10;
    }
}
