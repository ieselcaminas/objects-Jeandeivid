package Ejercicio1;

public class Main {
    public static void main(String[] args) {
        Ordenador o1 = new Ordenador("HP","Pavilion",1000,8,500);
        Ordenador o2 = new Ordenador("Dell","Inspiron",1200,16,1000);
        Ordenador o3 = new Ordenador("Lenovo","Thinkpad",1500,32,2000);
        Ordenador o4 = new Ordenador("Asus","Zenbook",2000,64,4000);
        Ordenador o5 = new Ordenador("Acer","Aspire",2500,128,8000);

        System.out.println("=======Ordenadores en tienda=======");
        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);
        System.out.println(o4);
        System.out.println(o5);

        o1.setPrecio(1200);
        System.out.println("\nPrecio actualizado o1: " + o1.getPrecio());
    }
}