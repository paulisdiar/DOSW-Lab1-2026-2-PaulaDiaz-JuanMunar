package reto2;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Reto2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese los números separados por espacio:");
        String entrada = sc.nextLine();

        List<Integer> lista = Arrays.stream(entrada.split("\\s+")).map(Integer::parseInt).toList();
        int max = obtenerMaximo(lista);

        System.out.println("max: " + max);
        sc.close();
    }

    // Estudiante B - Carril 1
    public static int obtenerMaximo(List<Integer> lista) {
        return lista.stream().max((a, b) -> a.compareTo(b)).orElse(0);
    }
}