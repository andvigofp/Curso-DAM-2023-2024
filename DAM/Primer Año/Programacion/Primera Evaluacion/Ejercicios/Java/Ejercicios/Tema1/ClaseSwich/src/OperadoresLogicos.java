public class OperadoresLogicos {
    public static void main(String[] args) {
        int i =3;
        byte j =3;
        float k= 127e-7f;
        double l = 2.123e3;
        boolean m = false;
        /*Prueba boolean 1*/
        boolean b1 = i ==j && k>l && m==true;
        System.out.println("b1 = " + b1);
        /*Prueba boolean 2*/
        boolean b2=i ==j || k>l;
        System.out.println("b2 = " + b2);
        /*Prueba boolean 3*/
        boolean b3 = i ==j && k>l || m==false;
        System.out.println("b3 = " + b3);
        /*Prueba boolean 4*/
        boolean b4 = i == j && (k>l || m==false);
        System.out.println("b4 = " + b4);
        /*Prueba boolean 5*/
        boolean b5 =i == j && (k<l || m==true);
        System.out.println("b5 = "+ b5);
        /*Prueba boolean 6*/
        boolean b6 = i==j || k<l && m==true;
        System.out.println("b6 = " +b6);
        /*Prueba boolean 7*/
        boolean b7 =(i==j || k>l) && m==true;
        System.out.println("b7 = " + b7);
        /*Prueba boolean 8*/
        boolean b8 = true || true && false;
        System.out.println("b8 = " + b8);
        /*Prueba boolean 9*/
        boolean b9 = (true || true ) && false;
        System.out.println("b9 = " + b9);
        /*Prueba boolean 10*/
        boolean b10 = true || false && false;
        System.out.println("b10 = " + b10);
    }
}
