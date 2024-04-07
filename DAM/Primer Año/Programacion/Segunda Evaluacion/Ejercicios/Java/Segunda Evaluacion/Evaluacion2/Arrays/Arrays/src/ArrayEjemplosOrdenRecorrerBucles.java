import java.util.Arrays;

public class ArrayEjemplosOrdenRecorrerBucles {

    public static void main(String[] args) {

        String [] productos = new String[7];
        productos[0]="Kingston Pendrive 64GB";
        productos[1]="Samsung Galaxy";
        productos[2]="Disco Duro SSD Samsung Externo";
        productos[3]="Samsung NoteBook";
        productos[4]="Macbook Air";
        productos[5]="Chromecast 4ta generación";
        productos[6]="Bicicleta Oxford";
        
        Arrays.sort (productos);
        for(String nom:productos){

            System.out.println("productos = " + nom);
        }

        // recorrer el array con un for
        System.out.println("****************************************");
        System.out.println("Recorrido del array de productos con for");
        System.out.println("****************************************");
        for (int indiceProductos=0;indiceProductos<productos.length;indiceProductos++){
            System.out.println("El elemento "+indiceProductos+" de productos es : "+ productos[indiceProductos]);

        }
        // recorrido con un foreach
        System.out.println("********************************************");
        System.out.println("Recorrido del array de productos con foreach");
        System.out.println("********************************************");
        for (String valorProductos:productos){

            System.out.println("El contenido del array de productos es "+ valorProductos);
        }

        // recorreido del array con un while

        int indiceProductos=0;
        System.out.println("******************************************");
        System.out.println("Recorrido del array de productos con while");
        System.out.println("******************************************");
        while (indiceProductos<productos.length){

            System.out.println("El contenido del array de productos es : "+productos[indiceProductos]);
            indiceProductos++;
        }

        System.out.println("******************************************");
        System.out.println("Recorrido del array de productos con do-while");
        System.out.println("******************************************");
        indiceProductos=0;
        do{
            System.out.println("el Contenido del array de productos es "+productos[indiceProductos]+"en la posición : "+indiceProductos);
            indiceProductos++;
        }while (indiceProductos<productos.length);
    }



}
