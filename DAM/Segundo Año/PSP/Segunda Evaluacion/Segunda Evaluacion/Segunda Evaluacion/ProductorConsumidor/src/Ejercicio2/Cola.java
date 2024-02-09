package Ejercicio2;

public class Cola {
    /**
     * Implementa una aplicación compuesta por 3 clases:
     *  Una cola, que será el obto compartido.
     *  Un productor y consumdior.
     * El productor generá 10 números, los isnsertará en el objeto Cola, tras hacer un
     * peuqño slepp. El consumidor los leerá, los mostrará por pantalla
     */

    private int numero;
    private boolean lleno=false;

    public synchronized int vacio() {
        while (lleno==false) {
            try {
                wait();
            }catch (InterruptedException e) {
                System.out.println("Interroputir del hilo...");
            }
        }
        lleno=false;
        notifyAll();
        return numero;
    }

    public synchronized void llenar(int valor) {
        while (lleno==true) {
            try {
                wait();
            }catch (InterruptedException e) {
                System.out.println("Interruppcion del hilo...");
            }
        }
        numero=valor;
        lleno=true;
        notifyAll();
    }
}
