package Network;

public class Usuario {
    private String nick;
    private String nombre;
    private int id;
    private static int cont = 0;
    private String email;
    private String password;

    public Usuario(String nick, String nombre,String email, String password) {
        this.nick = nick;
        this.nombre = nombre;
        this.id =  cont++;
        this.email = email;
        this.password = password;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public String toString(){
        return this.nick + " - " + this.nombre + " - " + this.id + " - " + this.email + " - " + this.password;
    }
}
