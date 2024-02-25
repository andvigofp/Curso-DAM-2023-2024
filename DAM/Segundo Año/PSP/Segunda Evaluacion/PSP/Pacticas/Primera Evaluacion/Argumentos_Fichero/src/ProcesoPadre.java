import java.io.*;

public class ProcesoPadre {
    public static void main(String[] args) throws IOException {
        File directorio = new File(".\\out\\production\\Argumentos_Fichero");
        ProcessBuilder pb = new ProcessBuilder("java", "ProcesoHijo","1");
        FileWriter fw = new FileWriter("salida.txt");
        FileWriter f = new FileWriter(".\\comentarios.txt");
        pb.directory(directorio);
        Process p = pb.start();

        try {
            InputStream er = p.getErrorStream();
            BufferedReader brer = new BufferedReader(new InputStreamReader(er));
            String line = " ";
            while ((line = brer.readLine()) !=null) {
                System.out.println("Error > " + line);
            }
        }catch (IOException ioe) {
            ioe.printStackTrace();
        }

        int exitVal;
        try {
           exitVal = p.waitFor();
            System.out.println("valor de salida " + exitVal);

            switch (exitVal) {
                case (0):
                    System.out.println("Final correcto...");
                    break;
                case (1):
                    System.out.println("Falta Argumento...");
                    break;
                case (2):
                    System.out.println("Parametro no numérico...");
                    break;
                case (3):
                    System.out.println("Parámetro menor que 0...");
                    break;

            }
            fw.write(String.valueOf(exitVal));
            InputStreamReader fr = new InputStreamReader(p.getInputStream());
            BufferedReader br = new BufferedReader(fr);
            String frase = br.readLine();
            f.write(frase);
        } catch (InterruptedException e) {
            throw  new RuntimeException(e);
        }

        finally {
           fw.close();
           f.close();

        }

    }
}
