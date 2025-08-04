package org.example;

import java.util.List;

public class SortedList {
    private SortStrategy strategy;

    public SortedList(SortStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(SortStrategy strategy) {
        this.strategy = strategy;
    }

    public void sort(List<String> lista) {
        strategy.sort(lista);
    }
    //aca se aplica la estrategia con polimorfismo, según que estrategia sea
}

