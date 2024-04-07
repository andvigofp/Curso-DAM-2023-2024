import java.util.Scanner;

public class CuentaPositivos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Por favor, vaya introduciendo números y pulsando INTRO.");
        System.out.println("Para terminar, introduzca un número negativo.");

        int numeroIntroducido = 0;
        int cuentaNumeros = 0;
        int suma = 0;
        while (numeroIntroducido >= 0) {

            numeroIntroducido = teclado.nextInt();
            //cuentaNumeros++; // Incrementa en uno la variable
            //suma += numeroIntroducido; // Equivale a suma = suma + NumeroIntroducido
        }
        System.out.println("Has introducido " + (cuentaNumeros - 1) + " números positivos.");
        System.out.println("La suma total de ellos es " + (suma - numeroIntroducido));
    }
}