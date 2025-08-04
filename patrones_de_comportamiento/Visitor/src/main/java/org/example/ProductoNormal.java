package org.example;

public class ProductoNormal implements Visitable {
    private double precio;

    public ProductoNormal(double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}

