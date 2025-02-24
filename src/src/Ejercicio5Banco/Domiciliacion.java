package Ejercicio5Banco;


import java.util.List;

public class Domiciliacion {
    private String nombre;
    private int n_Domiciliacion;
    private CompteCorrent cc;

    public Domiciliacion( String nombre ,int n_Domiciliacio, CompteCorrent cc) {
        this.nombre = nombre;
        this.n_Domiciliacion = n_Domiciliacio;
        this.cc = cc;


    }

    public String getNombre() {
        return nombre;
    }

    public int getN_Domiciliacion() {
        return n_Domiciliacion;
    }

    public void setN_Domiciliacion(int n_Domiciliacion) {
        this.n_Domiciliacion = n_Domiciliacion;
    }

    public CompteCorrent getCc() {
        return cc;
    }

    public void setCc(CompteCorrent cc) {
        this.cc = cc;
    }
    @Override
    public String toString() {
        return "Domiciliacion | " + "nombre=" + nombre + ", n_Domiciliacion=" + n_Domiciliacion  + ", cc=" + cc;
    }
}
