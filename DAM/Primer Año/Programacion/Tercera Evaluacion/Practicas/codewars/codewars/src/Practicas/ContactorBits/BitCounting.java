package Practicas.ContactorBits;

/**
 * Escriba una función que tome un número entero como entrada y devuelva el número de bits que son iguales a uno en la representación binaria de ese número. Puede garantizar que la entrada no sea negativa.
 *
 * Ejemplo : la representación binaria de 1234es 10011010010, por lo que la función debería regresar 5en este caso
 */
public class BitCounting {

    public static int countBits(int n){
        //Inicializamos un contador para contar los bits establecidos
        int count = 0;

        //Iteramos sobre cada bit en la representación binaria del número
        while (n > 0) {
            // Si el bit menos significativo es 1, incrementamos el contador
            count += n & 1;
            //Desplazamos el número a la derecha para verificar el siguiente bit
            n >>= 1;
        }

        //Retornamos el contador que contiene el número de bits establecidos
        return count;
    }

    public static void main(String[] args) {
        //Ejemplo de uso
        int number = 1234;
        System.out.println("El número de bits establecidos en la representación binaria de " + number + " es: " + countBits(number));
        //Output: El número de bits establecidos en la representación binaria de 1234 es: 5
    }
}
