/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escritura;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author rafaelm
 */
public class EscribirBuffer {
    
    public static void main(String[] args) throws IOException{
        EscribiendoEnBuffer acceso = new EscribiendoEnBuffer();
        acceso.escribir();
    }
    
}
class EscribiendoEnBuffer{
    
    public void escribir() throws IOException{
        String[] s = {"Esto","Se","Escribe","Por","Lineas"};
        FileWriter file = new FileWriter("Alan2.txt");
        BufferedWriter escribir = new BufferedWriter(file);
        PrintWriter escribirImp = new PrintWriter(escribir);
        
        int linecount = 1;
        for(int i = 0; i<s.length ; i++)
            escribirImp.println(linecount++ + " : " + s[i]);
        
        escribirImp.close();
        
    }
    
}
