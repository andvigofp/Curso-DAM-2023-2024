package Ejercicios.Ejercicio1;

import java.util.Scanner;

public class Ej1 {
    /**
     *Necesitamos crear un programa para registrar sueldos de hombres y mujeres de una empresa y detectar si
     * existe brecha salarial entre ambos. El programa pedirá por teclado la información de N personas distintas
     * (valor también introducido por teclado). Para cada persona, pedirá su género (0 para varón y 1 para mujer) y
     * su sueldo. Esta información debe guardarse en una única matriz. Luego se mostrará por pantalla el sueldo
     * medio de cada género.
     */
    public static void main(String[] args) {
        //Salida por teclado
        Scanner tecado = new Scanner(System.in);
        //Variables tipo entero
        int numeroPersonas;
        //Variables tipo double
        double sueldoMedioVaron, sueldoMedioMujer;
        //Pedir al usuario número de personas
        numeroPersonas = MetodoEj1.pedirNumerosPersonas(tecado);
        //Pedir género si es varón pulsa 0 y si es mujer pulse 1
        int[][] sueldos = MetodoEj1.pedirInformacion(tecado,numeroPersonas);
        //Para saber el salario medio del varón o mujer
        sueldoMedioVaron = MetodoEj1.calcularSueldoMedio(sueldos,0);
        sueldoMedioMujer = MetodoEj1.calcularSueldoMedio(sueldos,1);
        //Mostrar la información del salario de medio del varón y mujer
        MetodoEj1.mostrarResultado(sueldoMedioVaron,sueldoMedioMujer);




    }

}
