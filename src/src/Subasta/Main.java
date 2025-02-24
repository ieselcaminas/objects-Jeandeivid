package Subasta;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creación de subastas
        Subastas subasta1 = new Subastas(1, "Subasta día 10");
        Subastas subasta2 = new Subastas(2, "Subasta día 2");

        // Lista de subastas en la casa de subastas
        List<Subastas> casaDeSubastas = new ArrayList<>();
        casaDeSubastas.add(subasta1);
        casaDeSubastas.add(subasta2);

        // Creación de lotes y asignación a subastas
        Lote lote1 = new Lote(1, "Lote 1", subasta1);
        subasta1.addLote(lote1);

        Lote lote2 = new Lote(2, "Lote 2", subasta1);
        subasta1.addLote(lote2);

        // Creación de artículos y asignación a lotes
        Articulo libro = new Articulo(1, "Libro", 100, lote1);
        Articulo ipad = new Articulo(2, "iPad", 1000, lote1);
        lote1.addArticulo(libro);
        lote1.addArticulo(ipad);

        Articulo gafas = new Articulo(3, "Gafas", 100, lote2);
        lote2.addArticulo(gafas);

        // Creación de pujadores
        Pujadores pepe = new Pujadores(1, "Pepe");
        Pujadores maria = new Pujadores(2, "María");

        // Creación de pujas y asignación a lotes y pujadores
        Puja puja1 = new Puja(1, 100, pepe, lote1);
        pepe.addPuja(puja1);
        lote1.addPuja(puja1);
    }
}
