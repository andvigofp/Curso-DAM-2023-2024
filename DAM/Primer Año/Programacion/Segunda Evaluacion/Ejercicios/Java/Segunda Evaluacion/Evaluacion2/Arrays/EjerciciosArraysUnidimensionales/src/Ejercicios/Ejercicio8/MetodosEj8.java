package Ejercicios.Ejercicio8;

import java.util.Scanner;

public class MetodosEj8 {

    public static int num_Max() {
        return 12; //Longitud del array
    }

    //Método contador
    public static void contador(int contadorPosiciones) {
        System.out.println("Te quedan " + contadorPosiciones + " poiciones restantes.");
    }

    //Método para pedir al usuario temperaturas
    public static int[] pedirTemperaturas(Scanner teclado, String[] meses) {
        int[] temperaturasMeses = new int[meses.length];
        for (int i = 0; i < meses.length; i++) {
            System.out.print("Ingresa la temperatura media del mes " + meses[i] + ": ");
            temperaturasMeses[i] = teclado.nextInt();
        }
        return temperaturasMeses;
    }

    //Metodo para mostrar el diagrama de los meses mediante símbolos *,# etc...
    public static void mostrarDiagramaBarras(String[] meses, int[] temperaturasMeses) {
        for (int i = 0; i < meses.length; i++) {
            System.out.print(meses[i] + ": ");
            for (int j = 0; j < temperaturasMeses[i]; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
