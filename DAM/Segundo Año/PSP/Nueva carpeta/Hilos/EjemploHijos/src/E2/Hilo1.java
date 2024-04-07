package E2;

public class Hilo1 extends Thread {
    public void run() {
        System.out.println();
        for (int i = 0; i <= 30; i++) {
            System.out.println("NO");
        }
    }
}
