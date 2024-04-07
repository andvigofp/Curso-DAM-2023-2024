package Ejercicio3;

public class Consumidor extends Thread{
    private Productor productor;
    private char caracteres;


    public Consumidor(Productor productor, char caracteres) {
        this.productor = productor;
        this.caracteres = caracteres;
    }

    public void run() {
        char valor='0';
        for (int i=0; i<caracteres; i++ ) {
        }
    }
}
