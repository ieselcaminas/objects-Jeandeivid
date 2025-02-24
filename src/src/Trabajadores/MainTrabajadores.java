package Trabajadores;

public class MainTrabajadores {
    public static void main(String[] args) {
        Directivo directivo = new Directivo("Daniel Tejedor Martinez");
        Oficial oficial = new Oficial("Carlos Andrei Buceag");
        Tecnico tecnico = new Tecnico("Saber Becis Abderrahmane Salma");
        Tecnico tecnico2 = new Tecnico("Albert Eduardo Grigore");
        System.out.println(directivo);
        System.out.println(oficial);
        System.out.println(tecnico);
        System.out.println(tecnico2);
    }
}
