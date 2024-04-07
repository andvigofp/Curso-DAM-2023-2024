import java.util.Arrays;

public class ArrayEjemplosOrdenacion {

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
    }
}
