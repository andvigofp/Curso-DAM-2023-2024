package Boletin2.Saldo;

/**
 * 4. Crea una clase Saldo, con un atributo que se indique, y el constructor
 * el que se dará valor inicial al saldo. Contendrá varios métodos:
 * . Uno para obtener el saldo (incluir sleep)
 * . Otro para modificarlo (incluir sleep)
 * . Otro que realice un ingreso. Rcibe una cantidad y que la añade, informando por
 * pantalla de quién ha realizado ese ingreso y la cantidad resultante despúes del
 * ingreso.
 * Crear otra clase Thread, que realice ingresos de saldo desde el run.
 *
 * En el main, crear un objecto compartido Salod por todos lso hilos. Crear 3 hilos,
 * cada uno con un nommbre. Esperar a la finalización de todos los hilos para mostrar el
 * valor final del saldo.
 *
 */

public class Saldo{

   private int saldo;

    public Saldo(int saldo) {
        this.saldo = saldo;
    }

    public int getSaldo() {
        try {
            Thread.sleep((long) (Math.random() * 40 +1));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return saldo;
    }

    public void setSaldo(int saldo) {
        try {
            Thread.sleep((long) (Math.random() * 40 + 1));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        this.saldo = saldo;
    }

 synchronized void ingeso(int cantidad, String nombre) {
      int actual = (int) getSaldo();
     System.out.println("\"%s Deposita %d, El saldo actual es: %d %n\"");
     setSaldo(actual + cantidad);
     System.out.printf("%s El nuevo saldo es: %d  %n", nombre, getSaldo());
  }
}//Saldo
