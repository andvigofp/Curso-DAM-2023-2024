import java.util.Scanner;

public class Ejercicio6_Hijo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String cadena = "";
        while ((!cadena.equals("*") )) {
            System.out.println("Digite la cadena");
            cadena = teclado.nextLine();
        }
    }

}

