import java.util.Arrays;

public class ArrayEjemploInversoRecorrerBucleasInverso {

    public static void main(String[] args) {
        //Array tipo String
        String[] productos = new String[] {"patinete a pedales","Kingstom Pendrive 64GB", "Samsung Galaxy", "Disco Duro SDD Samsung Externo", "Samsumg NoteBock", "Macbock Air", " Cromecast 4ta Generación", "Bicicleta Notebock"};

        int total = productos.length;


        //Recorrer el Array con un for
        for (int i=0; i<total; i++) {
            System.out.println(productos[i]);
        }

        System.out.println("------------------------------------");

        //Intercambio elementos del producto (el último de primero y viceversa)
        for (int i =0; i <= (total -1)/2; i++) {
            String actual = productos[i];
            String inverso = productos[total-1-i];
            productos[i] = inverso;
            productos[total-i-1] = actual;
        }

        for (int i=0; i<total; i++) {
            System.out.println(productos[i]);
        }
    }
}
