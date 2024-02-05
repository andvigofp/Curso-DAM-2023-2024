public class Hilos1 extends Thread {
    private int numero1;
    public void run() {
        numero1 = 1;
        while (true) {
            try {
                sleep(2);
                numero1 += 1;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public int getNumero1() {
        return numero1;
    }

}
