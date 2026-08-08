package Laboratorio1.reto2;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Reto2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa los números separados por espacio");
        String lineaEntrada = scanner.nextLine();

        List<Integer> lista = Arrays.stream(lineaEntrada.trim().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Function<List<Integer>, Integer> obtenerMinimo = l -> l.stream()
                .min(Integer::compare)
                .orElse(0);

        Function<List<Integer>, Integer> obtenerCantidad = List::size;

        int menor = obtenerMinimo.apply(lista);
        int cantidad = obtenerCantidad.apply(lista);

        System.out.println("Número más pequeño: " + menor);
        System.out.println("Cantidad de datos ingresados: " + cantidad);

        scanner.close();
    }
}