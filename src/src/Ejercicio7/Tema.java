package Ejercicio7;

import java.util.ArrayList;

public class Tema {
    private int cod_t;
    private String nombre;
    private ArrayList<Libro> libros;

    public Tema(int cod_t, String nombre) {
        this.cod_t = cod_t;
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }
    public int getCod_t() {
        return cod_t;
    }
    public void setCod_t(int cod_t) {
        this.cod_t = cod_t;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void agregarLibro(Libro libro) {
        this.libros.add(libro);
    }

    @Override
    public String toString() {
        return nombre;
    }
}
