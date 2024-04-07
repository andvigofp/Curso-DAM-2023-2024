package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio6_hijo {
	public static void main(String[] args) {
		String texto = "";


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Introduce una cadena (* para terminar): ");
			while (!texto.equals("*")) {
				texto = br.readLine();
				System.out.print("Cadena introducida: " + texto);
				System.out.println("		Introduce una cadena (* para terminar): ");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		// otra forma
		/*
		 * Scanner sc = new Scanner(System.in); try { while (!texto.equals("*")) {
		 * System.out.printf("Introduce una cadena (* para terminar): "); texto =
		 * sc.nextLine(); System.out.println("Cadena introducida: "+texto);
		 * 
		 * } sc.close(); } catch (Exception e) { e.printStackTrace(); }
		 */

	}
}
