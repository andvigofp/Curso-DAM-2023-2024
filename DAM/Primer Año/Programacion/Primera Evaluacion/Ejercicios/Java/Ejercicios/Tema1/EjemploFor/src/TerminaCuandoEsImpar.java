import java.util.Scanner;

public class TerminaCuandoEsImpar {
    public static void main(String[] args) {

        int numero;
        String s;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.print("Dime un número: ");
            numero = teclado.nextInt();


            if (numero % 2 == 0) {// comprueba si el número introducido es par
                System.out.println("Qué bonito es el " + numero);

            } else {
                System.out.println("No me gustan los números impares\n.");
            }
            System.out.println("¿Quieres continuar? (s/n), pulsa \"S\" para continuar" );
            s=teclado.next();
           // S=s.toUpperCase();
        } while (s.equals("S") || s.equals("s"));
    }
}
