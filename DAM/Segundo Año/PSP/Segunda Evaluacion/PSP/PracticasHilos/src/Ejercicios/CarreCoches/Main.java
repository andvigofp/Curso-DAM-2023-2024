package Ejercicios.CarreCoches;

public class Main {
    public static void main(String[] args) {
        Coche c1=new Coche();
        Coche c2= new Coche();
        Coche c3= new Coche();
        Coche c4= new Coche();
        Coche c5= new Coche();

        //Implementado la interfaz Runnable
        Thread h1 = new Thread(c1);
        h1.setName("Coche1");
        h1.start();

        Thread h2 = new Thread(c2);
        h1.setName("Coche2");
        h2.start();

        Thread h3 = new Thread(c3);
        h3.setName("Coche3");
        h3.start();

        Thread h4 = new Thread(c4);
        h4.setName("Coche4");
        h4.start();

        Thread h5 = new Thread(c5);
        h5.setName("Coche5");
        h5.start();


    }

}
