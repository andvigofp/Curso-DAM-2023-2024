import java.util.Locale;
import java.util.Scanner;

public class Ejercicio7_Hijo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String cadena ="";
        String reversecadena ="";
        while (!cadena.equals("salir")) {
            System.out.println("Dirigite una cadena");
            cadena = teclado.nextLine().toLowerCase();
            if (cadena.equals("salir")) {
                System.out.println("A salido correctamente");
                break;
            }
           for (int i=cadena.length()-1; i>=0;i--) {
               reversecadena+=cadena.charAt(i);
           }
           if (!cadena.isEmpty()) {
               if (cadena.equals(reversecadena)) {
                   System.out.println("Es un palíndromo");
               }else {
                   System.out.println("No es un palíndromo");
               }
           }else {
               System.out.println("Cadena Vacia");
           }
        }
    }
}
