package org.example;

public class ProductoDescuento implements Visitable {
    private double precio;

    public ProductoDescuento(double precio) {
        this.precio = precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return this.precio;
    }

    @Override
    public double accept(Visitor visitor) {
        // El visitor decide qué hacer con este tipo de producto
        return visitor.visit(this);
    }
}

