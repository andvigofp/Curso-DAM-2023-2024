package Ejercicios.Ejercicio14;

import java.util.Scanner;

public class Ejercicio14 {
    /**
     *Escribe un programa que pida 8 palabras y las almacene en un array. A continuación, las palabras
     * correspondientes a colores se deben almacenar al comienzo y las que no son colores a continuación.
     * Puedes utilizar tantos arrays auxiliares como quieras. Los colores que conoce el programa deben estar
     * en otro array y son los siguientes: verde, rojo, azul, amarillo, naranja, rosa, negro, blanco y morado.
     */
    public static void main(String[] args) {
        //Leer por teclado
        Scanner teclado = new Scanner(System.in);
        // Pedir al usuario que ingrese 8 palabras
        String[] palabras = new String[8];
        // Array de colores conocidos
        String[] coloresConocidos = {"verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "morado"};


        MetodoEj14.pediUsario(palabras,teclado);
        MetodoEj14.resultadoArrayInicial(palabras);
        MetodoEj14.palabrasordenas(palabras,coloresConocidos);


        }

    }


