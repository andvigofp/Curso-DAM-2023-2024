package org.andres.Examen.ColaMejorado;

public class Consumidor extends Thread{
    private Cola cola;
    private int n;

    public Consumidor(Cola cola, int n) {
        this.cola = cola;
        this.n = n;
    }

    public void run() {
        String[] caracteres;
        String texto;
        do {
            try {
                cola.get();
                texto=cola.getFrase();

                if (!texto.equals("*")) {
                    caracteres = texto.toUpperCase().split(" ");
                    for (String car : caracteres) {
                        System.out.println(car);
                    }
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }while (!texto.equals("*"));
    }
}
