package reto4;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Reto4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        HashMap<String, Integer> hashMap = new HashMap<>();
        Hashtable<String, Integer> hashtable = new Hashtable<>();

        System.out.print("¿Cuántos pares desea ingresar? ");
        int cantidadHashMap = scanner.nextInt();

        for (int i = 0; i < cantidadHashMap; i++) {

            System.out.print("Ingrese la clave: ");
            String clave = scanner.next();

            System.out.print("Ingrese el valor: ");
            int valor = scanner.nextInt();

            hashMap.putIfAbsent(clave.toLowerCase(), valor);
        }

        System.out.print("¿Cuántos pares desea ingresar? ");
        int cantidadHashtable = scanner.nextInt();

        for (int i = 0; i < cantidadHashtable; i++) {

            System.out.print("Ingrese la clave: ");
            String clave = scanner.next();

            System.out.print("Ingrese el valor: ");
            int valor = scanner.nextInt();
            hashtable.put(clave.toLowerCase(), valor);
        }

        /*
         * Combinamos los dos mapas, gana el valor del Hashtable.
         */
        Map<String, Integer> mapaCombinado = hashMap.entrySet()
                .stream()
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (valorHashMap, valorHashtable) -> valorHashMap
                ));

        hashtable.entrySet()
                .stream()
                .forEach(entrada ->
                        mapaCombinado.put(entrada.getKey(), entrada.getValue())
                );

        mapaCombinado.entrySet()
                .stream()
                .map(entrada ->
                        entrada.getKey().toUpperCase()
                                + " | Valor: "
                                + entrada.getValue()
                )
                .sorted()
                .forEach(System.out::println);

        scanner.close();
    }
}