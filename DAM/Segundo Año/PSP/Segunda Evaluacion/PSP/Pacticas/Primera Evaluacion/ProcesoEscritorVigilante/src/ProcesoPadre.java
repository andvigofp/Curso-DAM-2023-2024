import java.io.*;
import java.util.Scanner;

public class ProcesoPadre {
    public static void main(String[] args) {
        try {
            ProcessBuilder pbEscitor= new ProcessBuilder("java", "ProcesoEscritor");
            pbEscitor.directory(new File(".\\out\\production\\ProcesoEscritorVigilante"));
            pbEscitor.redirectErrorStream(true);
            Process procesoEscritor = pbEscitor.start();
            procesoEscritor.waitFor();

            ProcessBuilder pbVigilante = new ProcessBuilder("java", "ProcesoVigilante");
            pbVigilante.directory(new File(".\\out\\production\\ProcesoEscritorVigilante"));
            Process procesoVigilante = pbVigilante.start();

            BufferedReader reader = new BufferedReader(new InputStreamReader(procesoVigilante.getInputStream()));
            int errorCount = 0;

            while (true) {
                String line = reader.readLine();
                System.out.println(line);

                if (line == null) {
                    break;
                }
                if (line.contains("Error")) {
                    errorCount++;
                }
            }

            FileWriter errorFileWriter = new FileWriter("errors.txt");
            errorFileWriter.write("Número de errores: " + errorCount);
            errorFileWriter.close();

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
