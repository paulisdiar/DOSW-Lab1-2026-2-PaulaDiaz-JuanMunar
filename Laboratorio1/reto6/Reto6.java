package reto6;

import java.util.LinkedHashMap;
import java.util.Map;

public class Reto6 {

    public static void main(String[] args) {
        Map<String, Runnable> mapaComandos = new LinkedHashMap<>();

        // Estudiante A (Paula) + Estudiante B (Juan) 
        mapaComandos.put("SALUDAR", () -> ejecutarComandoA("SALUDAR"));
        mapaComandos.put("BROMEAR", () -> ejecutarComandoB("BROMEAR"));
        mapaComandos.put("ANALIZAR", () -> ejecutarComandoB("ANALIZAR"));
        mapaComandos.put("DANZAR", () -> ejecutarComandoA("DANZAR"));
        mapaComandos.put("DESPEDIR", () -> ejecutarComandoA("DESPEDIR"));
        mapaComandos.put("CANTAR", () -> ejecutarComandoA("CANTAR"));
        mapaComandos.put("GRITAR", () -> ejecutarComandoB("GRITAR"));
        mapaComandos.put("SUSURRAR", () -> ejecutarComandoB("SUSURRAR"));

        // Recorrido del Map
        mapaComandos.forEach((cmd, accion) -> accion.run());
    }

    // Estudiante A (Paula) 
    public static void ejecutarComandoA(String comando) {
        switch (comando.toUpperCase()) {
            case "SALUDAR":
                System.out.println("¡Saludos, viajero del Tiempo y del código!");
                break;
            case "DESPEDIR":
                System.out.println("Hasta la próxima compilación, viajero.");
                break;
            case "CANTAR":
                System.out.println("La la la... compilando melodías en tiempo real.");
                break;
            case "DANZAR":
                System.out.println("Girando en modo fiesta.");
                break;
            default:
                System.out.println("Comando no reconocido para el Canal A.");
                break;
        }
    }

    // Estudiante B (Juan) 
    public static String ejecutarComandoB(String comando) {
        switch (comando.toUpperCase()) {
            case "BROMEAR":
                System.out.println("¿Por qué la RAM rompió con la CPU?\n Porque necesitaba espacio...");
                break;
            case "GRITAR":
                System.out.println("¡¡¡STACK OVERFLOOOOOW!!!");
                break;
            case "SUSURRAR":
                System.out.println("psst... revisa el punto y coma de la línea 42.");
                break;
            case "ANALIZAR":
                System.out.println("Analizando datos... ¡Eres increíble!");
                break;
            default:
                System.out.println("[Comando " + comando + " no reconocido]");
                break;
        }
        return comando;
    }
}