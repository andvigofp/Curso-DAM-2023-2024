package org.andres_example.Boletines.Boletin1.Ej1;

import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * 1. Realiza un programa java que admita desde consola nombres de máquinas o direcciones IP y
 * vaya mostrando por pantalla información sobre ellas, haciendo usode la clase InetAddress.
 */

public class InetAddress {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String maquina = "";
        java.net.InetAddress dir = null;

        while (!maquina.equals("*")) {
            System.out.println("Introduzca una IP: ");
            maquina = teclado.nextLine();

            if (!maquina.equals("*")) {
                try {
                    dir = java.net.InetAddress.getByName(maquina);
                    pruebaMetodos(dir);
                } catch (UnknownHostException e) {
                    System.out.println("HOST DESCONOCIDO ");
                    System.exit(0);
                }

                //Arrat de tipo InetAddress con todas las direcciones
                try {
                    java.net.InetAddress[] direcciones = java.net.InetAddress.getAllByName(dir.getHostName());
                    for (int i=0; i<direcciones.length; i++) {
                        System.out.println(direcciones[i].toString());
                    }
                } catch (UnknownHostException e) {
                    e.printStackTrace();
                }
            }


        }
    }

    private static void pruebaMetodos(java.net.InetAddress dir) {
        System.out.println("\tMétodo getByName(): " + dir);
        java.net.InetAddress dir2;

        try {
            dir2 = java.net.InetAddress.getLocalHost();
            System.out.println("\tMétodo getLocalHost(): " + dir2);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

        //Usamos métodos de la clase
        System.out.println("\tMétodo getHostName(): " + dir.getHostName());
        System.out.println("\tMétodo getHostAddress(): " + dir.getHostAddress());
        System.out.println("\tMétodo toString: " + dir.toString());
        System.out.println("\tMétodo getCnonicalHostName(): " + dir.getCanonicalHostName());

    }


}
