package Ejericicios.Ejercicio2;

import java.io.*;

public class Ejercicio2 {
    public static void main(String[] args)  {
        File f= new File("ejercico2.txt");

        try {
            FileWriter escribir = new FileWriter(f,true);
            escribir.write("Hola como estais todos");
            escribir.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            String texto;
            FileReader leer = new FileReader("ejercico2.txt");
            BufferedReader contenido = new BufferedReader(leer);
            while ((texto=contenido.readLine())!=null) {
                System.out.println(texto);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
