package org.example;

public class QuickSort implements AlgoritmoOrdenacao {
    @Override
    public void ordenar(int[] lista) {
        // Implementação do Quick Sort
        quickSort(lista, 0, lista.length - 1);
    }

    private void quickSort(int[] lista, int baixo, int alto) {
        if (baixo < alto) {
            int pivo = particionar(lista, baixo, alto);
            quickSort(lista, baixo, pivo - 1);
            quickSort(lista, pivo + 1, alto);
        }
    }

    private int particionar(int[] lista, int baixo, int alto) {
        int pivo = lista[alto];
        int i = (baixo - 1);
        for (int j = baixo; j < alto; j++) {
            if (lista[j] <= pivo) {
                i++;
                int temp = lista[i];
                lista[i] = lista[j];
                lista[j] = temp;
            }
        }
        int temp = lista[i + 1];
        lista[i + 1] = lista[alto];
        lista[alto] = temp;
        return i + 1;
    }
}