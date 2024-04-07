package Boeltin1.Finonacci;

public class Finonacci extends Thread {
    public void run() {
        double primero=0, segundo=1, siguiente;
        for (int i = 0; i < 100; i++) {
            System.out.println(primero + "");
            siguiente = primero + segundo;
            primero = segundo;
            segundo = siguiente;


        }
    }
}
