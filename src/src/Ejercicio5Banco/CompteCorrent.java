package Ejercicio5Banco;

import java.util.ArrayList;
import java.util.List;

public class CompteCorrent {
    private int n_cc;
    private List<Cliente> clientes;
    private List<Domiciliacion> domiciliaciones;

    public CompteCorrent(int n_cc) {
        this.n_cc = n_cc;
        this.clientes = new ArrayList<>();
        this.domiciliaciones = new ArrayList<>();

    }

    public int getN_cc() {
        return n_cc;
    }


    public List<Domiciliacion> getDomiciliaciones() {
        return domiciliaciones;
    }

    public void addDomiciliaciones(Domiciliacion dom) {
        this.domiciliaciones.add(dom);
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void addClientes(Cliente clientes) {
        this.clientes.add(clientes);
    }
    @Override
    public String toString() {
        return "CompteCorrent | " + "n_cc=" + n_cc;
    }
}
