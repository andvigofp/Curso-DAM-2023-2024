package Ejercicios.Examen.Cajero;

public class Terminal extends Thread{
   CajaCentral cajaCentral = new CajaCentral();
   private String nombre;

    public Terminal(CajaCentral cajaCentral, String nombre) {
        this.cajaCentral = cajaCentral;
        this.nombre = nombre;
    }

    @Override
    public void run() {
        double cantidad, acumuladoTerminal=0;
        for (int i=0; i<20; i++) {
            cantidad=Math.random()*100;
            cajaCentral.facturar(cantidad);
            acumuladoTerminal+=cantidad;

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("La terminal con nombre: " + nombre + " ha acumulado " + acumuladoTerminal);
    }
}
