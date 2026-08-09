package reto7;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Reto7 {

    public static void main(String[] args) {
        //pparticipantes
        List<Jugador> jugadores = new ArrayList<>();
        jugadores.add(new Jugador(456, "Seong Gi-hun", 160_000_000));
        jugadores.add(new Jugador(67, "Kang Sae-byeok", 80_000_000));
        jugadores.add(new Jugador(218, "Cho Sang-woo", 250_000_000));
        jugadores.add(new Jugador(199, "Ali Abdul", 70_000_000));

        long premioAcumulado = 150_000_000_000L; 

        // Prueba 1 — Luz Roja Luz Verde (Estudiante A - Paula)

        System.out.println("Prueba 1 — Luz Roja Luz Verde:");

        List<Jugador> pasanP1 = jugadores.stream()
                .filter(j -> j.getDeuda() <= 170_000_000)
                .collect(Collectors.toList());

        List<Jugador> eliminadosP1 = jugadores.stream()
                .filter(j -> j.getDeuda() > 170_000_000)
                .collect(Collectors.toList());

        eliminadosP1.forEach(j -> j.setEstado("ELIMINADO"));
        premioAcumulado += (long) eliminadosP1.size() * 50_000_000L;

        String nombresPasanP1 = pasanP1.stream()
                .map(Jugador::getNombreCorto)
                .collect(Collectors.joining(", "));

        System.out.println("  " + nombresPasanP1 + " PASAN");
        eliminadosP1.forEach(j -> System.out.println("  Jugador " + j.getNumero() + " ELIMINADO"));

        // Prueba 2 — Los Dados (Estudiante B - Juan)

        System.out.println("\nPrueba 2 — Los Dados:");
        Random random = new Random();
        List<Jugador> pasanP2 = new ArrayList<>();
        List<String> reportePasanP2 = new ArrayList<>();

        for (Jugador j : pasanP1) {
            int dado = random.nextInt(6) + 1;
            if (dado % 2 == 0) {
                pasanP2.add(j);
                reportePasanP2.add(j.getNombreCorto() + "(" + dado + ")");
            } else {
                j.setEstado("ELIMINADO");
                premioAcumulado += 50_000_000L;
                System.out.println("  Jugador " + j.getNumero() + " ELIMINADO");
            }
        }
        if (!reportePasanP2.isEmpty()) {
            System.out.println("  " + String.join(", ", reportePasanP2) + " PASAN");
        }


        // Prueba 3 — Puente de Cristal (Ambos)
  
        System.out.println("\nPrueba 3 — Puente de Cristal:");

        List<Jugador> ganadores = pasanP2.stream()
                .filter(j -> j.getNombreCorto().length() >= 6)
                .collect(Collectors.toList());

        List<Jugador> eliminadosP3 = pasanP2.stream()
                .filter(j -> j.getNombreCorto().length() < 6)
                .collect(Collectors.toList());

        eliminadosP3.forEach(j -> {
            j.setEstado("ELIMINADO");
            System.out.println("  Jugador " + String.format("%03d", j.getNumero()) + " ELIMINADO");
        });

        ganadores.forEach(j -> {
            j.setEstado("GANADOR");
            System.out.println("  " + j.getNombreCorto() + " PASA");
        });

        premioAcumulado += (long) eliminadosP3.size() * 100_000_000L;

        // Resultados
        System.out.println();
        if (!ganadores.isEmpty()) {
            long premioPorGanador = premioAcumulado / ganadores.size();
            for (Jugador g : ganadores) {
                g.setPremio(premioPorGanador);
                System.out.println("¡Jugador " + g.getNumero() + " Eres el Ganador!");
                System.out.println("Premio: " + String.format("%,d", premioPorGanador).replace(',', '.') + " wones");
            }
        }
    }
}