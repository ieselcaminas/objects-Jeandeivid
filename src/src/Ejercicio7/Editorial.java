package Ejercicio7;

import java.util.ArrayList;

public class Editorial {
    private String nombre;
    private ArrayList<Libro> libros;

    public Editorial(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
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

    public void añadirLibro(Libro libro) {
        libros.add(libro);
    }

    @Override
    public String toString() {
        return "Editorial{" + "nombre=" + nombre + ", libros=" + libros + '}';
    }
}
