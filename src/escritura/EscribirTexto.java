/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escritura;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author rafaelm
 */
public class EscribirTexto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        String s = "holooo";
        
        FileWriter file = new FileWriter("alaaan.txt");
       for(int i = 0; i < s.length() ; i++){
        file.write(s);
        }
        file.close();

    }
    
}
