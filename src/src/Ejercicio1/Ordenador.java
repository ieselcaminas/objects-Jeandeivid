package Ejercicio1;

public class Ordenador {
    private String marca;
    private String modelo;
    private double precio;
    private int ram;
    private int almacenamiento;

    public Ordenador(String marca, String modelo, double precio, int ram, int almacenamiento) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.ram = ram;
        this.almacenamiento = almacenamiento;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Ordenador(" + "marca: " + marca + ", modelo: " + modelo + ", precio:" + precio + ", ram: " + ram + ", almacenamiento: " + almacenamiento + ")";
    }
}
