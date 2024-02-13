import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class ArrayEjemplosOrdenInvertirMetodos {

    public static void arregloInverso (String [] arrayProductos){


        System.out.println("**************************************************************************************************************");
        System.out.println("Intercambiando elementos de productos con for invirtiendo los elementos de manera correcta reduciendo el total");
        System.out.println("**************************************************************************************************************");

        int totalProductosInversion=arrayProductos.length;
        int total = arrayProductos.length;
        for (int i=0;i<totalProductosInversion;i++){

            String actual = arrayProductos[i];
            String inverso = arrayProductos[total-1-i];
            arrayProductos[i]=inverso;
            arrayProductos[total-1-i]=actual;
            totalProductosInversion--;
        }

    }

    public static void main(String[] args) {

        String [] productos = new String[7];
        productos[0]="Kingston Pendrive 64GB";
        productos[1]="Samsung Galaxy";
        productos[2]="Disco Duro SSD Samsung Externo";
        productos[3]="Samsung NoteBook";
        productos[4]="Macbook Air";
        productos[5]="Chromecast 4ta generación";
        productos[6]="Bicicleta Oxford";

        int total=productos.length;


        Arrays.sort (productos);

        // recorrer el array con un for
        System.out.println("****************************************");
        System.out.println("Recorrido del array de productos con for");
        System.out.println("****************************************");
        for (int indiceProductos=0;indiceProductos<productos.length;indiceProductos++){
            System.out.println("El elemento "+indiceProductos+" de productos es : "+ productos[indiceProductos]);

        }

        arregloInverso(productos);
        // recorrer el array con un for después de invertir el array
        System.out.println("****************************************");
        System.out.println("Recorrido del array de productos con for");
        System.out.println("****************************************");
        for (int indiceProductos=0;indiceProductos<productos.length;indiceProductos++){
            System.out.println("El elemento "+indiceProductos+" de productos es : "+ productos[indiceProductos]);

        }


    }



}
