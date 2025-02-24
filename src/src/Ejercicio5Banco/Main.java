package Ejercicio5Banco;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List <Banco> bancos = new ArrayList<>();
        Banco santander = new Banco( "Santander", 1);
        bancos.add(santander);
        Sucursal sucursalSantander1 = new Sucursal("Castellon", 1, santander);
        santander.addSucursales(sucursalSantander1);

        Cliente daniel = new Cliente( "Daniel", 283123);
        Prestamo pDaniel = new Prestamo(1, 1000, daniel, sucursalSantander1);
            daniel.addPrestamo(pDaniel);

            sucursalSantander1.addPrestamo(pDaniel);

        Sucursal sucursalSantander2 = new Sucursal("Valencia", 2, santander);
        santander.addSucursales(sucursalSantander2);

        Banco nickel = new Banco( "Nickel", 2);
        bancos.add(nickel);
         Sucursal sucursalNickel1 = new Sucursal("Grao", 2, nickel);
         nickel.getSucursales().add(sucursalNickel1);

         for (Banco banco : bancos) {
             System.out.println(banco);
             for (Sucursal sucursal : banco.getSucursales()) {
                 System.out.println("\t" + sucursal);
             }
         }
        // Imprimir préstamos del cliente Daniel
        System.out.println("\nPréstamos de Daniel:");
        System.out.println(daniel);

        // Imprimir préstamos de la sucursal Santander Castellon
        System.out.println("\nPréstamos de la sucursal Santander Castellon:");
        System.out.println(sucursalSantander1);
    }
}
