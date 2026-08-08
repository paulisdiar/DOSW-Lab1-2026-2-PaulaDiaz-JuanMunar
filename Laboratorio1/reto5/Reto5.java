package reto5;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Reto5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("TreeSet (Ingrese los números separados por espacio) :");
        String entrada = sc.nextLine();

        // Estudiante B 
        Set<Integer> resultado = crearTreeSet(entrada);
        resultado.stream().forEach(n -> System.out.println("Número en arena: " + n));
        sc.close();
    }
    //Estudiante B
    public static Set<Integer> crearTreeSet(String entrada) {
        return Arrays.stream(entrada.split("\\s+")).map(Integer::parseInt).filter(n -> n % 5 != 0).collect(Collectors.toCollection(TreeSet::new)); 
    }
}