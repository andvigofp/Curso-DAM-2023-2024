package Boletin2.RecursoCompartido;

public class ContadorHilo extends Thread{
    String nombre;
    Contador obj;


    public ContadorHilo(String nombre, Contador obj) {
        this.nombre = nombre;
        this.obj = obj;
    }

    public void run() {
        int valor;
        long tiempo;

        // ALTERNATIVA 1 CON BLOQUE SYNCHRONIZED
        //synchronized (obj) {

        for (int i=0; i<3; i++) {
            // ALTERNATIVA 1 CON BLOQUE SYNCHRONIZED
				/*valor = obj.getCont();
				System.out.println("Valor previo: " + valor);

				obj.setCont(++valor);
				System.out.println("Valor después: " + obj.getCont());
				// FIN ALTERNATIVA 1 CON BLOQUE SYNCHRONIZED
				*/

            // ALTERNATIVA 2 CON MÉTODO SYNCHRONIZED

            obj.incremento(nombre);
            try {
                tiempo = ((int) (Math.random()* 1000));
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                System.out.println("Interrupción");
            }
        }
        System.out.println("FIN...: " + nombre);
    }

}
