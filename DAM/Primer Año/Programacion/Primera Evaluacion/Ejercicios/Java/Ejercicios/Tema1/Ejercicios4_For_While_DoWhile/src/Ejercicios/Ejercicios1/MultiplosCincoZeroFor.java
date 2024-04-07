package Ejercicios.Ejercicios1;

public class MultiplosCincoZeroFor {
    /**
     * Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle for
     */
    public static void main(String[] args) {
        //variable tipo entero
        int numero;
        //Utilizamos un bucle for para itear sobre los números del 0 al 100
        for (numero=0; numero<=100; numero+=5) {
            //Verificamos si el número actual es un múltiplo de 5
            /**if (numero % 5==0) {
                //Imprimos el resultado del número, si es un múltiplo de 5
                System.out.println("Los múltiplos de cinco son: " + numero);
            }**/
            System.out.println("Los múltiplos de cinco son: " + numero);
        }
    }
}
