package Ejercicio3;

import java.io.*;

public class Productor extends Thread{
    /**
     * Usando un modelo productor- consumidor, crea un productor que lea caracateres de un
     * fichero de texto cuyo nombre recibirá a través de su consructor.
     * El consumidor obtendrá los datos que produzca el productor y los mostrará por
     * pantalla.
     * Muestra al final del proceso del productor y del consumidor un mensaje indicando que
     * el proceso ha finalizado.
     *
     */

    private char caracteres;
    private File file;


    public Productor(char caracteres, File file) {
        this.caracteres = caracteres;
        this.file = file;
    }

    public void run() {
        file = new File("./Fichero.txt");

        try {
            FileReader leer = new FileReader(file);
            BufferedReader leerfichero = new BufferedReader(leer);

            String linea = leerfichero.readLine();
            System.out.println(linea);

            sleep(1000);

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            System.out.println("Interrupcion del hilo...");
        }
    }


}
