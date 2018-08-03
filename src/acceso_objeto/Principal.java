package acceso_objeto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author rafaelm
 */
public class Principal {
    public static void main(String[] args){
  
        String[] s= {"Peperoni","Macarrones","Mucho queso"};
        String[] u= {"Peperoni","uyuy","mmimi queso"};
        List<Pizza> listaPizzas = Arrays.asList(
                new Pizza("Peperoni",s,120,true),
                new Pizza("hawaiiana",u,100,false)
                );
        
        //listaPizzas.stream().forEach(i->System.out.println(i.toString()));
        AccesoFichero.escribirArchivo(listaPizzas);
 
		// asignar a la lista los objetos
		ArrayList<Pizza> listaLeida = AccesoFichero.leerArchivo();
		for (Pizza pizza : listaLeida) {
			System.out.println(pizza.toString());
		}
               
    }
}
