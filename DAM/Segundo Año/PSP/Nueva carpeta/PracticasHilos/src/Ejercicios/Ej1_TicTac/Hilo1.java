package Ejercicios.Ej1_TicTac;

public class Hilo1 extends Thread{
    public void run() {
        while (true) {
            System.out.print(" TIC ");
            try {
                sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}//tic
