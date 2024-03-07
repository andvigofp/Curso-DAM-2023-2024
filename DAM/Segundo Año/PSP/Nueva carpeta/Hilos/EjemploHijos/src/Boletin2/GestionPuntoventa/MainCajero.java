package Boletin2.GestionPuntoventa;

public class MainCajero {
    public static void main(String[] args) {


        int total;
        Cajero comaprtido = new Cajero("Cajero Sanjurgo badía");

        Terminal t1 = new Terminal("terminal1", comaprtido);
        Terminal t2 = new Terminal("terminal2", comaprtido);
        Terminal t3 = new Terminal("terminal3", comaprtido);

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            System.out.println("Interrucpción");
        }
        total = comaprtido.mostrarLocaliades();

        System.out.println("En total se vendieron " + total + " localidaes.");
    }


}
