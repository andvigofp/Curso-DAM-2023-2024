package org.andres.archivos.ejemplos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class InsertarInformacionFichero {
    public static void main(String[] args) {
       BufferedWriter bw = null;
       FileWriter fw = null;

        try {
            String f = "\nHola como estás";
            File file = new File("archivo.txt");

            if (!file.exists()) {
                //Crear el fichero
                file.createNewFile();
                }
                // Método para insertar un texto al final del fichero, sin sobrescrevir
                fw = new FileWriter(file.getAbsoluteFile(),true);
                bw = new BufferedWriter(fw);
                bw.write(f);
                System.out.println("Información agregada! ");
                }catch (IOException ioe) {
            System.out.println("Ha sido impòsible escribir en el fichero. ");
        }
        try {
            if (bw != null) {
                bw.close();
            }
            if (fw !=null) {
                fw.close();
            }
        }catch (IOException e) {
            System.out.println("Ha sido impòsible escribir en el fichero. ");
        }
    }

        }



