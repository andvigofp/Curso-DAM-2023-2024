package Ejercicios.Ejercicios3;

public class MultiplosCincoZeroDoWhile {
    /**
     * Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle do-while
     */
    public static void main(String[] args) {
        //Inializamos la variable del control del bucle
        int numero=0;
        // Utilizamos un bucle do-while para iterar sobre los números del 0 al 100
        do {
            //Verificamos si el número actual es un múltiplo de 5
            /**if (numero %5==0) {
                //Imprimos el resultado del número, si es un múltiplo de 5
                System.out.println("Los múltiplos de 5 son: " + numero);
            }**/
            System.out.println("Los múltiplos de 5 son: " + numero);
            //Incrementamos la variable de control
            numero+=5;
        }while (numero<=100);
    }
}
