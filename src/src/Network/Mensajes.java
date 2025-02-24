package Network;

public class Mensajes extends Publicacion{
    private static int cont = 0;
    private int id;
    private String texto;
    public Mensajes ( Usuario usuario, String texto){
        super(usuario);
        this.id =  cont++;
        this.texto = texto;

    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getTexto(){
        return texto;
    }
    public void setTexto(String texto){
        this.texto = texto;
    }
    @Override
    public String toString(){
        return this.id + " - " + this.getUsuario() + " - " + this.texto;
    }
}
