package reto5;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Reto5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        HashSet<Integer> numeros = new HashSet<>();

        System.out.print("Ingrese la cantidad de números: ");
        int cantidad = scanner.nextInt();

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros.add(scanner.nextInt());
        }

        Set<Integer> resultado = numeros.stream()
                .filter(numero -> numero % 3 != 0)
                .collect(Collectors.toSet());

        resultado.forEach(numero ->
                System.out.println("Número en arena: " + numero)
        );

        scanner.close();
    }
}