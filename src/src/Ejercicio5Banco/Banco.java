package Ejercicio5Banco;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nombre;
    private int n_Entidad;
    private List<Sucursal> sucursales;

    public Banco(String nombre, int n_Entidad) {
        this.nombre = nombre;
        this.n_Entidad = n_Entidad;
        this.sucursales = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getN_Entidad() {
        return n_Entidad;
    }

    public void addSucursales(Sucursal sucursal) {
        this.sucursales.add(sucursal);
    }

    public List<Sucursal> getSucursales() {
        return sucursales;
    }
    @Override
    public String toString() {
        return this.nombre;
    }
}
