package org.andres.Ejercicios.PracticasPSP.ProductorConsumdidor;

public class Cola {
    private String texto;
    private boolean disponible=false;

    public synchronized String consumir() {
        while (!disponible) {
            try {
                wait();
            }catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Se consume: " + texto);
        disponible=false;
        notify();;
        return texto;
    }

    public synchronized void producir(String valor) {
        while (disponible) {
            try {
                wait();
            }catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        texto=valor;
        disponible=true;
        System.out.println("Se produce: " + texto);
        notify();
    }
}
