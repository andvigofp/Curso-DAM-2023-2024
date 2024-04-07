package FicherosTexto;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Principal {
    public static void main(String[] args) {
        //Nombres de archivos
        String[] archivos = {"archivo1.txt", "archivo2.txt", "archivo3.txt"};

        //Crear archivos si no existen
        try {
            for (String archivo : archivos) {
                crearArchivoSiNoExiste(archivo);
            }
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        //Medir el tiempo para la ejecución con hilos
        long tComienzoHilos = System.currentTimeMillis();
        LanzadorHilos.lanzarHilos(archivos);
        long tFinHilos = System.currentTimeMillis();
        long tiempoTotalHilos = tFinHilos - tComienzoHilos;
        System.out.println("Tiempo con hilos: " + tiempoTotalHilos + " milisegundos");
    }

    private static void crearArchivoSiNoExiste(String nombreArchivo) throws IOException {
        //Verificar si el archivo ya existe
        if ((!java.nio.file.Files.exists(java.nio.file.Paths.get(nombreArchivo)))) {
            //Si no existe, crear el archivo con algún contenido de prueba
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
                writer.write(" Este es un contenido de prueba. ");
            }
            System.out.println("Archivo " + nombreArchivo + " creado.");
        } else {
            System.out.println("Archivo " + nombreArchivo + " ya existe.");
        }
    }
}