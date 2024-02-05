import java.io.*;

public class ProcesoPadre {

    public static void main(String[] args) {
        try {
            ProcessBuilder pb = new ProcessBuilder("java", "ProcesoHijo");
            pb.directory(new File(".\\out\\production\\Colores"));
            pb.redirectErrorStream(true);
            Process procesoHijo = pb.start();

            BufferedReader bufferedReaderHijo = new BufferedReader(new InputStreamReader(procesoHijo.getInputStream()));

            while (true) {
                // Leer el color elegido por el proceso hijo
                String colorElegido = bufferedReaderHijo.readLine();
                System.out.println("Color elegido: " + colorElegido);

                // Pedir al usuario que ingrese su elección de color
                System.out.print("Ingresa tu elección de color: ");
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                String eleccionUsuario = reader.readLine();

                // Enviar la elección del usuario al proceso hijo
                PrintWriter printWriter = new PrintWriter(procesoHijo.getOutputStream());
                printWriter.println(eleccionUsuario);
                printWriter.flush();

                // Verificar si la elección es correcta
                if (eleccionUsuario != null && eleccionUsuario.equalsIgnoreCase(colorElegido)) {
                    System.out.println("¡Felicidades! Has adivinado el color.");
                    break;
                } else {
                    System.out.println("Incorrecto. Inténtalo de nuevo.");
                }
            }

            int exitCode = procesoHijo.waitFor();
            System.out.println("El proceso hijo ha terminado con código de salida: " + exitCode);

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
