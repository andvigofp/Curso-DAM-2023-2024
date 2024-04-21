package org.andres.Examen.Caja;



public class Main {
    public static void main(String[] args) {
        double total;

        Caja compartido = new Caja("Caja central");

        Terminal t1= new Terminal("terminal 1", compartido);
        Terminal t2 =  new Terminal("Terminal 2", compartido);
        Terminal t3 =  new Terminal("Terminal 3", compartido);

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        total = compartido.mostarImporte();
        System.out.println("En total se factura " + total + " euros.");
    }
}
