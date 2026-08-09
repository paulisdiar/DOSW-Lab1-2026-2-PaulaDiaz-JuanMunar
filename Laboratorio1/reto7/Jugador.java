package reto7;

public class Jugador {

    private int numero;
    private String nombre;
    private long deuda;
    private long premio;
    private String estado;

    public Jugador(int numero, String nombre, long deuda, long premio, String estado) {
        this.numero = numero;
        this.nombre = nombre;
        this.deuda = deuda;
        this.premio = premio;
        this.estado = estado;
    }

    public int getNumero() {
        return numero;
    }

    public String getNombre() {
        return nombre;
    }

    public long getDeuda() {
        return deuda;
    }

    public long getPremio() {
        return premio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}