package Ejercicio7;

public class Lector {
    private int dni;
    private String nombre;
    private Historico historico;

    public Lector(int dni, String nombre, Historico historico) {
        this.dni = dni;
        this.nombre = nombre;
        this.historico = historico;
    }

    public int getDni() {
        return dni;
    }
    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Historico getHistorico() {
        return historico;
    }
    public void setHistorico(Historico historico) {
        this.historico = historico;
    }

    @Override
    public String toString() {
        return dni + " - " +nombre;
    }
}
