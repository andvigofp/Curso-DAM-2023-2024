import java.io.*;

public class Lanzador {
    public static void main(String[] args) throws IOException {
        File directorio = new File(".\\out\\production\\Argumentos");
        ProcessBuilder pb = new ProcessBuilder("java", "Argumentos", "1");
        pb.directory(directorio);
        Process p = pb.start();

        try {
            InputStream er = p.getErrorStream();
            BufferedReader brer = new BufferedReader(new InputStreamReader(er));
            String line = null;
            while ((line = brer.readLine()) != null)
                System.out.println("Error >" + line);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        int exitVal;
        try {

            exitVal = p.waitFor();
            System.out.println("Valor de salida: " + exitVal);
            switch (exitVal) {
                case (0):
                    System.out.println("Final correcto...");
                    break;
                case (1):
                    System.out.println("Falta argumento...");
                    break;
                case (2):
                    System.out.println("Parametro no numértico");
                    break;
                case (3):
                    System.out.println("Parametro menor que 0...");
                    break;
            }
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    }
