package Boletin2.CuentaBancaria;

public class RetirarCajero extends Thread{
    private Cuenta c;

    public RetirarCajero(String n, Cuenta c) {
        super(n);
        this.c = c;
    }

    public void run() {
        for (int i=1; i<4; i++) {
            c.RetirarDinero(30, getName());
        }
    }
}
