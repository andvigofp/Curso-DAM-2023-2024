package Boletines.Boletin1.Ej1;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * Realiza un programa Java que admita desde consola nombres de máquinas o direcciones IP y
 * vaya mostrando por pantalla información sobre ellas, haciendo uso de la clase InetAddress.
 */

public class InetAdrees {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String maquina = "";
        InetAddress dir = null;

        while (!maquina.equals("*")) {
            System.out.println("Introduzca una IP:");
            maquina = teclado.nextLine();

            if (!maquina.equals("*")) {
                try {
                    dir = InetAddress.getByName(maquina);
                    pruebaMetodos(dir);
                } catch (UnknownHostException e) {
                    System.out.println("HOST DESCONOCIDO");
                    System.out.println(e.getMessage());
                    System.exit(0);
                }

                // Array de tipo InetAddress con todas las direcciones IP asignadas //
                try {
                    InetAddress[] direcciones = InetAddress.getAllByName(dir.getHostName());
                    for (int i = 0; i < direcciones.length; i++)
                        System.out.println(direcciones[i].toString());
                } catch (UnknownHostException e) {
                    e.printStackTrace();
                }
            }
        }
    }// main

    private static void pruebaMetodos(InetAddress dir) {
        System.out.println("\nMétodo getByName(): " + dir);
        InetAddress dir2;

        try {
            dir2 = InetAddress.getLocalHost();
            System.out.println("\nMétodo getLocalHost(): " + dir2);
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }

        // Usamos métodos de clase
        System.out.println("\nMétodo getHostName(): " + dir.getHostName());
        System.out.println("\nMétodo getHostAdress(): " + dir.getHostAddress());
        System.out.println("\nMétodo toString(): " + dir.toString());
        System.out.println("\nMétodo getCanonicalHostName(): " + dir.getCanonicalHostName());
    }


}
