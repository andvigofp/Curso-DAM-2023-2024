package Ejercicios.Ejercicio2;

import Ejercicios.Ejercicio1.MetodosEj1;

public class Ejercicio2 {
    /**
     * Define un array de 10 caracteres con nombre símbolo y asigna valores a los elementos según la tabla
     * que se muestra a continuación. Muestra el contenido de todos los elementos del array. ¿Qué sucede
     * con los valores de los elementos que no han sido inicializados?
     */

    public static void main(String[] args) {
        //Creamos el array para almacenar almacenar 10 caracteres
        char simbolos[] = new char[10];

        simbolos[0] = 'a';
        simbolos[1] = 'x';
        simbolos[4] = '@';
        simbolos[6] = ' ';
        simbolos[7] = '+';
        simbolos[8] = 'Q';

        //Para mostrar el resultado del array
        MetodosEj1.resultadoCaracter(simbolos);

        /**
         * ¿Qué sucede
         * con los valores de los elementos que no han sido inicializados?
         *  //Los elemntos que no están inicializado te ponen en caracter 0
         */


    }


    }

