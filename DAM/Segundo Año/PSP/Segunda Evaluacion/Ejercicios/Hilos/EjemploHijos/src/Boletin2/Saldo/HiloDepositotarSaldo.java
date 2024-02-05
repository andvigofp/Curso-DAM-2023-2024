package Boletin2.Saldo;

/**
 *  Crear otra clase Thread, que realice ingresos de saldo desde el run.
 */
public class HiloDepositotarSaldo extends Thread{
    Saldo saldo;
    int cantidadDeposito;
    String nombre;

    public HiloDepositotarSaldo(Saldo saldo, int cantidadDeposito, String nombre) {
        this.saldo = saldo;
        this.cantidadDeposito = cantidadDeposito;
        this.nombre = nombre;
    }

    public void run() {
        saldo.ingeso(cantidadDeposito,nombre);
    }
}//hilo
