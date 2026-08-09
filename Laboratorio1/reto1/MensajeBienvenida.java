package reto1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import reto1.Estudiante;

public class MensajeBienvenida {

    private final List<Estudiante> estudiantes = new ArrayList<>();

    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public String getInfoEstudiante() {
        return generarSaludo(estudiantes);
    }

    public static String generarSaludo(List<Estudiante> estudiantes) {
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



