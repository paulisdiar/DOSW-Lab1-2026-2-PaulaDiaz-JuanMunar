package reto2;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Reto2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese los numeros de cada lista con un espacio");
        System.out.print("Lista 1: ");
        String entrada1 = sc.nextLine();

        System.out.print("Lista 2: ");
        String entrada2 = sc.nextLine();

        List<Integer> lista1 = parsearEntrada(entrada1);
        List<Integer> lista2 = parsearEntrada(entrada2);

        System.out.println("Lista 1 => " + procesarLista(lista1));
        System.out.println("Lista 2 => " + procesarLista(lista2));

        sc.close();
    }

    private static List<Integer> parsearEntrada(String entrada) {
        String limpia = entrada.replaceAll(".*:", "").replaceAll("[\\[\\]]", "").trim();
        return Arrays.stream(limpia.split("[,\\s]+"))
                .filter(s -> !s.isEmpty())
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }

    // Estudiante A (Paula) + Estudiante B (Juan)
    public static String procesarLista(List<Integer> lista) {
        // Estudiante B: Máximo
        int max = obtenerMaximo(lista);

        // Estudiante A: Mínimo y Cantidad
        Function<List<Integer>, Integer> obtenerMinimo = l -> l.stream()
                .min(Integer::compare)
                .orElse(0);

        Function<List<Integer>, Integer> obtenerCantidad = List::size;

        int min = obtenerMinimo.apply(lista);
        int cantidad = obtenerCantidad.apply(lista);

        boolean esMultiplo2 = (max % 2 == 0);
        boolean esDivisor2 = (max % 2 == 0);
        boolean esCantidadPar = (cantidad % 2 == 0);

        String txtMultiplo = esMultiplo2 ? "Sí" : "No";
        String txtDivisor = esDivisor2 ? "Sí" : "No";
        String tipoParidad = esCantidadPar ? "par" : "impar";

        StringBuilder sb = new StringBuilder();
        sb.append("max:").append(max)
          .append(" min:").append(min)
          .append(" cant:").append(cantidad).append("\n")
          .append(" ¿").append(max).append(" múltiplo de 2? ").append(txtMultiplo).append("\n")
          .append(" ¿").append(max).append(" divisor de 2? ").append(txtDivisor).append("\n")
          .append(" ¿Cantidad (").append(cantidad).append(") es ").append(tipoParidad).append("? Sí");

        return sb.toString();
    }

    // Estudiante B: calculo del máximo
    public static int obtenerMaximo(List<Integer> lista) {
        return lista.stream().max((a, b) -> a.compareTo(b)).orElse(0);
    }
}