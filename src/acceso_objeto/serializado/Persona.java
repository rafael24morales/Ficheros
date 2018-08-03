/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acceso_objeto.serializado;

import java.io.Serializable;

/**
 *
 * @author rafaelm
 */

public class Persona implements Serializable{
    
    private static final long serialVersionUID = 8799656478674716638L;

    public String nombre;
    public String apellido;
    public int edad;
    
    @Override
    public String toString()
    {
        return "Nombre: " + nombre + " Apellido " + apellido + " Edad " + edad;
    }
    public Persona(){}
    public Persona(String nombre, String apellido, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

}
