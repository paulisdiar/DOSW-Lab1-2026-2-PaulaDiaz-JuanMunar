package Laboratorio1.reto2;

import java.util.List;
import java.util.function.Function;

public class Reto2 {
    /**
     * Con expresión lambda, calcular el número más pequeño de un listado y la cantidad de datos ingresados.
     */
    public static void main(String[] args) {
        List<Integer> lista1 = List.of(14, 3, 27, 8, 51, 6);
        List<Integer> lista2 = List.of(100, 45, 72, 13, 88);

        Function<List<Integer>, Integer> obtenerMinimo = lista -> lista.stream()
                .min(Integer::compare)
                .orElse(0);

        Function<List<Integer>, Integer> cantidad = List::size;

        int minL1 = obtenerMinimo.apply(lista1);
        int cantL1 = cantidad.apply(lista1);

        System.out.println("--- Estudiante A (Carril 2) ---");
        System.out.println("Lista 1 -> Mínimo: " + minL1);
        System.out.println("Lista 1 -> Cantidad: " + cantL1);
    }
}