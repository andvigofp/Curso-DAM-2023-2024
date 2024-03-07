package Ejercicios.Examen.Recipiente;

public class Main {
    public static void main(String[] args) {
        Recipiente recipiente=new Recipiente();
        Productor productor = new Productor(recipiente,"Productor");
        Consumidor consumidor = new Consumidor(recipiente,"consumidor");
        productor.start();
        consumidor.start();
    }
}
