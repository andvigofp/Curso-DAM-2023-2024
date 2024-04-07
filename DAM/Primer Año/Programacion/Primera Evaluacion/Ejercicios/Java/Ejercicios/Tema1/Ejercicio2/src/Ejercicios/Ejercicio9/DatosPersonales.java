package Ejercicios.Ejercicio9;

public class DatosPersonales {
    public static void main(String[] args) {
        /**
         * Crea las variables nombre, dirección y teléfono y asígnales los valores
         * correspondientes. Muestra los valores de esas variables por pantalla.
         */
        //Variablles tipo carácter String, secuencias de escape Unicode
                            /*"\Comillas dobles*/
                            /*A     n      d    r      è    s      F     e      r     n     à     n     d    e     z      P     e     r     e     i     r     a*/
        String nombre = "\"\u0041\u006E\u0064\u0072\u00E8\u0073 \u0046\u0065\u0072\u006E\u00E0\u006E\u0064\u0065\u007A \u0050\u0065\u0072\u0065\u0069\u0072\u0061\"";
                                /*'\Comilla Simple*/
                                /*1    2    3       C     a     l     l     e      P    r      i     n     c     i     p     a     l       2     3*/
        String direccion = "\'\u0031\u0032\u0033 \u0043\u0061\u006C\u006C\u0065 \u0050\u0072\u0069\u006E\u0063\u0069\u0070\u0061\u006C, \u0032\u0033\'";
                              /*5   5      5    -     0     7     2     2     -     4     5     6     7*/
        String telefono = "\u0035\u0035\u0035\u002D\u0030\u0037\u0032\u0032\u002D\u0034\u0035\u0036\u0037";

        // Mostrar los valores de las variables por pantalla
        System.out.printf("%10s %10s %10s %10s","Datos Personales: ", nombre, direccion, telefono);

    }
}

