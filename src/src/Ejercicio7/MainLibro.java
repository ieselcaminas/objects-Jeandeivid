package Ejercicio7;

import java.util.ArrayList;
import java.util.Date;

public class MainLibro {
    public static void main(String[] args) {
        ArrayList<Editorial> editoriales = new ArrayList<>();
        ArrayList<Tema> temas = new ArrayList<>();
        ArrayList<Autor> autores = new ArrayList<>();
        ArrayList<Libro> libros = new ArrayList<>();
        ArrayList<Historico> historicos = new ArrayList<>();
        ArrayList<Ejemplar> ejemplares = new ArrayList<>();
        ArrayList<Lector> lectores = new ArrayList<>();

        Editorial editorial1 = new Editorial("Mondadori");
        Editorial editorial2 = new Editorial("Planeta");
        editoriales.add(editorial1);
        editoriales.add(editorial2);

        Tema tema1 = new Tema(1, "Terror");
        Tema tema2 = new Tema(2, "Suspenso");
        temas.add(tema1);
        temas.add(tema2);

        Autor autor1 = new Autor(1, "Stephen King");
        Autor autor2 = new Autor(2, "Stephen King");
        autores.add(autor1);
        autores.add(autor2);

        Libro libro1 = new Libro(1234, "It", editorial1, tema1);
        Libro libro2 = new Libro(5678, "El resplandor", editorial2, tema2);
        libros.add(libro1);
        libros.add(libro2);

        libro1.añadirAutor(autor1);
        autor1.agregarLibro(libro1);
        libro2.añadirAutor(autor2);
        autor2.agregarLibro(libro2);

        editorial1.añadirLibro(libro1);
        editorial2.añadirLibro(libro2);

        tema1.agregarLibro(libro1);
        tema2.agregarLibro(libro2);

        Date fechaPrestamo1 = new Date();
        Date fechaDevolucion1 = new Date(System.currentTimeMillis() + 15 * 24 * 60 * 60 * 1000L);
        Historico historico1 = new Historico(fechaPrestamo1, fechaDevolucion1);
        historicos.add(historico1);

        Ejemplar ejemplar1 = new Ejemplar(1, libro1, historico1);
        Ejemplar ejemplar2 = new Ejemplar(2, libro1, historico1);
        Ejemplar ejemplar3 = new Ejemplar(3, libro2, historico1);
        ejemplares.add(ejemplar1);
        ejemplares.add(ejemplar2);
        ejemplares.add(ejemplar3);

        libro1.añadirEjemplar(ejemplar1);
        libro1.añadirEjemplar(ejemplar2);
        libro2.añadirEjemplar(ejemplar3);

        Lector lector1 = new Lector(12345678, "Saber Becis Salma", historico1);
        Lector lector2 = new Lector(87654321, "Carlos Andrei Buceag", historico1);
        lectores.add(lector1);
        lectores.add(lector2);

        historico1.añadirEjemplares(ejemplar1);
        historico1.añadirLectores(lector1);
        historico1.añadirLectores(lector2);

        System.out.println("=== INFORMACIÓN DE LA BIBLIOTECA ===");

        System.out.println(" EDITORIALES Y SUS LIBROS:");
        for (Editorial editorial : editoriales) {
            System.out.println("\tEditorial: " + editorial.getNombre());
            for (Libro libro : editorial.getLibros()) {
                System.out.println("\t\t" + libro.getTitulo());
            }
        }

        System.out.println("TEMAS Y SUS LIBROS:");
        for (Tema tema : temas) {
            System.out.println("\tTema: " + tema.getNombre());
            for (Libro libro : tema.getLibros()) {
                System.out.println("\t\t" + libro.getTitulo());
            }
        }

        System.out.println(" AUTORES Y SUS LIBROS:");
        for (Autor autor : autores) {
            System.out.println("\tAutor: " + autor.getNombre());
            for (Libro libro : autor.getLibros()) {
                System.out.println("\t\t" + libro.getTitulo());
            }
        }

        System.out.println("\n4. LIBROS Y SUS EJEMPLARES:");
        for (Libro libro : libros) {
            System.out.println("\tLibro: " + libro.getTitulo());
            for (Ejemplar ejemplar : libro.getEjemplares()) {
                System.out.println("\t\tEjemplar #" + ejemplar.getN_reg());
            }
        }

        System.out.println("\n5. HISTÓRICOS DE PRÉSTAMOS:");
        for (Historico historico : historicos) {
            System.out.println("\tFecha préstamo: " + historico.getData_p());
            System.out.println("\tEjemplares prestados:");
            for (Ejemplar ejemplar : historico.getEjemplares()) {
                System.out.println("\t\tEjemplar #" + ejemplar.getN_reg() + " del libro: " +
                        ejemplar.getLibro().getTitulo());
            }
            System.out.println("\tLectores:");
            for (Lector lector : historico.getLectores()) {
                System.out.println("\t\t" + lector.getNombre() + " (DNI: " + lector.getDni() + ")");
            }
        }
    }
}