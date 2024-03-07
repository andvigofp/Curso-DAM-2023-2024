import java.io.*;

public class ProcesoLanzador {
    public static void main(String[] args) {
        try {
            // Lanzar el proceso de adivinanza
            ProcessBuilder pb = new ProcessBuilder("java", "ProceoHijo");
            pb.directory(new File(".\\out\\production\\AdivinarNumero"));
            Process p = pb.start();

            // Obtener el flujo de salida al proceso hijo
            try (OutputStream outputStream = p.getOutputStream();
                 PrintWriter ps = new PrintWriter(outputStream, true);
                 BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in, "UTF-8"));
                 BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream(), "UTF-8"))) {

                // Crear un contador para los intentos
                int intentos = 5;

                while (intentos > 0) {
                    // Mostrar el número de intentos restantes
                    System.out.println("Te quedan " + intentos + " intentos.");

                    // Leer mensaje del proceso hijo
                    String mensajeProcesoHijo = reader.readLine();
                    System.out.println(mensajeProcesoHijo);

                    // Verificar si la entrada es correcta y ajustar el contador
                    if (mensajeProcesoHijo.startsWith("¡Enhorabuena!")) {
                        System.out.println("¡Enhorabuena! Has acertado el número.");
                        break;
                    } else if (mensajeProcesoHijo.startsWith("Intento incorrecto")) {
                        intentos--;
                    }

                    // Enviar entrada al proceso hijo
                    String entradaUsuario = teclado.readLine();
                    ps.println(entradaUsuario);
                }
            }

            // Esperar a que el proceso hijo termine
            p.waitFor();

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}