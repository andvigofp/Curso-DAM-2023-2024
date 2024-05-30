package org.andres.example.Ejercicio3;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu_Ej3 {
 //Método Menú de opciones
public static void Menu() {
    Scanner teclado = new Scanner(System.in);
    ArrayList<CuentaCoriente_EJ3> cuenta = new ArrayList<>();

    int opciones;

    do {
        MEJ3.Mostrarmenu();

        opciones = teclado.nextInt();
        teclado.nextLine();

        switch (opciones) {
            case 1:
                MEJ3.agregarCuenta(cuenta,teclado);
                break;
            case 2:
                MEJ3.mostrarTodasCuentas(cuenta);
                break;
            case 3:
                MEJ3.mostrarMenorSaldo(cuenta,teclado);
                break;
            case 4:
                MEJ3.ordenarMenorMayorSaldo(cuenta);
                break;
            case 5:
                System.out.println("Fin del programa..");
                break;
            default:
                System.out.println("Error: no has elegido la opción correcta");
        }
    }while (opciones !=5);
}
}
