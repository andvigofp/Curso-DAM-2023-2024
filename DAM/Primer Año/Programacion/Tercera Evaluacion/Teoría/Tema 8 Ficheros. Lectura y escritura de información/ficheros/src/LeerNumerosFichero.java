import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/* CAlcula la media de una serie de números que pasamos por fichero separados por comas*/

public class LeerNumerosFichero {

    public static void main(String[] args) {

        System.out.println("Introduzca el nombre del archivo donde se encuentran los números ");

        Scanner sc = new Scanner(System.in);
        String nombreFichero = sc.nextLine();

        try {
            BufferedReader br = new BufferedReader(new FileReader(nombreFichero));
            String linea = "0";
            int i = 0;
            double suma = 0;
            while (linea != null) {

                i++;
                suma += Double.parseDouble(linea);
                linea = br.readLine();

            }
            i--;

            br.close();
            System.out.println("La media es " + suma / (double)i);
        } catch (IOException ioe){

            System.out.println("ioe.getMessage() = " + ioe.getMessage());
        }


        }
    }

