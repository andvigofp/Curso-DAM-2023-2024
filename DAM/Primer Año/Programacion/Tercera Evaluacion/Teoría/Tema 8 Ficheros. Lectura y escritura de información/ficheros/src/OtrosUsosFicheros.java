import java.io.File;

/* Este código permite mirar dentro del directorio los archivos que existen*/
public class OtrosUsosFicheros {

    public static void main(String[] args) {
        File ficheros = new File ("."); // el punto indica el directorio actual //
        String [] listaArchivos = ficheros.list();
        for (String nombreArchivo: listaArchivos){

            System.out.println(nombreArchivo);

        }
    }
}
