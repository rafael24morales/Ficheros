/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acceso_objeto.serializado;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

/**
 *
 * @author rafaelm
 */
public class Principal {
    
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException{
        
        Scanner entrada = new Scanner(System.in);
        String nombre;
        String apellido;
        int edad;
        Persona p;
         // ojo, se hace un new por cada Persona. El new dentro del bucle.
            System.out.println("Ingresa el nombre");
            nombre = entrada.nextLine();
            System.out.println("Ingresa el apellido");
            apellido = entrada.nextLine();
            System.out.println("Ingresa edad");
            edad = entrada.nextInt();
            p = new Persona(nombre,apellido,edad);
        
        FileOutputStream file = new FileOutputStream("persona.txt",true);
        ObjectOutputStream oos = new ObjectOutputStream(file);
            
        oos.writeObject(p);
        
        oos.close();  // Se cierra al terminar.
        
        FileInputStream file2 = new FileInputStream("persona.txt");
        ObjectInputStream p2 = new ObjectInputStream(file2);
        
        Persona persona2 = new Persona();
        persona2 = (Persona) p2.readObject();
        System.out.println(persona2);
        
    }
    
    
    
}


