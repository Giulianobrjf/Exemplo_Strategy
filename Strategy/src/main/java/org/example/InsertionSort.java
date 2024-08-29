package org.example;

public class InsertionSort implements AlgoritmoOrdenacao {
    @Override
    public void ordenar(int[] lista) {
        for (int i = 1; i < lista.length; i++) {
            int chave = lista[i];
            int j = i - 1;
            while (j >= 0 && lista[j] > chave) {
                lista[j + 1] = lista[j];
                j--;
            }
            lista[j + 1] = chave;
        }
    }
}