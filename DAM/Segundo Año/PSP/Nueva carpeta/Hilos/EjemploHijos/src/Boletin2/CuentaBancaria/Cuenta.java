package Boletin2.CuentaBancaria;

/**
 *5. Crear una clase Cuenta, con un atributo saldo y 3 métodos:
 * • Uno que devuelva el importe del saldo
 * • Otro que reste al saldo el importe a retirar de la cuenta (modifica el saldo)
 * • Otro que realice las comprobaciones para verificar que se puede efectuar la retirada (el
 * importe final debe ser 0 o superior), enviando en caso contrario el aviso correspondiente.
 * Posteriormente, crear otra clase denominada RetiradaDeCajero, que extienda de Thread. Cada hilo
 * que se cree de esta clase, recibirá un nombre concreto al ser creado, y trabajará sobre un objeto
 * Cuenta. Dentro de su método run(), se intentará realizar un número X de retiradas.
 * En el main, crear 2 hilos, uno para cada titular de la cuenta (Pepe, María).
 * Observaciones: el objeto Cuenta, será compartido por varios hilos.
 */
public class Cuenta {
    private int saldo;


    Cuenta (int s) {
        saldo = s;
    }

    int getSaldo() {
        return saldo;
    }

    void restar(int cantidad) {
        saldo = saldo - cantidad;
    }

    synchronized  void RetirarDinero(int cant, String nom) {
        if (getSaldo() >= cant) {
            System.out.println(nom + " SE VA A RETIRAR SALDO (ACTUAL ES: " + getSaldo() + ")");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            restar(cant);

            System.out.println("\t " + nom + " retira " + cant + ": ACTUAL (" + getSaldo() + ")");
        }else {
            System.out.println(nom + "No se puede retirar dinero, NO HAY SALDO SUFICIENTE (" + getSaldo() + ")" );
        }
        if (getSaldo() > 0) {
            System.out.println("SALDO NEGATIVO => " + getSaldo());
        }
    }//retirar
}
