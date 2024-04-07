public class ForBreak {
    public static void main(String[] args) {
        int[] numeros = {32, 87, 3, 589, 12, 1076, 2000, 8, 622, 127};
        int buscar = 12;
        boolean encontrado = false;

        int i;
        for (i=0; i<numeros.length; i++) {
            if (numeros[i]==buscar) {
                encontrado = true;
                //break;
            }
        }
        if (encontrado) {
            System.out.println("Encontrado " + buscar + " en posición " + i);
        }else {
            System.out.println(buscar + " no está en el array");
        }
    }
}
