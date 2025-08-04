package org.example;

public interface Visitor {
    double visit(ProductoNormal producto);
    double visit(ProductoDescuento producto);
}
