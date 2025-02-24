package Ejercicio7;

import java.util.ArrayList;
import java.util.Date;

public class Historico {
    private Date data_p;
    private Date data_t;
    private ArrayList<Ejemplar> ejemplares;
    private ArrayList<Lector> lectores;

    public Historico(Date data_p, Date data_t){
        this.data_p = data_p;
        this.data_t = data_t;
        this.ejemplares = new ArrayList<>();
        this.lectores = new ArrayList<>();
    }

    public Date getData_p() {
        return data_p;
    }
    public void setData_p(Date data_p) {
        this.data_p = data_p;
    }

    public Date getData_t() {
        return data_t;
    }
    public void setData_t(Date data_t) {
        this.data_t = data_t;
    }

    public ArrayList<Ejemplar> getEjemplares() {
        return ejemplares;
    }
    public void añadirEjemplares(Ejemplar ejemplar) {
        ejemplares.add(ejemplar);
    }

    public ArrayList<Lector> getLectores() {
        return lectores;
    }
    public void añadirLectores(Lector lector) {
        lectores.add(lector);
    }

    @Override
    public String toString() {
        return "Historico{" + "data_p=" + data_p + ", data_t=" + data_t + '}';
    }

}
