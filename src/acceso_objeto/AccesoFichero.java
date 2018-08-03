package acceso_objeto;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AccesoFichero {
	
        public static void escribirArchivo(List<Pizza> lista) {
		FileWriter flwriter = null;
		try {
			//crea el flujo para escribir en el archivo
                        flwriter = new FileWriter("pizzas.txt");
			//crea un buffer o flujo intermedio antes de escribir directamente en el archivo
			BufferedWriter bfwriter = new BufferedWriter(flwriter);
			for (Pizza pizza : lista) {
				//escribe los datos en el archivo
				bfwriter.write(pizza.getNombre()+"-"+Arrays.toString(pizza.getIngredientes())+"-"+
                                        pizza.getPrecio()+"-"+pizza.isTatemada()+"\n");
			}
			//cierra el buffer intermedio
			bfwriter.close();
			System.out.println("Archivo creado con éxito..");

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (flwriter != null) {
				try {//cierra el flujo principal
					flwriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	//crea el archivo en disco, retorna la lista de pizzas
	public static ArrayList leerArchivo() {
		// crea el flujo para leer desde el archivo
		File file = new File("pizzas.txt");
		ArrayList listaPizzas= new ArrayList<>();	
		Scanner scanner;
		try {
			//se pasa el flujo al objeto scanner
			scanner = new Scanner(file);
			while (scanner.hasNextLine()) {
				// el objeto scanner lee linea a linea desde el archivo
				String linea = scanner.nextLine();
				Scanner delimitar = new Scanner(linea);
				//se usa una expresión regular
				//que valida que antes o despues de un guión (-) exista cualquier cosa
				//parte la cadena recibida cada vez que encuentre un guión				
				delimitar.useDelimiter("\\s*-\\s*");
				Pizza p= new Pizza();
                                p.setNombre(delimitar.next());
                                String cadena = delimitar.next();
                                cadena = cadena.substring(1,cadena.length()-1);
                                String[] words = cadena.split(",");
                                p.setIngredientes(words);
				p.setPrecio(Integer.parseInt(delimitar.next()));
                                p.setTatemada(Boolean.parseBoolean(delimitar.next()));
				listaPizzas.add(p);
			}
			//se cierra el objeto scanner
			scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return listaPizzas;
	}
		
}

