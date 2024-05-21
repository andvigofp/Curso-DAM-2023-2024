import java.io.*;


public class ManejoFicheroOpc2 {

    public static void main(String[] args) {

        try {

            BufferedReader br = new BufferedReader(new FileReader("malaga.txt"));
            String linea = "";
            while (linea != null) {

                System.out.println(linea);
                linea = br.readLine();

            }
            br.close();
        } catch (FileNotFoundException fnfe) { // qué hacer si no se encuentra el fichero
            System.out.println("No se encuentra el fichero malaga.txt");
        } catch (IOException ioe) { // qué hacer si no se consigue leer el fichero malaga.txt

            System.out.println("no se ha podido leer el fichero malaga.txt");

        }

    }
}
