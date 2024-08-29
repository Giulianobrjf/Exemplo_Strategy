import org.example.*;
import org.junit.Test;

import static org.junit.Assert.*;


public class OrdenadorTest {

    @Test
    public void deveOrdenarComBubbleSort() {
        Ordenador ordenador = new Ordenador();
        int[] lista = {5, 2, 9, 1, 5, 6};
        int[] listaEsperada = {1, 2, 5, 5, 6, 9};

        ordenador.setAlgoritmo(new BubbleSort());
        ordenador.ordenar(lista);

        assertArrayEquals(listaEsperada, lista);
    }

    @Test
    public void deveOrdenarComInsertionSort() {
        Ordenador ordenador = new Ordenador();
        int[] lista = {5, 2, 9, 1, 5, 6};
        int[] listaEsperada = {1, 2, 5, 5, 6, 9};

        ordenador.setAlgoritmo(new InsertionSort());
        ordenador.ordenar(lista);

        assertArrayEquals(listaEsperada, lista);
    }

    @Test
    public void deveOrdenarComQuickSort() {
        Ordenador ordenador = new Ordenador();
        int[] lista = {5, 2, 9, 1, 5, 6};
        int[] listaEsperada = {1, 2, 5, 5, 6, 9};

        ordenador.setAlgoritmo(new QuickSort());
        ordenador.ordenar(lista);

        assertArrayEquals(listaEsperada, lista);
    }

    @Test
    public void deveLancarErroParaListaNula() {
        try {
            Ordenador ordenador = new Ordenador();
            int[] lista = null;


            ordenador.setAlgoritmo(new BubbleSort());
            ordenador.ordenar(lista);

            fail("Deveria lançar uma NullPointerException para lista nula.");
        } catch (NullPointerException e) {

            assertTrue(e.getMessage().contains("Cannot read the array length because \"lista\" is null"));
        }
    }
}
