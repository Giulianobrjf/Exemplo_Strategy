package org.example;

public class BubbleSort implements AlgoritmoOrdenacao {
    @Override
    public void ordenar(int[] lista) {
        // Implementação do Bubble Sort
        for (int i = 0; i < lista.length - 1; i++) {
            for (int j = 0; j < lista.length - 1 - i; j++) {
                if (lista[j] > lista[j + 1]) {
                    int temp = lista[j];
                    lista[j] = lista[j + 1];
                    lista[j + 1] = temp;
                }
            }
        }
    }
}