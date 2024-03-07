package Boeltin1.E2;

public class Principal {
    public static void main(String[] args) {
        Hilo1 h1 = new Hilo1();
        Hilo2 h2 = new Hilo2();

        System.out.println("Ejecución A");
        h1.start();
        System.out.println("Ejecución B");
        h2.start();
        System.out.println("Ejecución main");
    }
}
