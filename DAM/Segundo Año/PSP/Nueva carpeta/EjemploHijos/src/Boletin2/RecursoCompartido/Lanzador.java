package Boletin2.RecursoCompartido;

public class Lanzador {
    public static void main(String[] args) {
        Contador compartido = new Contador();

        ContadorHilo h1  = new ContadorHilo("hilo1", compartido);
        ContadorHilo h2  = new ContadorHilo("hilo2", compartido);
        ContadorHilo h3  = new ContadorHilo("hilo3", compartido);
        ContadorHilo h4  = new ContadorHilo("hilo4", compartido);

        h1.start();
        h2.start();
        h3.start();
        h4.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Interrupción");
        }
    }
}
