package reto4;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Reto4 {

    public static void main(String[] args) {
        String entradaHashMap = "[(\"oro\",5), (\"plata\",3), (\"oro\",7), (\"diamante\",10)]";
        String entradaHashtable = "[(\"plata\",8), (\"rubí\",4), (\"oro\",12), (\"esmeralda\",6)]";

        // Estudiante A (Paula)
        Map<String, Integer> hashMap = crearHashMap(entradaHashMap);

        // Estudiante B (Juan)
        Map<String, Integer> hashtable = crearHashtable(entradaHashtable);

        // Ambos
        Map<String, Integer> mapaCombinado = Stream.concat(hashMap.entrySet().stream(), hashtable.entrySet().stream())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (valorHashMap, valorHashtable) -> valorHashtable
                ));

        mapaCombinado.entrySet().stream()
                .map(e -> String.format("Clave: %-10s | Valor: %d", e.getKey().toUpperCase(), e.getValue()))
                .sorted()
                .forEach(System.out::println);
    }

    // Estudiante A (Paula) 
    public static Map<String, Integer> crearHashMap(String entrada) {
        Map<String, Integer> mapa = new HashMap<>();
        String limpia = entrada.replaceAll("[\\[\\]()\"]", "");
        String[] partes = limpia.split(",\\s*");
        for (int i = 0; i < partes.length - 1; i += 2) {
            String clave = partes[i].trim().toLowerCase();
            int valor = Integer.parseInt(partes[i + 1].trim());
            mapa.putIfAbsent(clave, valor);
        }
        return mapa;
    }

    // Estudiante B (Juan)
    public static Map<String, Integer> crearHashtable(String entrada) {
        Map<String, Integer> tabla = new Hashtable<>();
        String limpia = entrada.replaceAll("[\\[\\]()\"]", "");
        String[] partes = limpia.split(",\\s*");
        for (int i = 0; i < partes.length - 1; i += 2) {
            String clave = partes[i].trim().toLowerCase();
            int valor = Integer.parseInt(partes[i + 1].trim());
            tabla.put(clave, valor);
        }
        return tabla;
    }
}