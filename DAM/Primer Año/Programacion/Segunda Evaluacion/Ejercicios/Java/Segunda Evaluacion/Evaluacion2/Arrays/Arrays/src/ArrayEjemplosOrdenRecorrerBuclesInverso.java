import java.util.Arrays;

public class ArrayEjemplosOrdenRecorrerBuclesInverso {

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

        // recorrer el array con un for opción 1
        System.out.println("*********************************************************");
        System.out.println("Recorrido del array de productos con for inverso opción 1");
        System.out.println("*********************************************************");

        for (int indiceProductos=0; indiceProductos<total;indiceProductos++){
            System.out.println("El elemento "+(total-1-indiceProductos)+" de productos es : "+ productos[total-1-indiceProductos]);

        }
        // recorrer el array con un for inverso opción 2
        System.out.println("*********************************************************");
        System.out.println("Recorrido del array de productos con for inverso opción 2");
        System.out.println("*********************************************************");

        for (int indiceProductos=total-1;indiceProductos>=0;indiceProductos--){

            System.out.println("El elemento "+indiceProductos+" de productos es : "+ productos[indiceProductos]);

        }

    }



}
