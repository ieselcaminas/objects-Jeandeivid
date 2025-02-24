package Network;

import java.util.ArrayList;
import java.util.Date;

public class Publicacion {
    private int id;
    private static int cont = 0;
    private Usuario usuario;
    private Date fecha;
    private int likes = 0;
    private ArrayList<String> likeadores = new ArrayList<>();

    public Publicacion(Usuario usuario){
        this.id = cont++;
        this.usuario = usuario;
        this.fecha = new Date();
        this.likes = 0;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Date getFecha() {
        return fecha;
    }

    public int getLikes() {
        return likes;
    }
    public void darLikes(Usuario usuario){
        this.likes++;
        likeadores.add(usuario.getNick());
    }
    public void disLikes(){
        this.likes--;
    }
    public void getLikeadores(){
    for(String l : likeadores){
        System.out.println("Likeado por: " + l);
    }
    }

}
