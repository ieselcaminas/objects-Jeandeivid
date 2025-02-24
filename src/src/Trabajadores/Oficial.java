package Trabajadores;

public class Oficial extends Operario {
    public Oficial(){
        super();
    }
    public Oficial(String nombre){
        super();
        setNombre(nombre);
    }
    @Override
    public String toString(){
        return "Oficial: " + getNombre();
    }
}
