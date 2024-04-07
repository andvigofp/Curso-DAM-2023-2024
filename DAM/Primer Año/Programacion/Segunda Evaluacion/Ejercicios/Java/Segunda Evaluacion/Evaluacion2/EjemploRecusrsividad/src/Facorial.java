import java.util.Scanner;

public class Facorial {
    public static int facorial(int num) {
        if (num== 0) {
            return 1;
        }else {
            return num * facorial(num-1);
        }

    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        int num = teclado.nextInt();

        System.out.println("\n El factorial de " + num + " es " + facorial(num));
    }
}
