package org.angel.archivos.ejemplos;

import org.angel.archivos.ejemplos.servicio.ArchivoServicio;

public class EjemploCrearArchivo {
    public static void main(String[] args) {
        String nombreArchivo = "D:\\Proyectos_Intelli\\ficherosAlmacen\\java.txt";
        ArchivoServicio service = new ArchivoServicio();
        service.crearArchivo(nombreArchivo);

    }
}
