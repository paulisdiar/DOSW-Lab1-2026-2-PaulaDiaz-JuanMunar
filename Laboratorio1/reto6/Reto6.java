package reto6;

import java.util.Scanner;

public class Reto6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ejecutar comando: ");
        String comando = sc.nextLine();
        System.out.println(ejecutarComando(comando));

        sc.close();
    }

    // Estudiante B 
    public static String ejecutarComando(String comando) {
        switch (comando.toUpperCase()) {
            case "BROMEAR":
                return "¿Por qué la RAM rompió con la CPU? Porque necesitaba espacio...";
            case "GRITAR":
                return "¡¡¡STACK OVERFLOOOOOW!!!";
            case "SUSURRAR":
                return "psst... revisa el punto y coma de la línea 42.";
            case "ANALIZAR":
                return "Analizando datos... ¡Eres increíble!";
            default:
                return "[Comando " + comando + " no reconocido]";
        }
    }
}