package Ejercicios.Ej1_TicTac;

public class Hilo2 extends Thread {
    public void run() {
        while (true) {
            System.out.print(" TAC ");
        try {
            sleep(40);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }//tac
}
}
