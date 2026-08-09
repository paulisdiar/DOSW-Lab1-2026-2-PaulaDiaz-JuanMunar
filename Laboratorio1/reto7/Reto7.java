package reto7;
import reto7.Jugador;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Reto7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Jugador> jugadores = new ArrayList<>();

        System.out.print("Ingrese la cantidad de jugadores: ");
        int cantidad = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < cantidad; i++) {

            System.out.print("Número del jugador: ");
            int numero = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Deuda: ");
            long deuda = scanner.nextLong();

            jugadores.add(
                    new Jugador(
                            numero,
                            nombre,
                            deuda,
                            150000000000L,
                            "ACTIVO"
                    )
            );
        }

        List<Jugador> sobrevivientes = jugadores.stream()
                .filter(jugador -> jugador.getDeuda() <= 170000000L)
                .collect(Collectors.toList());

        jugadores.stream()
                .filter(jugador -> jugador.getDeuda() > 170000000L)
                .forEach(jugador -> jugador.setEstado("ELIMINADO"));

        System.out.println("\nPrueba 1 — Luz Roja Luz Verde:");

        sobrevivientes.forEach(jugador ->
                System.out.println(
                        jugador.getNombre() + " PASA"
                )
        );

        jugadores.stream()
                .filter(jugador -> jugador.getDeuda() > 170000000L)
                .forEach(jugador ->
                        System.out.println(
                                "Jugador " + jugador.getNumero() + " ELIMINADO"
                        )
                );

        scanner.close();
    }
}