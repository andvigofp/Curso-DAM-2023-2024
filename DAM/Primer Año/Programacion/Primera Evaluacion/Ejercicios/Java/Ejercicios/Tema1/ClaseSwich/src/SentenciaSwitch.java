import java.util.Scanner;

public class SentenciaSwitch {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Por favor, iontroduzca un numero de mes: ");
        int  mes= Integer.parseInt(teclado.nextLine());

        String nombreDelmes;

        switch (mes) {
            case 1:
                nombreDelmes = "enero";
                break;
            case 2:
                nombreDelmes = "febero";
                break;
            case 3:
                nombreDelmes = "marzo";
                break;
            case 4:
                nombreDelmes = "abril";
                break;
            case 5:
                nombreDelmes = "mayo";
                break;
            case 6:
                nombreDelmes = "junio";
                break;
            case 7:
                nombreDelmes = "julio";
                break;
            case 8:
                nombreDelmes = "agosto";
                break;
            case 9:
                nombreDelmes = "septiembre";
                break;
            case 10:
                nombreDelmes = "octubre";
                break;
            case 11:
                nombreDelmes = "noviembre";
                break;
            case 12:
                nombreDelmes = "diciembre";
                break;
            default:
                nombreDelmes = "no existe ese mes";
        }
        System.out.println("Mes " + mes + ": " + nombreDelmes);
    }
}
