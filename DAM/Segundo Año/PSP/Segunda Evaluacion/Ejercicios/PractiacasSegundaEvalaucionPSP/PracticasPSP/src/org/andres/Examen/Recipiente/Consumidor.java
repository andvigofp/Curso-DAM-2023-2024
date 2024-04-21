package org.andres.Examen.Recipiente;

public class Consumidor extends Thread{
    private Recipiente recipiente;
    private String nombre;
    private String cadena="";

    public Consumidor(Recipiente recipiente, String nombre) {
        this.recipiente = recipiente;
        this.nombre = nombre;
    }

    @Override
    public void run() {
        char caracteres[];
        while(!(cadena.equalsIgnoreCase("fin"))){
            cadena=recipiente.Consumir().toUpperCase();
            if(!(cadena.equalsIgnoreCase("fin"))){
                caracteres=cadena.toCharArray();
                for (char c:caracteres) {
                    System.out.println(c);
                }
            }

        }
    }
}

