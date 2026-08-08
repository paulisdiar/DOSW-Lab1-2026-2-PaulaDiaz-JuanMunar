package reto4;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class Reto4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hashtable (ingresar de la forma: plata 8 rubi 4 :");
        String entrada = sc.nextLine();

        //Estudiante B
        Map<String, String> tabla = crearHashtable(entrada);
        tabla.forEach((clave, valor) -> System.out.println("Clave: " + clave + " | Valor: " + valor));
        sc.close();
    }

    // Estudiante B
    public static Map<String, String> crearHashtable(String entrada) {
        Map<String, String> tabla = new Hashtable<>();
        String[] partes = entrada.split("\\s+");

        for (int i = 0; i < partes.length - 1; i += 2) {
            String clave = partes[i];
            String valor = partes[i + 1];
            tabla.put(clave, valor);
        }

        return tabla;
    }
}