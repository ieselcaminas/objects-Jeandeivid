package Trabajadores;

public abstract class Empleado {
    private String nombre;

    public Empleado(){
        this.nombre = "";
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    @Override
    public String toString(){
        return "Empleado: " + nombre;
    }
}
