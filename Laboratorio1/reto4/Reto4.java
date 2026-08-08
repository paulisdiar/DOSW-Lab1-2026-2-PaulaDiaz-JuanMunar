package reto4;

import java.util.Hashtable;
import java.util.Map;

public class Reto4 {

    public static void main(String[] args) {
        
        String entrada = "[(\"plata\",8), (\"rubí\",4), (\"oro\",12), (\"esmeralda\",6)]";
        System.out.println("Hashtable: " + entrada + "\n");

        // Estudiante B
        Map<String, String> tabla = crearHashtable(entrada);
        tabla.forEach((clave, valor) -> System.out.println("Clave: " + clave + " | Valor: " + valor));
    }

    // Estudiante B
    public static Map<String, String> crearHashtable(String entrada) {
        Map<String, String> tabla = new Hashtable<>();

        String limpia = entrada.replaceAll("[\\[\\]()\"]", "");

        String[] partes = limpia.split(",\\s*");

        for (int i = 0; i < partes.length - 1; i += 2) {
            String clave = partes[i].trim();
            String valor = partes[i + 1].trim();
            tabla.put(clave, valor);
        }

        return tabla;
    }
}