package org.andres.Ejercicios.PracticasPSP.ProductorConsumdidor;

public class Consumidor extends Thread{
    private Cola cola;
    private int n;

    public Consumidor(Cola cola, int n) {
        this.cola = cola;
        this.n = n;
    }

    @Override
    public void run() {
        char[] caracteres;
        String texto;
        do {
            texto = cola.consumir();
            if (!texto.equals("*")) {
                caracteres = texto.toUpperCase().toCharArray();
                for (char car : caracteres) {
                    System.out.println(car);
                }
            }
        } while (!texto.equals("*"));
        System.out.println("Consumidor finalizado");
    }
}
