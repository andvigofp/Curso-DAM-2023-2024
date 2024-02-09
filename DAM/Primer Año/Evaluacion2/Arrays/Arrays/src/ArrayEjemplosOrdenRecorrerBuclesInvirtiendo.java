import java.util.Arrays;

public class ArrayEjemplosOrdenRecorrerBuclesInvirtiendo {

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
        // intercambiando elementos de productos (el último el primero y viceversa)
        System.out.println("***********************************************************************");
        System.out.println("Intercambiando elementos de productos con for invirtiendo los elementos");
        System.out.println("***********************************************************************");
        for (int i=0;i<total-1;i++){

            String actual = productos[i];
            String inverso = productos[total-1-i];
            productos[i]=inverso;
            productos[total-1-i]=actual;
        }

        System.out.println("****************************************");
        System.out.println("Recorrido del array de productos con for");
        System.out.println("****************************************");
        for (int indiceProductos=0;indiceProductos<productos.length;indiceProductos++){
            System.out.println("El elemento "+indiceProductos+" de productos es : "+ productos[indiceProductos]);

        }

        // intercambiando elementos de productos (el último el primero y viceversa hasta la mitad )
        System.out.println("***********************************************************************************************");
        System.out.println("Intercambiando elementos de productos con for invirtiendo los elementos de manera correcta (/2)");
        System.out.println("***********************************************************************************************");
        for (int i=0;i<(total-1)/2;i++){

            String actual = productos[i];
            String inverso = productos[total-1-i];
            productos[i]=inverso;
            productos[total-1-i]=actual;
        }
        System.out.println("****************************************");
        System.out.println("Recorrido del array de productos con for");
        System.out.println("****************************************");
        for (int indiceProductos=0;indiceProductos<productos.length;indiceProductos++){
            System.out.println("El elemento "+indiceProductos+" de productos es : "+ productos[indiceProductos]);

        }

        System.out.println("**************************************************************************************************************");
        System.out.println("Intercambiando elementos de productos con for invirtiendo los elementos de manera correcta reduciendo el total");
        System.out.println("**************************************************************************************************************");

        int totalProductosInversion=productos.length;

        for (int i=0;i<totalProductosInversion;i++){

            String actual = productos[i];
            String inverso = productos[total-1-i];
            productos[i]=inverso;
            productos[total-1-i]=actual;
            totalProductosInversion--;
        }

        System.out.println("****************************************");
        System.out.println("Recorrido del array de productos con for");
        System.out.println("****************************************");
        for (int indiceProductos=0;indiceProductos<productos.length;indiceProductos++){
            System.out.println("El elemento "+indiceProductos+" de productos es : "+ productos[indiceProductos]);

        }
    }



}
