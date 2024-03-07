import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) {
        Hilos1 hilos1 = new Hilos1();
        Hilos2 hilos2 = new Hilos2();

        hilos1.start();
        hilos2.start();

        while (true){
            System.out.println("numero1 \t" + hilos1.getNumero1());
            System.out.println( "numero2 \t" + hilos2.getNumero2());
            try {
                sleep(2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }


}