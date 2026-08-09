package reto1;

import java.util.Scanner;
import reto1.Estudiante;

public class Reto1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Estudiante A:");
        System.out.println("nombre: ");
        String nombreA = sc.nextLine();
        System.out.println("semestre: ");
        int semestreA = Integer.parseInt(sc.nextLine());
        System.out.println("edad: ");
        int edadA = Integer.parseInt(sc.nextLine());
        System.out.println("correo: ");
        String correoA = sc.nextLine();

        Estudiante estudianteA = new Estudiante(nombreA, semestreA, edadA, correoA);

        System.out.println("Estudiante B:");
        System.out.println("nombre: ");
        String nombreB = sc.nextLine();
        System.out.println("semestre: ");
        int semestreB = Integer.parseInt(sc.nextLine());
        System.out.println("edad: ");
        int edadB = Integer.parseInt(sc.nextLine());
        System.out.println("correo: ");
        String correoB = sc.nextLine();

        Estudiante estudianteB = new Estudiante(nombreB, semestreB, edadB, correoB);

        MensajeBienvenida mensaje = new MensajeBienvenida();

        mensaje.agregarEstudiante(estudianteA);
        mensaje.agregarEstudiante(estudianteB);

        System.out.println(mensaje.getInfoEstudiante());
        sc.close();
    }
}
