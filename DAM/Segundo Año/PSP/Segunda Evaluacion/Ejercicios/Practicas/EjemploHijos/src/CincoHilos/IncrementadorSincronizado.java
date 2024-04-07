package CincoHilos;

public class IncrementadorSincronizado implements Runnable {
    int contador;
    @Override
    public void run() {
        for (int i = 0; i < 5000; i++) {
            synchronized (Principal.class) {
               contador++;
            }
    }
}
}