package reto3;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Reto3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Mensaje interceptado: ");
        String mensajeInterceptado = scanner.nextLine().trim();

        // Canal A (Paula)
        String mensajeAmplificado = amplificarCanalA(mensajeInterceptado);
        System.out.println("Canal A: \"" + mensajeAmplificado + "\"");

        // Canal B (Juan)
        String mensajeInvertido = invertirProtocolo(mensajeInterceptado);
        System.out.println("Canal B: \"" + mensajeInvertido + "\"");

        // Descifrado final
        Function<String, String> descifradoFinal = msg -> Arrays.stream(amplificarCanalA(msg).split("\\s+"))
                .map(Reto3::invertirProtocolo)
                .collect(Collectors.joining(" "));

        System.out.println("Descifrado final:");
        System.out.println("\"" + descifradoFinal.apply(mensajeInterceptado) + "\"");

        scanner.close();
    }

    // Estudiante A (Paula) - Canal A
    public static String amplificarCanalA(String mensaje) {
        StringBuilder sb = new StringBuilder();
        sb.append(mensaje).append(" ").append(mensaje).append(" ").append(mensaje);
        return sb.toString();
    }

    // Estudiante B (Juan) - Canal B
    public static String invertirProtocolo(String mensaje) {
        StringBuffer sb = new StringBuffer(mensaje);
        return sb.reverse().toString();
    }
}