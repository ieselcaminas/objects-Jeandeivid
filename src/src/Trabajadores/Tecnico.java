package Trabajadores;

public class Tecnico extends Operario{
    public Tecnico(){
        super();
    }
    public Tecnico(String nombre){
        super();
        setNombre(nombre);
    }
    @Override
    public String toString(){
        return "Tecnico: " + getNombre();
    }
}
