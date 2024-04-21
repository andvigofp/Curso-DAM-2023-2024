package org.andres.Boletin4.Relevo;

public class Corredor extends Thread{
    private static final int MAX_DELAy=1000;
    private int id;
    private Testigo testigo;

    Corredor(int id, Testigo t) {
        this.id = id;
        this.testigo = t;
    }

    public void run() {
        try {
            testigo.check(id);
            System.out.println("Soy el thread " + id + " corriendo...");
            Thread.sleep((int) Math.random() *  MAX_DELAy);
            if (id !=4) {
                int repector = id +1;
                System.out.println("Terminé. Paso el testigo al hilo " + repector);
                testigo.next(repector);
            }else {
                System.out.println("Terminé !");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
