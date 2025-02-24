package Network;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Publicacion> publicaciones = new ArrayList<>();
        List<Mensajes> Comentarios = new ArrayList<>();
        Usuario Juan = new Usuario("Juan","Juan Tejedor","JTejedor@example.com","123456");
        Mensajes t = new Mensajes(Juan, "Primer comentario :) ");
        publicaciones.add(t);
        System.out.println(t);
        System.out.println("Ha comentado: " + t.getTexto());

        Usuario Pedro = new Usuario("Pedro","Pedro Sanchez","PSancho@example.com","123456");
        Fotos f = new Fotos(Pedro,"Tigres","TresTigres.jpg");


        System.out.println(f);
        System.out.println("Publicacion: " + f.getTitulo() +  " = " + f.getArchivo());
        publicaciones.add(f);
        f.darLikes(Juan);
        f.darLikes(Pedro);
        f.getLikeadores();


    }

    public static void publicacionesDe(String nombre, List<Publicacion> listaPublicaciones){
        listaPublicaciones.stream()
                .filter((p) -> p.getUsuario().getNick().contains(nombre))
                .forEach(System.out::println);
    }
}
