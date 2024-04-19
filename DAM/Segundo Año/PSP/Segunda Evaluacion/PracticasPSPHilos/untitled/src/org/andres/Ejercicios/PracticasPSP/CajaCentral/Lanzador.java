package org.andres.Ejercicios.PracticasPSP.CajaCentral;

public class Lanzador {
    public static void main(String[] args) {
        CajaCentral cajaCentral = new CajaCentral();
        Terminal t1= new Terminal(cajaCentral, "Terminal 1");
        Terminal t2= new Terminal(cajaCentral, "Terminal 2");
        Terminal t3= new Terminal(cajaCentral, "Terminal 3");
        Terminal t4= new Terminal(cajaCentral, "Terminal 4");
        t1.start();
        t2.start();
        t3.start();
        t4.start();


            try {
                t1.join();
                t2.join();
                t3.join();
                t4.join();
            }catch (InterruptedException e) {
                throw new RuntimeException(e);
        }
        System.out.println("El acumulado total de la caja central es: " +cajaCentral.getCantidad());
    }
}
