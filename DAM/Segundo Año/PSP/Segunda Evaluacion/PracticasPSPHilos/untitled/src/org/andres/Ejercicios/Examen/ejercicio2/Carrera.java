package org.andres.Ejercicios.Examen.ejercicio2;

import java.util.ArrayList;

public class Carrera {
    private int numcorredores;
    private int llegaron;
    private boolean salida;


    public synchronized boolean salida() {

        return salida;
    }

    public  int numcorredores() {

        return numcorredores;
    }

    public  int llegaron() {

        return llegaron;
    }

    public Carrera(int numcorredores) {
        this.numcorredores = numcorredores;
        llegaron=0;//se pone a -1 por el arbitro
        salida=false;
    }

    public synchronized void listos(){
        llegaron++;
        if(llegaron>=numcorredores){

            notifyAll();
        }
    }

    public synchronized void setSalida(boolean salida) {
        this.salida = salida;
        notifyAll();
    }

    public static void main(String[] args) {
        Carrera carrera=new Carrera(5);
        ArrayList<Atleta> listaAtletas=new ArrayList<>();
        Juez juez=new Juez("Juez",carrera);

        for (int i=0;i<5;i++)listaAtletas.add(new Atleta(i+1,carrera));
        for (Atleta atleta:listaAtletas)atleta.start();
        juez.start();
        try{

            for (Atleta atleta:listaAtletas) atleta.join();
            juez.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
