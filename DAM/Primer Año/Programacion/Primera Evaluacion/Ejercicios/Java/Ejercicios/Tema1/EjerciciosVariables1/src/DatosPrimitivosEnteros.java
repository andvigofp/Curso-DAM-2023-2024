public class DatosPrimitivosEnteros {
    public static void main(String[] args) {
        //Variable tipo byte solo soporta hasta 127
            byte numeroByteCero = -128;
            byte numeroByteUno = 127;
        //variable tipo short solo soporta hasta 3267
            short numeroShortCero = -32768;
            short numeroShortuno = 32767;
        //variable tipo int solo soporta hasta 2147483647
            int numeroIntCero = -2147483648;
            int numeroIntUno = 2147483647;
        //variable tipo int solo soporta hasta 9 x 1018
            long numeroLongCero =-9000000000000000000L;
            long numeroLongUno = 9;

            //Muestra por salida
            //Byte
            System.out.println("Byte: ");
            System.out.println("Valor byte va desde = " + numeroByteCero + " Hasta = " + numeroByteUno);
            System.out.println("Byte.Bytes " + Byte.BYTES);
            System.out.println("Tamaño en Bytes " + Byte.SIZE);
            System.out.println("Tamaño mínimo de bytes " + Byte.MIN_VALUE);
            System.out.println("Tamaño máximo de Bytes " + Byte.MAX_VALUE + "\n");
            //Short
            System.out.println("Short: ");
            System.out.println("Valor byte va desde = " + numeroShortCero + " Hasta = " + numeroShortuno);
            System.out.println("Short.Bytes " + Short.BYTES);
            System.out.println("Tamaño en Bytes " + Short.SIZE);
            System.out.println("Tamaño mínimo de bytes " + Short.MIN_VALUE);
            System.out.println("Tamaño máximo de Bytes " + Short.MAX_VALUE + "\n");
            //Int
            System.out.println("Int: ");
            System.out.println("Valor byte va desde = " + numeroIntCero + " Hasta = " + numeroIntUno);
            System.out.println("Integer.Bytes " + Integer.BYTES);
            System.out.println("Tamaño en Bytes " + Integer.SIZE);
            System.out.println("Tamaño mínimo de bytes " + Integer.MIN_VALUE);
            System.out.println("Tamaño máximo de Bytes " + Integer.MAX_VALUE + "\n");
            //Long
            System.out.println("Long: ");
            System.out.println("Valor byte va desde = " + numeroLongCero + " Hasta = " + numeroLongUno);
            System.out.println("Long.Bytes " + Long.BYTES);
            System.out.println("Tamaño en Bytes " + Long.SIZE);
            System.out.println("Tamaño mínimo de bytes " + Long.MIN_VALUE);
            System.out.println("Tamaño máximo de Bytes " + Long.MAX_VALUE + "\n");

            //Var
            var  numeroShort = 40;


    }
}
