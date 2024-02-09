import java.util.Random;
import java.util.Scanner;

public class MetodoRandom {
    public static void numerosRandom(int numeros[], int numRandom) {
        Random random = new Random();

        for (int i=0; i<numeros.length; i++) {
            numeros[i] = random.nextInt(numRandom + 1);
        }

    }

    public static void pedirNumeros(int numeros[]) {
        Scanner  teclado = new Scanner(System.in);
        for (int i=0; i<numeros.length; i++) {
            System.out.println("Dime un valor: " + i);
            numeros[i] = teclado.nextInt();
        }

    }
}
