package Boletin2.GestionPuntoventa;

public class Terminal extends Thread{
    private Cajero c;
    private int ventas;

    public Terminal(String n, Cajero c) {
        super(n);
        this.c = c;
    }

    public void run() {
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        int total = c.getLocalidades() + ventas;
        System.out.println("El total de las Ventas " + total);
    }



}
