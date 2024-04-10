public class Numeros {
    public static void main(String[] args) {
        getSum(1,2);
    }


public static int getSum(int a, int b) {
    int mayor=Math.max(a,b);
    int suma=0;

    for (int i=1; i<=2; i++) {
        suma+=i;
        System.out.println(suma);
    }

   return suma;
}

}
