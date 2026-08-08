package reto7;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Reto7 {

    public static void main(String[] args) {
        // Creación jugadores squid game
        List<Jugador> jugadores = new ArrayList<>();
        jugadores.add(new Jugador(456, "Seong Gi-hun", 160_000_000));
        jugadores.add(new Jugador(67, "Kang Sae-byeok", 80_000_000));
        jugadores.add(new Jugador(218, "Cho Sang-woo", 250_000_000));
        jugadores.add(new Jugador(199, "Ali Abdul", 70_000_000));

        ejecutarPrueba2(jugadores);
    }

    // Prueba 2: Los Dados
    public static void ejecutarPrueba2(List<Jugador> jugadores) {
        Random random = new Random();
        List<String> pasan = new ArrayList<>();
        List<String> eliminados = new ArrayList<>();

        System.out.println("Prueba 2 — Los Dados:");

        for (Jugador j : jugadores) {
            // Dado
            int dado = random.nextInt(6) + 1;

            if (dado % 2 == 0) {
                // Si el número es par -> pasa de rond
                pasan.add(j.getNombre() + "(" + dado + ")");
            } else {
                // Si el número es impar -> muere
                j.setEstado("ELIMINADO");
                eliminados.add("Jugador " + j.getNumero() + " ELIMINADO");
            }
        }

        if (!pasan.isEmpty()) {
            System.out.println("  " + String.join(", ", pasan) + " PASAN");
        }
        for (String elim : eliminados) {
            System.out.println("  " + elim);
        }
    }
}