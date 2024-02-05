
public class Ejercicio3_proceso_hijo {

	public static void main(String[] args) {
		if (args.length < 1) {
			System.exit(1);
		}

		String a = args[0];
		int n = 0;
		try {
			n = Integer.parseInt(a);
		} catch (NumberFormatException nf) {
			System.exit(2);
		}

		if (n < 0)
			System.exit(3);

		System.exit(0);
	}
}
