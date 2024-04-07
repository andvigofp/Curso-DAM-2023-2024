import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class ProcesoHijo {
    public static void main(String[] args) {
        if (args.length<1) {
            System.exit(1);
        }
        int numero=0;
        try {
            numero = Integer.parseInt(args[0]);

        }catch (Exception e) {
            System.exit(2);
        }
        if (numero<0) {
            System.exit(3);
        }
        System.out.println("Hola");
        System.exit(0);
    }
}
