package Ejercicio7;

public class Ejemplar {
    private int n_reg;
    private Libro libro;
    private Historico historico;

    public Ejemplar(int n_reg, Libro libro, Historico historico) {
        this.n_reg = n_reg;
        this.libro = libro;
        this.historico = historico;
    }

    public int getN_reg() {
        return n_reg;
    }
    public void setN_reg(int n_reg) {
        this.n_reg = n_reg;
    }

    public Libro getLibro() {
        return libro;
    }
    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Historico getHistorico() {
        return historico;
    }
    public void setHistorico(Historico historico) {
        this.historico = historico;
    }

    @Override
    public String toString() {
        return n_reg + " " + libro;
    }
}
