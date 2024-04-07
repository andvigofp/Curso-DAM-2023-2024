public class PruebaCompareTo {

    public static void main(String[] args) {
        String cadena1="f";
        String cadena2="f";
        System.out.println("cadena1.compareTo(cadena2) = " + cadena1.compareTo(cadena2));
        
        String cadena3="moto";
        String cadena4="mota";
        System.out.println("cadena3.compareTo(cadena4) = " + cadena3.compareTo(cadena4));
        
        String cadena5="moto";
        String cadena6="MOTO";
        System.out.println("cadena5.compareToIgnoreCase(cadena6) = " + cadena5.compareToIgnoreCase(cadena6));
    }
}
