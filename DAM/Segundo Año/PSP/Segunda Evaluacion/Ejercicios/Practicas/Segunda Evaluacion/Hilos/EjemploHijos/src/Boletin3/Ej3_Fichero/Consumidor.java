package Boletin3.Ej3_Fichero;

public class Consumidor extends Thread {
    private Compartido comp;
    private String ping="PING";
    private String pong="PONG";

    public Consumidor(Compartido c, String ping, String pong) {
        comp = c;
        this.ping = ping;
        this.pong = pong;
    }

    public void run() {
        char valor;
        int i  = comp.get();
        while(i!= -1 ) {
            System.out.printf("%c [%d] %n",(char) i,ping,pong);
            i = comp.get(); //recoge el valor
        }
        System.out.println("\nFin consumidor "+ping + " " + pong);
    }
}
