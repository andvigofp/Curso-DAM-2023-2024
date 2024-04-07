package HolaMundo;

public class Lanzador {
    public static void main(String[] args) {

       new Thread(new Hilo1("uno")).start();
        new Thread(new Hilo1("dos")).start();
        new Thread(new Hilo1("tres")).start();
        new Thread(new Hilo1("cuatro")).start();
        new Thread(new Hilo1("cinco")).start();
        }
    }

