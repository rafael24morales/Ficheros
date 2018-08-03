package lectura;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author rafaelm
 */
public class LeerBuffer {
    
     public void leer() throws FileNotFoundException, IOException{
        FileReader entrada = new FileReader("alaaan.txt");
        BufferedReader elbuffer = new BufferedReader(entrada);
        
       String linea = "";
        
        while(linea!=null){
            
             linea = elbuffer.readLine();
             if(linea!=null)
            System.out.println(linea);
        }
        entrada.close();
    }
    
     public static void main(String[] args) throws IOException{
         LeerBuffer lee = new LeerBuffer();
         lee.leer();
     }
}
