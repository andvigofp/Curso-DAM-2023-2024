import java.lang.reflect.Array;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Principal {
    public static void main(String[] args)  {
        SimpleDateFormat fech = new SimpleDateFormat("dd/MM/yyyy");
        Empleado[] emp = new  Empleado[7];

        try {
            Date d = (Date) fech.parse("01/01/2000");
            emp[0] = new Empleado("Pepe",5000, d);
            emp[1] = new Directivo("Juan",5000, (Date) fech.parse("01/09/2023"),"Informatica","Zona 1");
            emp[2] = new Oficial("Fernando", 1400, (Date) fech.parse("01/03/2006"), "zona 2", "nave 3", "linea 2");
            emp[3] = new Oficial("Ana", 1450, (Date) fech.parse("03/10/2009"), "zona 3", "nave 1", "linea 1");
            emp[4] = new Directivo("Marcos", 1900, (Date) fech.parse("02/02/2000"), "supervisor", "personal");
            emp[5] = new Directivo("Miriam", 1980, (Date) fech.parse("06/03/2002"), "gestor", "logistica");
            emp[6] = new Operario("Federico", 1300, (Date) fech.parse("02/11/2018"), "zona 3", "nave 2");
        } catch (ParseException e) {
            System.out.println(e.getStackTrace());
        }

        for (int i = 0; i < emp.length; i++) {
            System.out.println(emp[i].toString());
        }
    }

}
