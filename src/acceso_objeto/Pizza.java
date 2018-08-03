/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acceso_objeto;

import java.io.Serializable;
import java.util.Arrays;

/**
 *
 * @author rafaelm
 */
public class Pizza implements Serializable{
    private String nombre;
    private String[] ingredientes;
    private int precio;
    private boolean tatemada;
    private String otracosa;

    public Pizza() {
    }

    public Pizza(String nombre, String[] ingredientes, int precio, boolean tatemada) {
        this.nombre = nombre;
        this.ingredientes = ingredientes;
        this.precio = precio;
        this.tatemada = tatemada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String[] getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String[] ingredientes) {
        this.ingredientes = ingredientes;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public boolean isTatemada() {
        return tatemada;
    }

    public void setTatemada(boolean tatemada) {
        this.tatemada = tatemada;
    }

    @Override
    public String toString() {
        String cadena = Arrays.toString(ingredientes);
        cadena = cadena.substring(1, cadena.length()-1);
        return "La pizza es " + nombre + ", que tiene " + cadena + " y cuesta $" + precio + " pero" + (tatemada? "":" no") + " está tatemada";
    }
    
    
    
    
}
