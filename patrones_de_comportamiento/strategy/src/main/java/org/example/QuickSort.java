package org.example;

import java.util.Collections;
import java.util.List;

public class QuickSort implements SortStrategy {
    public void sort(List<String> lista) {
        System.out.println("Usando QuickSort");
        Collections.sort(lista); // Simulación de algoritmo
    }
}
