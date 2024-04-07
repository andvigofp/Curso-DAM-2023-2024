package Ejercicio2;

public class Productor extends Thread{
    private Cola cola;
    private int numero;

    public Productor(Cola cola, int numero) {
        this.cola = cola;
        this.numero = (int) (Math.random()*10);
    }

    public void run() {
        for (int i=0; i<10; i++) {
            cola.llenar(i);
            System.out.println("Productor " + numero + " pone valor " + i);

            try {
                sleep(1000);
            } catch (InterruptedException e) {

            }
            System.out.println("Interrupción del hilo..");
        }
    }
}
