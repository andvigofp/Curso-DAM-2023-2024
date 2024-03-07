package Ejercicios.Examen.Cajero;

public class CajaCentral extends Thread {
    private double cantidad;

    public CajaCentral() {
        cantidad = 0;
    }

    public synchronized double getCantidad() {
        return cantidad;
    }
    public synchronized void facturar(double can) {
        cantidad+=can;
    }
}
