package org.example;

import java.io.*;

import static java.lang.Thread.sleep;

public class ProcesoVigilante {
    public static void main(String[] args) throws IOException, InterruptedException {

        BufferedReader br = new BufferedReader(new FileReader (new File("./log.txt")));

        String line = "";
        while(!line.equals("END")){
            try{
                while(!(line = br.readLine()).equals("END")){
                    if(line.contains("ERROR")){
                        System.out.println(line);
                    }
                    sleep(500);
                }
            }catch (Exception e){

            }
        }
        br.close();
    }
}
