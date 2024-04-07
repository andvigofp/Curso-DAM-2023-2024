package Boletin3.Ej4;

/**
 * Se trata de simular el comienzo de una clase. Los alumnos llegarán y esperán hasta
 * que llegue el profesor y salude para que comience la clase.
 * Los alumnos y el profesor compartirán un objector de la clase Bienvenida, con dos
 * métodos sincronizados:
 * - Uno donde los alumnos lleguen y saludan el profesor (se quedan esperando
 *  mientras el profesor no llegue)
 *  - Otro donde el profesor llega e inidca que la clase pueda comenzar,
 *   notificándoselo a los alumnos.
 */
public class Profesor extends Thread{
    Bienvenida bienvenida;
    String quien;

    public Profesor(Bienvenida bienvenida, String quien) {
        super(quien);
        this.quien=quien;
        this.bienvenida = bienvenida;
    }


    @Override
    public void run() {

        try {
            Thread.sleep(1000);
            bienvenida.LlegadaProfesor(quien);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}

