package Ejercicios.Ejercicio14;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        //Leer por teclado
        Scanner teclado = new Scanner(System.in);
        // Pedir al usuario que ingrese 8 palabras
        String[] palabras = new String[8];
        // Array de colores conocidos
        String[] coloresConocidos = {"verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "morado"};


        MetodoEj14.pediUsario(palabras);
        MetodoEj14.resultadoArrayInicial(palabras);
        MetodoEj14.palabrasordenas(palabras,coloresConocidos);


        }

    }


