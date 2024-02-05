package Ejercicios.Ejercicios6;

public class MostarNumerosDoWhile {
    /**
     * Muestra los números del 320 al 160, contando de 20 en 20 utilizando un bucle do-while
     */
    public static void main(String[] args) {
        // Inicializamos la variable de control del bucle en 320
        int numero=320;
        // Utilizamos un bucle Do-while para imprimir los números de 320 a 160, restando 20 en cada iteración
        do {
            //Imprimos el resultado
            System.out.println(numero);
            // Decrementamos la variable de control en 20
            numero-=20;
        }while (numero>=160);
    }
}
