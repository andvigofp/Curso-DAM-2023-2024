public class ArrayEjemplosOrdenamientoBurbujaMejorado {

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


        //Arrays.sort (productos);

        // odenamiento burbuja
        // recorre cada elemento del array y lo compara con el resto por lo que será necesario dos bucles
        int contador=0;
        for (int i=0; i<total;i++){
            for (int j=i+1; j<total-1-i; j++){
                if (productos[j+1].compareTo(productos[j])<0) {
                    String auxiliar = productos[j];
                    productos[j] = productos[j+1];
                    productos[j+1] = auxiliar;

                }
          contador++;
            }





        }
        System.out.println("Número de veces que interactua = " + contador);



        // recorrer el array con un for
        System.out.println("****************************************");
        System.out.println("Recorrido del array de productos con for");
        System.out.println("****************************************");
        for (int indiceProductos=0;indiceProductos<productos.length;indiceProductos++){
            System.out.println("El elemento "+indiceProductos+" de productos es : "+ productos[indiceProductos]);

        }

    }



}
