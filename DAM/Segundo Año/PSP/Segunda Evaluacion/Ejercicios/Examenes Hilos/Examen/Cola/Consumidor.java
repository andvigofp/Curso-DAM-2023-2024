package org.andres.Examen.Cola;

public class Consumidor extends Thread{
    private Cola cola;
    private String frase;

    public Consumidor(Cola cola) {
        this.cola = cola;
        this.frase = frase;
    }

    @Override
    public void run() {
        do {
            try {
                cola.get();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            frase = cola.getFrase();

            String cadenaMayusculas = frase.toUpperCase();
            int cuenta = cadenaMayusculas.length();

            System.out.println(cadenaMayusculas + " El número de caracteres es " + cuenta);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }while (!frase.equals("*"));
    }
}
