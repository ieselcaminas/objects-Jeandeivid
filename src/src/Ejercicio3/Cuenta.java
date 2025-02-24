package Ejercicio3;

public class Cuenta {
    private String titular;
    private double cantidad;

    public Cuenta (String titular) {
        this(titular, 0.0);
    }
    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad < 0 ? 0 : cantidad;
    }
    public void retirar (double monto){
        cantidad = Math.max(0, cantidad - monto);
    }
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    @Override
    public String toString() {
        return "Cuenta(" + "Titular: " + titular + " Cantidad: " + cantidad + ')';
    }
}
