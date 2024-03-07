package Boeltin1.HolaMundo;

import static java.lang.Thread.sleep;

/**
 * Crea un prgrama que implemente la interfaz Runnable cuya única funciopnalidad
 * visualizar el mensaje "Hola Mundo" seguido de una cadena que se recibará en el
 * constructor (es decir al crear un objecto de ese tipo se enciará una cadena) y
 * seguido 5 veces creando para ello 5 hilos difernetes usando la clase creada
 * anteriormente. Leugo haz que antes de visaulizar el mensaje el hilo espere un tiempo
 * porporcional a su identificador; usa para ello el método slepp(). ¿Qué diferencias
 * observas al ejecutar el programa usando o no el método sleep()?
 */
public class Hilo1 implements Runnable{
    String saludo;

    public Hilo1(String saludo) {
        this.saludo = saludo;
    }

    @Override
    public void run() {
        System.out.println("Hola Mundo");
        try {
           Thread.sleep(Thread.currentThread().getId()*10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Hola Mundo " + saludo + " " + Thread.currentThread().getId());
    }
}
