public class Hilos2 extends Thread{
    private int numero2;

    public void run() {
        numero2 = 1;
        while (true) {
            try {
                sleep(2);
                numero2 += 50;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    public int getNumero2() {
        return numero2;
    }

}
