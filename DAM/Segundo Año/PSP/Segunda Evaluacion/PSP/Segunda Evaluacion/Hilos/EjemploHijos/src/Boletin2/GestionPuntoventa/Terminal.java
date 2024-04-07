package Boletin2.GestionPuntoventa;

public class Terminal extends Thread{
    private String nombre;
    private Cajero objeto;
    private int loc=0;

    public Terminal(String n, Cajero c) {
        super(n);
        objeto = c;
    }



    public void run() {
      for (int i=0; i< 20000; i++) {
          objeto.incrementar();
          loc++;
      }
        System.out.println("Terminal: " + this.nombre + " vendido " + loc);
     }



}
