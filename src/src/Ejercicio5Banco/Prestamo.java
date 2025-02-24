package Ejercicio5Banco;

import java.util.List;

public class Prestamo {
    private int n_prestamo;
    private int cantidad;
    private Cliente cliente;
    private Sucursal sucursal;

    public Prestamo(int n_prestamo, int cantidad, Cliente cliente, Sucursal sucursal) {
        this.n_prestamo = n_prestamo;
        this.cantidad = cantidad;
        this.cliente = cliente;
        this.sucursal = sucursal;
    }

    public int getN_prestamo() {
        return n_prestamo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Sucursal getSucursal() {
        return sucursal;
    }
    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }
    @Override
    public String toString() {
        return  "Prestamo" + n_prestamo + "Cantidad" + cantidad + "Cliente" + cliente + "Sucursal" + sucursal;
    }
}
