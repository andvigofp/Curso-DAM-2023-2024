package Boeltin1.FicherosTexto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Implementa un programa que reciba a través de sus argumentos una lista de ficheros
 * de texto y cuente el número de caracteres que hay en cada fichero.
 * Modifica el programa para que se cree un hilo por cada fichero a contar. Muestra lo
 * que se tarda en
 * contar cada fichero en la forma secuencial, Y a continuación empleado hilos. Para
 * calcular el tiempo
 * que tarda en ejecutarse un proceso podemos usar el método System.currentTimeMillis()
 * de la siguientye manera:
 *
 * long t_comienzo, t_fin
 * t_comienzo = System.currentTimeMillis();
 * proceso();
 * t_fin = System.currentTimeMillis();
 * long tiempoTotal = t_fin - t_comienzo;
 * System.out.println("El proceso ha tardado: " + tiempototal + " miliseg")
 */
public class ContadorCaracteresConHilos implements Runnable {
    private final String archivo;

    public ContadorCaracteresConHilos(String archivo) {
        this.archivo = archivo;
    }

    @Override
    public void run() {
        contarCaracteres(archivo);
    }


    private static void contarCaracteres(String archivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            int conteo = 0;
            int c;
            while ((c = br.read()) != -1) {
                System.out.print((char) c);  // Imprimir cada carácter
                conteo++;
            }
            System.out.println("\nArchivo " + archivo + " tiene " + conteo + " caracteres.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}


