package lectura;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author rafaelm
 */

class LeerFichero{
    
    
    public void leer() throws IOException{
        FileReader entrada = null;
        try{
            entrada = new FileReader("alaaan.txt");
            int a = 0;

            while(a!=-1){
                a = entrada.read();
                char letra = (char)a;
                System.out.print(letra);
            }
        }catch(FileNotFoundException ex){  
        }catch(IOException es){  
        }finally{ 
            entrada.close();
        } 
    }
}

class AccesoFichero {
    public static void main(String[] args) throws IOException{
        LeerFichero accediendo = new LeerFichero();
        accediendo.leer();
    }
}

