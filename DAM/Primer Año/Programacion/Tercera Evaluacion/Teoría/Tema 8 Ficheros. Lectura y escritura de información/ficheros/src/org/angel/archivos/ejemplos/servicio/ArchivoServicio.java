package org.angel.archivos.ejemplos.servicio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ArchivoServicio {
    public void crearArchivo(String nombre){

        File archivo = new File (nombre);
        try {
            FileWriter escritor = new FileWriter(archivo,true); // con true permite añadir contenido al final del archivo
            escritor.append("hola qué tal estás ?\n")
                    .append("Todo bien ? Yo aquí estoy escribiendo un archivo... \n")
                    .append("nos vemos en breve !!\n");
             escritor.close();
            System.out.println("El archivo se ha creado con éxito ");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
