package Ejercicios.Ej2_Main;

public class Hilo implements Runnable{
   String cadena;

    Hilo(String cadena) {
        this.cadena = cadena;
    }


    public void run() {
     try {
         Thread.sleep(Thread.currentThread().getId() * 10);
     }catch (InterruptedException e) {
     }
        System.out.println("Hola Mundo " + cadena + " " + Thread.currentThread().getId());
    }
}
