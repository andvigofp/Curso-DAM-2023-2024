package Ejercicios.Ejercicios4;

public class MostarNumerosFor {
    /**
     * Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás utilizando el bucle for
     */
    public static void main(String[] args) {
        //variable tipo entero
        int numero;
        //Utilizamos un bucle for para imprimir los números de 320 a 160, restando 20 en cada iteración
        for (numero=320; numero>=160; numero-=20) {
            //Imprimos el resultado
            System.out.print(numero + " \t ");
        }
    }
}
