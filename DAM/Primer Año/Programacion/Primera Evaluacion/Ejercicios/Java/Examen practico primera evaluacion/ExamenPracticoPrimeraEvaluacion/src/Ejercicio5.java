import java.util.Scanner;

public class Ejercicio5 {
    /**
     * Pedir una nota entera de 0 a 10 y mostrarla de la siguiente forma : insuficiente (de 0 a 4) suficiente (5), bien
     * (6), notable (7 y 8) y sobresaliente (9 y 10). Si lo haces con un if valdrá 1 punto si lo haces con un switch con
     * el menor número de case posible.valdrá 2 puntos
     */

    public static void main(String[] args) {
        Scanner teclaod = new Scanner(System.in);
        int nota;
        String resultado="";

        System.out.println("Dime nota entre 0 a 10: ");
        nota = teclaod.nextInt();

        switch (nota) {
            case 0,1,2,3,4:
                resultado = "insuficiente";
                break;
            case  5:
                resultado = "suficiente";
                break;
            case 6:
                resultado = "bien";
                break;
            case 7,8:
                resultado = "notable";
                break;
            case 9,10:
                resultado = "sobresaliente";
                break;
            default:
                System.out.println("ERROR: solo puedes elegir números enteros entre 0 a 10");
        }
        System.out.println("La nota " + nota + " es " + resultado);
    }
}
