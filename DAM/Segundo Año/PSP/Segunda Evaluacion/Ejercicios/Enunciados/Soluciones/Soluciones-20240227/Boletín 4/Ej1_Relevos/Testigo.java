package Ej1_Relevos;

public class Testigo {
    private int siguiente;

    Testigo() {
        this.siguiente = 0;
    }

    synchronized public void next(int id) {
        this.siguiente = id;
        // Despierto a todos los threads
        // ya que no se sabe cuál de ellos se va a ejecutar
        notifyAll();
    }

    synchronized public void check(int id) throws InterruptedException {
        while (siguiente != id) {
            // Se bloquea hasta que sea su turno
            wait();
        }
    }
}
