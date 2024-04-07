import java.util.Scanner;

public class Ejercicio2 {
    /**
     * Escribir un programa que pida un número al usuario y muestre su valor absoluto. Tendrás que utilizar el
     * operador ternario y NO se podrá utilizar la librería MATH.
     *
     * Ejemplo:
     * Escriba un número (positivo o negativo) -55
     * El valor absoluto de -55 es 55
     * Desea seguir insertando más números (s/n) ?
     */

    public static void main(String[] args) {
        //Salida por teclado
        Scanner teclado = new Scanner(System.in);
        //Variables tipo entero
        int numero, valorAbsoluto;
        //Variable tipo String
        String continuar;
        //Bucle DoWhile continiuará pidiendo números hasta que deseamos no continura
        do {
            System.out.println("Escriba un número (positivo o negativo): ");
            numero = teclado.nextInt();

            //Calcular el valor absoluto usando el operador ternario
            valorAbsoluto = (numero<0) ? -numero : numero;
            //Imprimer el resultado
            System.out.println("El valor absoluto de: " + numero + " es " + valorAbsoluto);

            System.out.println("Desea seguir insertando más números (s/n) ?: ");
            continuar = teclado.next().toLowerCase();
        }while (continuar.equals("s") || !continuar.equals("n"));
        System.out.println("Ha salido correctamnete");
    }
}
