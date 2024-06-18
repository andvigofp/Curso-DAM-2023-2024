package org.andres_example.Practicas.TCP.Calculadora;

import org.andres_example.Examenes.ExamenTerceraEva.Calculadora.Calculadora;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Socket cliente = null;
        ObjectOutputStream fsalida = null;
        ObjectInputStream fentrada = null;
        boolean conectado=false;
        do {
            try {
                cliente = new Socket("127.0.0.1",6000);
                fsalida = new ObjectOutputStream(cliente.getOutputStream());
                fentrada = new ObjectInputStream(cliente.getInputStream());
                conectado=true;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }while (conectado==false);

        int operando1=0, operando2=0;
        String operacion="";

        System.out.println("Introduce el operando1: ");
        operando1 = teclado.nextInt();
        System.out.println("Introduce el operando2: ");
        operando2 = teclado.nextInt();
        teclado.nextLine();

        System.out.println("Que operacion desea realizar (sumar, restar, multiplicar, division): ");
        operacion = teclado.nextLine();

        try {
            Calculadora calculadora = new Calculadora(operando1, operando2, operacion);
            fsalida.reset();
            fsalida.writeObject(calculadora);
            System.out.println("Enviar datos al servidor. ");
            Calculadora resultado = (Calculadora) fentrada.readObject();

            System.out.println("El resultado de la operación es: " + resultado);
            fentrada.close();
            fsalida.close();
        }catch (InputMismatchException e) {
            System.out.println("Error: introduzca un valor númnerico: " + e.getMessage());
            teclado.nextLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
