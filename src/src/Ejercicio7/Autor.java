package Ejercicio7;


import java.util.ArrayList;

public class Autor {
    private int cod_aut;
    private String nombre;
    private ArrayList<Libro> libros;

    public Autor(int cod_aut, String nombre) {
        this.cod_aut = cod_aut;
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    public int getCod_aut() {
        return cod_aut;
    }
    public void setCod_aut(int cod_aut) {
        this.cod_aut = cod_aut;
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
        return "Autor{" + "cod_aut=" + cod_aut + " }";
    }
}
