package Ejercicios.Ejercicio12;

public class ConversorEurosPesetas {
    public static void main(String[] args) {
        /**
         * Realiza un conversor de euros a pesetas. La cantidad en euros que se quiere
         * convertir deberá estar almacenada en una variable.
         */
        //Guardamos la cantidad en Euros en una variable
        var camtidadEuros = 10.00;
        //Como utilice una variable tipo entero lo casteamos para poder hacer la multiplicacion
        int valorEnpesetas = (int) (camtidadEuros*166.386);
        //Imprime por pantalla
        System.out.println(camtidadEuros + "\teuros equivalen a\t" + valorEnpesetas + "\tpesetas\t");

    }
}
