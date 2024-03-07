package E1;

public class HiloPrincipal extends Thread {
    public void run() {
        System.out.println();
        for (int i=0; i<=30; i++) {
            System.out.println("NO");
        }
    }
}
