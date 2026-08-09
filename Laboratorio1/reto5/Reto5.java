package reto5;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Reto5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("HashSet: ");
        String entradaHashSet = sc.nextLine();

        System.out.print("TreeSet: ");
        String entradaTreeSet = sc.nextLine();

        // Estudiante A (Paula) 
        Set<Integer> setA = crearHashSet(entradaHashSet);

        // Estudiante B (Juan) 
        Set<Integer> setB = crearTreeSet(entradaTreeSet);

        // Ambos 
        Set<Integer> unificado = new TreeSet<>(setA);
        unificado.addAll(setB);

        // Impresión mediante Stream + Lambda
        unificado.stream()
                .forEach(n -> System.out.println("Número en arena: " + n));

        sc.close();
    }

    // Estudiante A (Paula) 
    public static Set<Integer> crearHashSet(String entrada) {
        String limpia = entrada.replaceAll(".*:", "").replaceAll("[\\[\\]]", "").trim();
        return Arrays.stream(limpia.split("[,\\s]+"))
                .filter(s -> !s.isEmpty())
                .map(Integer::parseInt)
                .filter(n -> n % 3 != 0)
                .collect(Collectors.toCollection(HashSet::new));
    }

    // Estudiante B (Juan) 
    public static Set<Integer> crearTreeSet(String entrada) {
        String limpia = entrada.replaceAll(".*:", "").replaceAll("[\\[\\]]", "").trim();
        return Arrays.stream(limpia.split("[,\\s]+"))
                .filter(s -> !s.isEmpty())
                .map(Integer::parseInt)
                .filter(n -> n % 5 != 0)
                .collect(Collectors.toCollection(TreeSet::new));
    }
}