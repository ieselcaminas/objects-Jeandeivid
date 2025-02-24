package Ejercicio5Banco;

import java.util.ArrayList;
import java.util.List;

public class Sucursal {
    private String localidad;
    private int n_sucursal;
    private Banco banco;
    private List<Prestamo> prestamos;

    public Sucursal(String localidad, int n_sucursal, Banco banco) {
        this.localidad = localidad;
        this.n_sucursal = n_sucursal;
        this.banco = banco;
        prestamos = new ArrayList<>();
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public int getN_sucursal() {
        return n_sucursal;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }
    public void addPrestamo(Prestamo prestamo) {
        prestamos.add(prestamo);
    }
    @Override
    public String toString() {
        return this.n_sucursal + " - " + this.localidad;
    }
}
