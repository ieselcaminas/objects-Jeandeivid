package Trabajadores;

public abstract class Operario extends Empleado{
    public Operario(){
        super();
    }
    public Operario(String nombre){
        super();
    }
    @Override
    public String toString(){
        return "Operario: " + getNombre();
    }
}
