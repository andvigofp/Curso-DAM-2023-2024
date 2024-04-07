import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        //Salida por teclado
        Scanner teclado = new Scanner(System.in);
        //Variables
        int numero, fact, i;
        //Calcular el factorial del número ingresado
        fact = 1;
        String expresion = "";

        System.out.println("Introduce un número:");
        numero = teclado.nextInt();
        //Para optner la expersión factorial en una caddena
        for (i = numero; i >= 1; i--) {
          fact *=i;
          expresion +=i;
          if (i > 1) {
              expresion += " x ";
          }
        }
        //Mostrar el resultado
        System.out.println("El factorial de " + numero + ",\"" + numero + "!\" es igual a: " + expresion + " = " + fact);

    }
}
