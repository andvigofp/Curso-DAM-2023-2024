public class IntroducirArrays {
    public static void main(String[] args) {

        // array de enteros //
        int [] numeros = new int [4];

        numeros[0]=1;
        numeros[1]=2;
        numeros[2]=3;
        numeros[3]=4;

        for (int i=0; i<numeros.length;i++) {
            System.out.println("numeros = " + numeros[i]);
        }

        String [] nombres = new String[5];
        nombres[0]="Andrés";
        nombres[1]="María";
        nombres[2]="Jose";
        nombres[3]="Isabel";
        nombres[4]="juan";

        for (String nom:nombres){
            System.out.println("Los nombres del array son los siguientes : " + nom);

        }

    }
}
