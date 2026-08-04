// Mensaje
public class MensajeBienvenida {

    private final List<Estudiante> estudiantes = new ArrayList <> ();

    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public String getInfoEstudiante() {
        return estudiantes.stream()
            .map( estudiante -> estudiante.getNombre() + " - Semestre: " + estudiante.getSemestre()
                + ", Edad: " + estudiante.getEdad() + ", Correo: " + estudiante.getCorreo())
            .collect(Collectors.joining("\n"));
    }
    

}



