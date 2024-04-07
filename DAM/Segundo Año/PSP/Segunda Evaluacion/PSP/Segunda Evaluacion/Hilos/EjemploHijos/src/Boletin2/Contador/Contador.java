package Boletin2.Contador;

/**
 * Implementa una clase Boletin2.Contador, con atributo entero y 3 métodos (incrementa, decrementa y getValor)
 *
 * Definir 2 tipos (hiloInc, hiloDec), uno para decrementar y otro para incrementar dicho
 * contador (ejecutarán un bucle de X iteraciones, en las que se modifique el valor del contador según
 * corresponda, y a continuación un Thead.sleep), que cuenten con un atributo interno de tipo
 * Boletin2.Contador,
 *
 * En el main, crear 2 hilos, uno de cada clase, que se trabajen sobre un mismo objectivo Boletin2.Contador.
 */
public class Contador extends Thread{
    int contador;

    public Contador(int contador) {
        this.contador = contador;
    }

    public void incrementa () {
       contador++;
        }


    public void decrementa () {
        contador--;

        }

    public void getContador() {
        System.out.println(contador);
    }

    public void run() {

            for (int i = 0; i < 30; i++) {
                incrementa();

                this.getContador();
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }


            for (int i = 0; i < 30; i++) {
                decrementa();
                this.getContador();
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

}
