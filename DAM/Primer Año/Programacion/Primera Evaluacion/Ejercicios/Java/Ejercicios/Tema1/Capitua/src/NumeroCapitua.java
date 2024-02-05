import java.util.Scanner;

public class NumeroCapitua {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Variables tipos entero
        int numero, aux, inverso = 0, cifra;


        System.out.println("Introduce números capitua");
        numero = teclado.nextInt();
        // Lo que guardamos
        aux = numero;
        while (aux != 0) {
            //operaciones
            cifra = aux % 10;
            inverso = inverso * 10 + cifra;
            aux = aux / 10;
        }
        if (numero!= inverso) {
            System.out.println("El número " + numero + " no es capitua");
        } else {
            System.out.println("El número " + numero + " es capitua");
        }
    }

}

