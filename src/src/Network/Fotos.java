package Network;

public class Fotos extends Publicacion {
    private String titulo;
    private String archivo;

    public Fotos(Usuario usuario, String titulo, String archivo){
        super(usuario);
        this.titulo = titulo;
        this.archivo = archivo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArchivo() {
        return this.archivo;
    }

    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }
@Override
    public String toString(){
        return this.getUsuario() + " - " + this.titulo + " - " + this.archivo;
    }
    public String getN(){
        return this.getUsuario().getNick();
    }
}
