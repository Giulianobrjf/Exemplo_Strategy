package org.example;

public class Ordenador {
    private AlgoritmoOrdenacao algoritmo;

    public void setAlgoritmo(AlgoritmoOrdenacao algoritmo) {
        this.algoritmo = algoritmo;
    }

    public void ordenar(int[] lista) {
        algoritmo.ordenar(lista);
    }
}