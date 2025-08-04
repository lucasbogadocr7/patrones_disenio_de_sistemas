package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();
        nombres.add("Lucas");
        nombres.add("Ana");
        nombres.add("Martín");

        SortedList lista = new SortedList(new QuickSort());
        lista.sort(nombres); // Usa QuickSort

        lista.setStrategy(new ShellSort());
        lista.sort(nombres); // Cambia a ShellSort

        lista.setStrategy(new MergeSort());
        lista.sort(nombres); // Cambia a MergeSort
    }
}
