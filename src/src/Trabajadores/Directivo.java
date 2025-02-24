package Trabajadores;

public class Directivo extends Empleado{
    public Directivo(){
        super();
    }
    public Directivo(String nombre){
        super();
        setNombre(nombre);
    }
    @Override
    public String toString(){
        return "Directivo: " + getNombre();
    }
}
