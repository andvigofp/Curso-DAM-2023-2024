import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

/* Escritura de en fichero
  Empleando la clase File
 */
public class InsertarDatosFichero {
    public static void main(String[] args) {

 try {

     BufferedWriter bw = new BufferedWriter(new FileWriter("fruta.txt"));
     bw.write("naranja\n");
     bw.write("manzana\n");
     bw.write("limón\n");
     bw.write("pepino\n");

     bw.close();;

 } catch ( IOException ioe) {

     System.out.println("Ha sido imposible escribir en el fichero ");
 }


    }

}
