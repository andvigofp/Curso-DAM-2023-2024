import java.io.*;
import java.util.Scanner;

public class CadenaPadre {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        String cadena;
        System.out.println("introduzca la cadena: ");
        cadena = teclado.nextLine();

        File directorio = new File(".\\");

        ProcessBuilder pb = new ProcessBuilder("java", "cadenaHijo",cadena);

        //Se establece el directorio donde se encuentra el ejecutable
        pb.directory(directorio);
        //Se ejecuta el proceso
        Process p = pb.start();
        try {
            InputStream er = p.getErrorStream();
            BufferedReader brer = new BufferedReader(new InputStreamReader(er));
            String liner = null;
            while ((liner = brer.readLine())!=null)
                System.out.println("ERROR > " + liner);
        }catch (IOException ioe) {
            ioe.printStackTrace();
        }

        //Comprobación dee la salida del programa
        int exitVal;
        try {
            exitVal = p.waitFor();
            System.out.println("Valor de salida: " + exitVal);
            switch (exitVal) {
                case (0):
                    System.out.println("FINAL CORRECTO...");
                    break;
                case (1):
                    System.out.println("FINAL INCORRECTO...");
                    break;
            }
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            InputStream is = p.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String linea;
            while ((linea = br.readLine())!=null) {
                System.out.println(linea);
            }
            br.close();
        }catch (Exception ee) {
            ee.printStackTrace();
        }
    }

}
