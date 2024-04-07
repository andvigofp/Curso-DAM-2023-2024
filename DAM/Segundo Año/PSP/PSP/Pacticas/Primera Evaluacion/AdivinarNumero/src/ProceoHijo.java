import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class ProceoHijo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroAdivinar = random.nextInt(100) + 1; // Número aleatorio entre 1 y 100
        int intentos = 5;

        System.out.println("Estoy pensando en un número entre 1 y 100. ¡Adivina!");

        try (PrintWriter writer = new PrintWriter(new FileWriter("resultado.txt", true))) {
            writer.println("Estoy pensando en un número entre 1 y 100. ¡Adivina!");

            while (intentos > 0) {
                writer.print("Introduce tu intento: ");
                int intento = scanner.nextInt();

                if (intento == numeroAdivinar) {
                    writer.println("¡Enhorabuena! Has adivinado el número.");
                    System.exit(0);
                } else {
                    writer.println("Intento incorrecto. Te quedan " + (--intentos) + " intentos.");
                }
                writer.flush();
            }

            writer.println("Lo siento, has agotado tus intentos. El número era: " + numeroAdivinar);

        } catch (IOException e) {
            e.printStackTrace();
            System.exit(-1);
        }
    }
}
