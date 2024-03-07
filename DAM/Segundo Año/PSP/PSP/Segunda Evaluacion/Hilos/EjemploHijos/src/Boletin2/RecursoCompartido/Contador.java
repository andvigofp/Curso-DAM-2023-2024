package Boletin2.RecursoCompartido;

/**
 * 3. Crea una clase Boletin2.Contador que será el recursivo compartido por hilos (lo que se demonima sección
 * crítica). En esta clase:
 * . Define un atributo de tipo entero, inicializado a 0
 * . Un método en que se devolverá el valor anterior
 * . Un método que establece (asigna) el valor actual a la variable
 * Clase ContadorHilo (el hilo), en donde cada hilo accederá tres veces al recurso
 * compartido Boletin2.Contador y lo incrementará en 1, luego dominará un tiempo aleatorio en
 * cada iteración.
 * Clase MainContador (el programa principal, main) que creará 4 hilos (se les pasará)
 * el nombre del hilo y un objecto de la clase Boletin2.Contador, es decir, el recurso compartido
 * al que accederá) y se lanzan.
 */
public class Contador extends Thread {

    int contador = 0;


    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public synchronized void incremento(String nombre) {
        int valor = this.getContador();
        System.out.println("Valor previo: " + valor);

        this.setContador(++valor);
        System.out.println(nombre + " : Valor después: " + this.getContador());
}
}



