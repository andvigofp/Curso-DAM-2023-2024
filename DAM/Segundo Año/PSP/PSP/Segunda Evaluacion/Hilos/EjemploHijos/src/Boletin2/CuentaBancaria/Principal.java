package Boletin2.CuentaBancaria;

public class Principal {
    public static void main(String[] args) {
        Cuenta c = new Cuenta(100);
        RetirarCajero francisco = new RetirarCajero("Ángel", c);
        RetirarCajero nolito = new RetirarCajero("Luisa", c);

        francisco.start();
        nolito.start();
    }
}
