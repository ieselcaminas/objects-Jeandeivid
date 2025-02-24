package Ejercicio3;

public class Main {
    public static void main(String[] args) {
        Cuenta c1 = new Cuenta("Juan", 700);
        Cuenta c2 = new Cuenta("Pedro", 300);
        Cuenta c3 = new Cuenta("Juan", 900);
        Cuenta c4 = new Cuenta("Pedro", 2000);

        System.out.println("=======Cuentas en banco=======");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);

        c1.retirar(100);
        c2.retirar(100);
        c3.retirar(100);
        c4.retirar(100);

        System.out.println("\nCuentas actualizadas: ");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
    }
}