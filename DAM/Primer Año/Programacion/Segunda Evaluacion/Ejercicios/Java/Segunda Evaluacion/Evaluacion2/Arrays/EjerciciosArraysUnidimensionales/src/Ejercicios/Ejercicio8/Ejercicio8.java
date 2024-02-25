package Ejercicios.Ejercicio8;

import Ejercicios.Ejercicio3.MetodosEj3;

import java.util.Scanner;

public class Ejercicio8 {
    /**
     * Realiza un programa que pida la temperatura media que ha hecho en cada mes de un determinado
     * año y que muestre a continuación un diagrama de barras horizontales con esos datos. Las barras del
     * diagrama se pueden dibujar a base de asteriscos o cualquier otro carácter.
     */

    public static void main(String[] args) {
        //leer por teclado
        Scanner teclado = new Scanner(System.in);
        //Array de meses
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        //Pedir al usario las temperaturas
        int[] temperaturasMeses = MetodosEj8.pedirTemperaturas(teclado, meses);
        //Resultado del array de las temperaturas mediante símbolos
        MetodosEj8.mostrarDiagramaBarras(meses, temperaturasMeses);

    }
}