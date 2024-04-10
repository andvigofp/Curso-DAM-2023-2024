package Ejercicios.Ej3;

public class MEj3 {
public static String invertido(String cadena) {
    char[] caracter = cadena.toCharArray();

    for (int i=caracter.length-1; i>=0; i--) {
        System.out.print(caracter[i]);
    }
    return cadena;
}
}
