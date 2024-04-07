package Ejercicios.Examen.Recipiente;

public class Recipiente {
    private String cadena;
    private boolean lleno=false;

    public synchronized void Producir(String frase) {
        while (lleno==true) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        lleno=true;
        notifyAll();
        cadena=frase;
        notifyAll();
    }

    public synchronized String Consumir() {
        while (lleno==false) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        lleno=false;
        notifyAll();
        return cadena;
    }
}
