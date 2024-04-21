package org.andres.Examen.Caja;

public class Terminal extends Thread{
    private String nombre;
    private Caja caja;
    private double pagos=0;

    public Terminal(String nombre, Caja caja) {
        this.nombre = nombre;
        this.caja = caja;
    }

    public void run() {
        double imp=0;
        for (int i=0; i<200; i++) {
            imp = Math.random()*100;
            caja.sumarImporte(imp);
            pagos +=imp;

        }
        System.out.println("Terminal " +nombre + " factura " + pagos);
    }
}
