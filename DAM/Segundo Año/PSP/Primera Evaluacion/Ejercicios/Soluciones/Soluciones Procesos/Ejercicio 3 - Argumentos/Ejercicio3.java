
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ejercicio4_ejecutaDOS {

	public static void main(String[] args) throws IOException {

		// creamos objeto File al directorio donde esta el ejecutable
		File directorio = new File(".\\Vuestro directorio);

		// El proceso a ejecutar es Ejemplo2
		ProcessBuilder pb = new ProcessBuilder("java", "Ejercicio3_proceso_hijo", "-2");

		// se establece el directorio donde se encuentra el ejecutable
		pb.directory(directorio);

		// se ejecuta el proceso
		Process p = pb.start();

		try {
			InputStream er = p.getErrorStream();
			BufferedReader brer = new BufferedReader(new InputStreamReader(er));
			String liner = null;
			while ((liner = brer.readLine()) != null)
				System.out.println("ERROR >" + liner);
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

		// COMPROBACION DE la salida del programa
		int exitVal;
		try {
			exitVal = p.waitFor();
			System.out.println("Valor de Salida: " + exitVal);
			switch (exitVal) {
			case (0):
				System.out.println("FINAL CORRECTO...");
				break;
			case (1):
				System.out.println("FALTA UN PARAMETRO...");
				break;
			case (2):
				System.out.println("PAR�METRO NO NUMERICO...");
				break;
			case (3):
				System.out.println("PARAMETRO MENOR QUE 0...");
				break;
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
