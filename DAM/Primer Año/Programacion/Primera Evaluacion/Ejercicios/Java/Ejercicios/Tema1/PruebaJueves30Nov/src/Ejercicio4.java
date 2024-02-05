import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        //Salida por teclado
        Scanner teclado = new Scanner(System.in);

        //Variables
        int numeroGrande, numeroPequeno, i;

        //Pedir al usuario que ingrese el número grande
        System.out.println("Introduce un número grande: ");
        numeroGrande = teclado.nextInt();

        //Pedir al usuario que ingrese el número pequeño
        System.out.println("Introduce un número pequeño: ");
        numeroPequeno = teclado.nextInt();

        //Mostrar los números enteros positivos menores al número grande y no divisibles por el número pequeño
        System.out.println("Números no divisibles: ");
        for (i = 1; i <numeroGrande; i++) {
            if (i % numeroPequeno !=0) {
                System.out.println(i + " ");
            }
        }

    }
}
