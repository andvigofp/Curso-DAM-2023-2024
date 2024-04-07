package Contador;

public class Principal {
    public static void main(String[] args) {


        Contador c = new Contador(0);
        Thread hiloInc = new Thread(c);
        Thread hiloDec = new Thread(c);

        hiloInc.start();
        hiloDec.start();

        try {
            hiloInc.join();
            hiloDec.join();
            


        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
