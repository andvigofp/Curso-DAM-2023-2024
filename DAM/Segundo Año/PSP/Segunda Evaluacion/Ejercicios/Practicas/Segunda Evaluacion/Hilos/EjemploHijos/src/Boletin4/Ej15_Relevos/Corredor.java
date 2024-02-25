package Boletin4.Ej15_Relevos;
/**
 *  Escribe una clase llamada Relevos que simule una carrera de relevos de la siguiente forma:
 * * Cree 4 threads, que se quedarán a la espera de recibir alguna señal para comenzar a correr. Una vez creados los threads, se indicará que comience la carrera, con lo que uno de los threads deberá empezar a correr.
 * * Cuando un thread termina de correr, pone algún mensaje en pantalla y espera un par de segundos, pasando el testigo a otro de los hilos para que comience a correr, y terminando su ejecución (la suya propia).
 * * Cuando el último thread termine de correr, el padre mostrará un mensaje indicando que todos los hijos han terminado.
 *
 * El relevo se transfiere a través del objeto compartido. Existirá un atributo entero con el número del hilo que se ejecuta.
 * Hilo termina ejecución, incrementa turno y notifica el cambio.
 * Antes de ejecutarse cada hilo, comprueba si es su turno. Si no lo es, espera.
 *
 *
 * Ejemplo de ejecución:
 * Todos los hilos creados.
 * Doy la salida!
 * Soy el thread 1 corriendo . . .
 * Terminé. Paso el testigo al hilo 2
 * Soy el thread 2 corriendo . . .
 * Terminé. Paso el testigo al hilo 3
 * Soy el thread 3 corriendo . . .
 * Terminé. Paso el testigo al hilo 4
 * Soy el thread 4 corriendo . . .
 * Terminé!
 * Todos los hilos terminaron.
 */
public class Corredor extends Thread {
    private static final int MAX_DELAY = 1000;
    private int id;
    private Testigo testigo;

    Corredor(int id, Testigo t) {
        this.id = id;
        this.testigo = t;
    }

    public void run() {
        try {
            // Comprueba si es su turno, si no lo es, se bloquea
            testigo.check(id);

            System.out.println("Soy el thread " + id + " corriendo . . .");
            Thread.sleep((int) Math.random() * MAX_DELAY);
            if (id != 4) { // Si aún no llegó al final, paso el testigo al siguiente hilo
                int receptor = id + 1;
                System.out.println("Terminé. Paso el testigo al hilo " + receptor);
                testigo.next(receptor);
            } else {
                System.out.println("Terminé! Y soy el último...");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
