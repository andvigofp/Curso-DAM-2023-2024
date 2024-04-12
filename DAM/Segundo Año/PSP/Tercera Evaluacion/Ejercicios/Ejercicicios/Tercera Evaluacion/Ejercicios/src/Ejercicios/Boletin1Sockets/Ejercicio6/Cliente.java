package Ejercicios.Boletin1Sockets.Ejercicio6;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) throws IOException {
        String host="localhost";
        int puerto=6000;

        Socket cliente=new Socket(host, puerto);

        DataOutputStream flujoSalida = null;
        DataInputStream flujoEntrada;

        String cadena = "";
        int numCaracteres;
        Scanner entrada=new Scanner(System.in);

        while(!cadena.equalsIgnoreCase("*")){
            System.out.println("Cadena: ");
            cadena=entrada.nextLine();
            flujoSalida=new DataOutputStream(cliente.getOutputStream());
            flujoSalida.writeUTF(cadena);
            flujoEntrada=new DataInputStream(cliente.getInputStream());
            numCaracteres=flujoEntrada.readInt();

            if(!cadena.equalsIgnoreCase("*")){
                System.out.println("La cadena tiene: "+numCaracteres+" caracteres");
            }


        }
        flujoSalida.close();
        System.out.println("Fin del programa...");
        cliente.close();
    }
}
