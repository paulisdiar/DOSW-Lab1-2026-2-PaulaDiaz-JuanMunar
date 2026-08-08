package reto3;

import java.util.Scanner;

public class Reto3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Mensaje interceptado: ");
        String mensaje = sc.nextLine();

        // Canal B
        String canalB = invertirProtocolo(mensaje);
        System.out.println("Canal B: " + canalB);
        sc.close();
    }

    // Estudiante B 
    public static String invertirProtocolo(String mensaje) {
        StringBuffer sb = new StringBuffer(mensaje);
        return sb.reverse().toString();
    }
}