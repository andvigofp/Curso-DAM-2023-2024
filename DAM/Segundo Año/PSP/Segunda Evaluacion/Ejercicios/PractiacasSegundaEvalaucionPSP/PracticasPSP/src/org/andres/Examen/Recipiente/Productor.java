package org.andres.Examen.Recipiente;

import java.util.Scanner;

public class Productor extends Thread{
    private Recipiente recipiente;
    private String nombre;
    private Scanner entrada=new Scanner(System.in);
    private String cadena="";

    public Productor(Recipiente recipiente, String nombre) {
        this.recipiente = recipiente;
        this.nombre = nombre;
    }

    @Override
    public void run() {
        while (!(cadena.equalsIgnoreCase("fin"))){
            System.out.println("Dame la cadena");
            cadena=entrada.nextLine();

            recipiente.Producir(cadena);
            try {
                sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}