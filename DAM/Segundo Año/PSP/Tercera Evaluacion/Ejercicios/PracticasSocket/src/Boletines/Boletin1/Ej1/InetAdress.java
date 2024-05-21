package Boletines.Boletin1.Ej1;

import java.io.IOException;
import java.net.*;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 * 1. Realiza un programa java que admita desde consola nombres de máquinas o direcciones IP y
 * vaya mostrando por pantalla información sobre ellas, haciendo usode la clase InetAddress.
 */
public class InetAdress {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String maquina = "";
        InetAddress dir = null;

        while (!maquina.equals("*")) {
            System.out.println("Introduzca una IP: ");
            maquina = teclado.nextLine();

            if (!maquina.equals("*")) {

                try {
                    dir = InetAddress.getByName(maquina);
                    pruebasMetodos(dir);
                } catch (UnknownHostException e) {
                    System.out.println("HOST DESCONOCIDO");
                    System.out.println(e.getMessage());
                    System.exit(0);
                }

                //Arrat de tipo InetAdrress con todas las direcciones

                try {
                    InetAddress[] direcciones = InetAddress.getAllByName(dir.getHostName());
                    for (int i=0; i<direcciones.length; i++) {
                        System.out.println(direcciones[i].toString());
                    }
                } catch (UnknownHostException e) {
                    e.printStackTrace();
                }

            }
        }
    }

    private static void pruebasMetodos(InetAddress dir) {
        System.out.println("\tMetodo getByName(): " + dir);
        InetAddress dir2;

        try {
            dir2 = InetAddress.getLocalHost();
            System.out.println("\tMetodo getLocalHost(): " + dir2);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

        //Usamos métodos de la clase
        System.out.println("\tMetodo getHostName(): " +dir.getHostName());
        System.out.println("\tMetodo getHostAddress(): " + dir.getHostAddress());
        System.out.println("\tMetodo toString: " + dir.toString());
        System.out.println("\tMetodo getCanonicalHostName(): " + dir.getCanonicalHostName());
    }





}
