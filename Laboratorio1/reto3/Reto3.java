package Laboratorio1.reto3;

import java.util.Scanner;

public class Reto3 {

    public static String amplificarCanalA(String mensaje) {
        StringBuilder sb = new StringBuilder();

        sb.append(mensaje)
                .append(" ")
                .append(mensaje)
                .append(" ")
                .append(mensaje);

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el mensaje interceptado: ");
        String mensajeInterceptado = scanner.nextLine().trim();

        String mensajeAmplificado = amplificarCanalA(mensajeInterceptado);

        System.out.println("\nCanal A: \"" + mensajeAmplificado + "\"");

        scanner.close();
    }
}