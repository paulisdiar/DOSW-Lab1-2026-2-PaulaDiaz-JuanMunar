package reto1;

public class Estudiante {
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