import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        //Salida por teclado
        Scanner teclado = new Scanner(System.in);

        //Variables
        double baseImponible,iva, precioConIva, descuento, precioFinal;
        String tipoIva,  codigoPromocial;
        //Inicializamos la variable
        descuento = 0;

        //Pedir al usuario que ingrese la base imponible
        System.out.println("Introduzca la base imponible: ");
        baseImponible = teclado.nextDouble();

        //Pedir al usuario que ingrese al tipo de IVA
        System.out.println("Introdizca el tipo de IVA (general, reducido o superreducido): ");
        tipoIva = teclado.next();

        //Pedir al usuario que ingrese al código promocional
        System.out.println("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");
        codigoPromocial = teclado.next();

        //Calcular el IVA según el tipo
        switch (tipoIva.toLowerCase()) {
            case "general":
                iva = 0.21;
                break;
            case "reducido":
                iva = 0.10;
                break;
            case "superreducido":
                iva = 0.04;
                break;
            default:
                System.out.println("Tipo de IVA no válido. Se aplicará el IVA general. ");
                iva = 0.21;
        }

        //Calcular el precio con IVA
        precioConIva = baseImponible *(1 + iva);

        //Calcular el descuento según el código promocional

        switch (codigoPromocial.toLowerCase()) {
            case "nopro":
                break;
            case "mitad":
                descuento = precioConIva /2;
                break;
            case "meno5":
                descuento = 5;
                break;
            case "5porc":
                descuento = precioConIva * 0.05;
                break;
            default:
                System.out.println("Código promocional no válido. No se aplicará descuento.");
        }

        //Calcular el precio final
        precioFinal = precioConIva - descuento;

        //Mostrar los resultados
        System.out.println("Base imponible: " + String.format("%.2f", baseImponible));
        System.out.println("IVA (" + (iva*100) + "%): " + String.format("%.2f", baseImponible * iva));
        System.out.println("Precio con IVA: " + String.format("%.2f", precioConIva));
        System.out.println("Cód. promo. (" + codigoPromocial + "): -" + String.format("%.2f", descuento));
        System.out.println("TOTAL: " + String.format("%.2f", precioFinal));


    }
}
