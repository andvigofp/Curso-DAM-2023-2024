package org.andres.example.Ejercicio3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MEJ3 {
    //Método para mostar un menú de opciones
    public static void Mostrarmenu() {
        System.out.println("\nMenú de Gestión de un Banco");
        System.out.println("1. Agregar una cuenta Corrigiente");
        System.out.println("2. Mostrar todas las cuentas corrientes");
        System.out.println("3. Todas las cuentas que tengan un saldo inferior");
        System.out.println("4. Todas las cuentas ordenadas por saldo de menor a mayor");
        System.out.println("5. Salir");
        System.out.println("Elige de una opciones entre 1-4 (5 para salir)");

    }

    //Método para dar de alta una cuenta corriente
    public static void agregarCuenta(ArrayList<CuentaCoriente_EJ3> cuenta, Scanner teclado) {
        System.out.println("Introduzca un dni:");
        String dni = teclado.nextLine();

        if (buscarCuenta(cuenta, dni)!=null) {
            System.out.println("Error: Ya existe ese dni con esa cuenta");
            return;
        }

        System.out.println("Introduzca un nombre:");
        String nombre = teclado.nextLine();
        System.out.println("Introduzca tus apellidos");
        String apellidos = teclado.nextLine();
        System.out.println("Introduzca un saldo");
        double saldo = teclado.nextDouble();
        teclado.nextLine();

        cuenta.add(new CuentaCoriente_EJ3(dni, nombre, apellidos, saldo));

        System.out.println("Se ha creado la lista de la cuenta corriente correctamente");

    }

    //Método para mostrar todas las cuentas que estén en la lista
    public static void mostrarTodasCuentas(ArrayList<CuentaCoriente_EJ3> cuenta) {
        for (CuentaCoriente_EJ3 c: cuenta) {
            System.out.println(c);
        }
    }
    //Método para mostrar el saldo menor de una cuenta corriente
    public static void mostrarMenorSaldo(ArrayList<CuentaCoriente_EJ3> cuenta, Scanner teclado) {
        System.out.println("Intrdozuca un saldo menor");
        double saldo = teclado.nextDouble();
        for (CuentaCoriente_EJ3 c: cuenta) {
            if (c.getSaldo() <saldo) {
                System.out.println(c);
            }
        }
    }
    //Método para ordenar el saldo de menor a mayor
    public static void ordenarMenorMayorSaldo(ArrayList<CuentaCoriente_EJ3> cuenta) {
      ArrayList<CuentaCoriente_EJ3> cuentaOrdenados = new ArrayList<>(cuenta);
      cuentaOrdenados.sort(Comparator.comparing(CuentaCoriente_EJ3::getSaldo));

      for (CuentaCoriente_EJ3 c: cuentaOrdenados) {
          System.out.println(c);
      }

    }

    //Método para comprobar si el dni si ya existe ese dni en la lista creada
    public static CuentaCoriente_EJ3 buscarCuenta(ArrayList<CuentaCoriente_EJ3> cuenta, String dni) {
        for (CuentaCoriente_EJ3 c: cuenta) {
            if (c.getDni().equals(dni)) {
                return c;
            }
        }
        return null;
    }
    }




