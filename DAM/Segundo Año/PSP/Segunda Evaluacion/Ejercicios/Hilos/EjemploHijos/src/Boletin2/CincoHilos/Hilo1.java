package Boletin2.CincoHilos;

/**
 * 2. Crea un programa Java que lance 5 hilos, cada uno incrementará una variable contador de tipo entero,
 * compartida por todos, 5000 veces y luego saldrá. Comprobar el resultado final de la variable. ¿Se
 * obtiene el resultado correcto? Ahora sincroniza el acceso a dicha variable.
 */
public class Hilo1 extends Thread{
    int contador=0;


    public Hilo1(int contador) {
        this.contador = contador;
    }


    public int getContador() {
        return contador;
    }


    public void incrementa() {
        contador++;
    }

    public void run() {
        for (int i=0; i<5000; i++) {
            incrementa();
            this.getContador();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
