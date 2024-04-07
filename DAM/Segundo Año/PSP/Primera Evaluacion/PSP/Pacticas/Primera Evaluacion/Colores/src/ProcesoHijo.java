import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Random;

public class ProcesoHijo {

    public static void main(String[] args) {
        String[] colores = {"Rojo", "Verde", "Azul", "Amarillo", "Naranja", "Rosa", "Morado", "Gris", "Blanco", "Negro"};
        Random random = new Random();

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8))) {
            while (true) {
                // Escoger un color aleatorio
                int indiceColor = random.nextInt(colores.length);
                String colorElegido = colores[indiceColor];

                // Mostrar el color elegido
                System.out.println("Color elegido: " + colorElegido);

                // Leer la elección del usuario desde la entrada estándar
                System.out.print("Adivina el color: ");
                String eleccionUsuario = bufferedReader.readLine();

                // Enviar la respuesta al proceso padre
                if (eleccionUsuario != null && eleccionUsuario.equalsIgnoreCase(colorElegido)) {
                    System.out.println("¡Correcto! Has adivinado el color.");
					break;
                } else {
                    System.out.println("Incorrecto. Inténtalo de nuevo.");
                }

                // Dormir durante un segundo para evitar el bucle infinito demasiado rápido
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
