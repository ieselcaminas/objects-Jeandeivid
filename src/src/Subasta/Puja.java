package Subasta;

public class Puja {
    private int n_puj;
    private double cuantia;
    private Pujadores pujador;
    private Lote lote;

    public Puja(int n_puj, double cuantia, Pujadores pujador, Lote lote) {
        this.n_puj = n_puj;
        this.cuantia = cuantia;
        this.pujador = pujador;
        this.lote = lote;
    }

    public int getN_puj() {
        return n_puj;
    }

    public void setN_puj(int n_puj) {
        this.n_puj = n_puj;
    }

    public double getCuantia() {
        return cuantia;
    }

    public void setCuantia(double cuantia) {
        this.cuantia = cuantia;
    }

    public Pujadores getPujador() {
        return pujador;
    }

    public void setPujador(Pujadores pujador) {
        this.pujador = pujador;
    }

    public Lote getLote() {
        return lote;
    }

    public void setLote(Lote lote) {
        this.lote = lote;
    }

    @Override
    public String toString(){
        return this.n_puj + " - " + this.cuantia;
    }
}