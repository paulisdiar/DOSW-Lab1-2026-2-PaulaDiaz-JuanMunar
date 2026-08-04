import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class reto1 {
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

    public static class Estudiante {
        private final String nombre;
        private final int semestre;
        private final int edad;
        private final String correo;

        public Estudiante(String nombre, int semestre, int edad, String correo) {
            this.nombre = nombre;
            this.semestre = semestre;
            this.edad = edad;
            this.correo = correo;
        }

        public String getNombre() {
            return nombre;
        }

        public int getSemestre() {
            return semestre;
        }

        public int getEdad() {
            return edad;
        }

        public String getCorreo() {
            return correo;
        }
    }

    public static class MensajeBienvenida {

        private final List<Estudiante> estudiantes = new ArrayList <> ();

        public void agregarEstudiante(Estudiante estudiante) {
            estudiantes.add(estudiante);
        }

        public String getInfoEstudiante() {
            return generarSaludo(estudiantes);
        }

        public static String generarSaludo(List <Estudiante> estudiantes){
            String info = estudiantes.stream()
                    .map(estudiante -> estudiante.getNombre() + " , estudiante de " + estudiante.getSemestre() + " semestre de "
                            + estudiante.getEdad() + " años, y ")
                    .collect(Collectors.joining("\n"));

            String correos = estudiantes.stream()
                    .map(Estudiante::getCorreo)
                    .collect(Collectors.joining(", "));
            
            return "!Hola, bienvenidos! Somos la pareja conformada por " + info + "Nuestros correos son: " + correos;


        }
    }
}
