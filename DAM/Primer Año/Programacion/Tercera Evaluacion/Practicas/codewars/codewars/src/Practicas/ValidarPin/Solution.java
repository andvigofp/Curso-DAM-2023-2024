package Practicas.ValidarPin;

/**
 * Los cajeros automáticos permiten códigos PIN de 4 o 6 dígitos y los códigos PIN no pueden contener nada más que exactamente 4 dígitos o exactamente 6 dígitos.
 *
 * Si a la función se le pasa una cadena de PIN válida, devuelva true; en caso contrario, devuelva false.
 *
 * Ejemplos ( Entrada --> Salida)
 * "1234"   -->  true
 * "12345"  -->  false
 * "a234"   -->  false
 */
public class Solution {

    public static boolean validatePin(String pin) {
        //Verificar si el PIN tiene exactamente 4 o 6 dígitos y no contiene caracteres no numéricos
        return pin.matches("\\d{4}|\\d{6}");
    }
}
