package Ejercicio7;

import java.util.ArrayList;

public class Libro {
    private int isbn;
    private String titulo;
    private Editorial editorial;
    private Tema tema;
    private ArrayList<Autor> autores;
    private ArrayList<Ejemplar> ejemplares;

    public Libro(int isbn, String titulo, Editorial editorial, Tema tema) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.editorial = editorial;
        this.tema = tema;
        this.autores = new ArrayList<>();
        this.ejemplares = new ArrayList<>();
    }

    public int getIsbn() {
        return isbn;
    }
    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Editorial getEditorial() {
        return editorial;
    }
    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public Tema getTema() {
        return tema;
    }
    public void setTema(Tema tema) {
        this.tema = tema;
    }

    public ArrayList<Autor> getAutores() {
        return autores;
    }

    public ArrayList<Ejemplar> getEjemplares() {
        return ejemplares;
    }

    public void añadirAutor(Autor autor) {
        this.autores.add(autor);
    }

    public void añadirEjemplar(Ejemplar ejemplar) {
        this.ejemplares.add(ejemplar);
    }

    @Override
    public String toString() {
        return "Libro{" + "isbn=" + isbn + ", titulo=" + titulo + '}';
    }
}
