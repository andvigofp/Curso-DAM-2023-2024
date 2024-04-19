package org.andres.Ejercicios.PracticasPSP.Recipiente;

import java.util.Scanner;

public class Productor extends Thread{
    private Recipiente recipiente;
    private String nombre;
    private Scanner teclado = new Scanner(System.in);
    private String cadena="";

    public Productor(Recipiente recipiente, String nombre) {
        this.recipiente = recipiente;
        this.nombre = nombre;
    }

    @Override
    public void run() {
        while (!(cadena.equalsIgnoreCase("fin"))) {
            System.out.println("Dame la cadena");
            cadena=teclado.nextLine();

            recipiente.producir(cadena);

            try {
                Thread.sleep(100);
            }catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
