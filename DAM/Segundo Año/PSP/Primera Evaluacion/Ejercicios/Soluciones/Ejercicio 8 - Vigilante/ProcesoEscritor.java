package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import static java.lang.Thread.sleep;

public class ProcesoEscritor {
    public static void main(String[] args) throws IOException, InterruptedException {

        FileWriter file = new FileWriter("./log.txt");
        PrintWriter pw = new PrintWriter(file);
        String msg1 = "ERROR: se ha dectectado un problema";
        String msg2 = "Todo esta OK";
        String msg3 = "END";

        String msg = "";

        while(!msg.equals("END")){
            int num = (int)Math.floor(Math.random()*10+1);
            if(num ==1 ){
                msg = msg3;
                pw.println(msg3);
            } else if (num >=2 && num <=7) {
                msg = msg2;
                pw.println(msg2);
            }else{
                msg = msg1;
                pw.println(msg1);
            }
            sleep(500);

        }
        pw.close();

    }
}
