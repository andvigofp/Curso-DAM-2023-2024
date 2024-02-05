public class ComparactionCadena {
    public static void main(String[] args) {
        //variable tipo String
        String miFruta = "naranja";
        //Sentecincia if, para comparar 
        if ("naranja".equals(miFruta)) {
            System.out.println("iguales");
        }else {
            System.out.println("distintas");
        }
        //cambiando equals por "==" da el mismo resultado
        if (miFruta=="naranja") {
            System.out.println("iguales");
        }else{
            System.out.println("distintas");
        }
    }
}
