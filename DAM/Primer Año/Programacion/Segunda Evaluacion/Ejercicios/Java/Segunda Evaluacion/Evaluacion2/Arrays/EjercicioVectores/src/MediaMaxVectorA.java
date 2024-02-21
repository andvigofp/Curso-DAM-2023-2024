public class MediaMaxVectorA {
    /**
     *Calcular Media de todos los valores, máximo y mínimo dentro del vector
     */
    public static void main(String[] args) {
        int suma = 0, media, max1 = 0, min1 = 0, min2, max2 = 0;
        //Crear un vector
        int vector[] = new int[6];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 101);
            System.out.println("Valores " + i + " = " + vector[i]);
        }

        //Media de un vector
        for (int j = 0; j < vector.length; j++) {
            suma += vector[j];
        }
        media = suma / vector.length;


        System.out.println("media = " + media +
                "\nmax = " + calcularMax(vector) +
                "\nmin = " + calcularMin(vector));

    }

    //Método para calcular minimo de un vector
    static int calcularMin(int vectorMin[]) {
        int min;
        int auxiliar = vectorMin[0];

        for (int i = 0; i < vectorMin.length; i++) {
            for (int j = 1; j < vectorMin.length - 1; j++) {
                min = (vectorMin[i] < vectorMin[j]) ? vectorMin[i] : vectorMin[j];
                if (min < auxiliar) {
                    auxiliar = min;
                }
            }
        }
        return (auxiliar);
    }

    // //Método para calcular máximo  de un vector
    static int calcularMax(int vectorMax[]) {
        int max;
        int auxiliar = vectorMax[0];

        for (int i = 0; i < vectorMax.length; i++) {
            for (int j = 1; j < vectorMax.length - 1; j++) {
                max = (vectorMax[i] > vectorMax[j]) ? vectorMax[i] : vectorMax[j];
                if (max > auxiliar) {
                    auxiliar = max;
                }
            }
        }
        return (auxiliar);
    }

}








