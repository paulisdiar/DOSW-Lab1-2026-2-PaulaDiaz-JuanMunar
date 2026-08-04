import java.util.Scanner;

public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    System.out.println("Estudiante A:");
        String nombreA = sc.nextLine();;
        int semestreA = sc.nextInt();
        int edadA = sc.nextInt();
        String correoA = sc.nextLine();;
        Estudiante estudianteA = new Estudiante(nombreA, semestreA, edadA, correoA);

    System.out.println("Estudiante B:");
        String nombreB = sc.nextLine();;
        int semestreB = sc.nextInt();
        int edadB = sc.nextInt();
        String correoB = sc.nextLine();;
        Estudiante estudianteB = new Estudiante(nombreB, semestreB, edadB, correoB);

        MensajeBienvenida mensaje = new MensajeBienvenida();

    mensaje.agregarEstudiante(estudianteA);
    mensaje.agregarEstudiante(estudianteB);

    System.out.println(mensaje.getInfoEstudiante());
    scanner.close();
}
