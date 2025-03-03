package m2_07_Marta_Laveda_Box;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/**Creamos una clase Bag con un ArrayList parametrizado con genérico T */

public class Bag<T> implements Iterable<T>{
	
	ArrayList <T> lista= new ArrayList <T>();
	
	/**Método para añadir un elemento T a la bolsa*/
	
	public void add(T elemento) {
		lista.add(elemento);
		System.out.println("La bolsa contiene: " + lista);
	}
	
	/**Método para vaciar la bolsa*/
	
	public void clear() {
		lista.clear();
		System.out.println("Hemos vaciado la bolsa");
	}
	
	/**Método para saber si un elemento está en la bolsa o no*/
	
	public boolean contains (T elemento) {
		if(lista.contains(elemento)) {
			System.out.println("La bolsa contiene "+ elemento);
			return true;
		}else {
			System.out.println("La bolsa no contiene " + elemento);
			return false;
		}
	}
	
	/**Método para saber si la bolsa está vacía o no*/
	
	public boolean isEmpty() {
		if(lista.size()==0) {
			System.out.println("La bolsa esta vacía.");
			return true;
		}else {
			System.out.println("La bolsa no está vacía.");
			return false;
		}
	}
	
	/*Método para obtener la cantidad de elementos que contiene la bolsa*/
	
	public int size() {
		
		if(lista.size()==1) {
			System.out.println("La bolsa contiene "+lista.size()+ " elemento.");
		}else {
		System.out.println("La bolsa contiene "+lista.size()+ " elementos.");
	}
		return lista.size();
	}
	
	/**Método para extraer un elemento aleatorio T de la bolsa (siempre que la bolsa no esté vacía)*/
	
	public T extract() { 
    	
   	 if (lista.isEmpty()) {
   		 System.out.println("La bolsa está vacía.");
   		 return null;
   	}else{
   	Random random=new Random();
   	int randomNumber=random.nextInt(lista.size());
   	
   	
   	/**El randomNumber solo es un índice, no es un elemento de la lista*/
	T elemento = lista.remove(randomNumber);
   	System.out.println("El elemento extraído es "+elemento+".");
   	 return elemento;
   	 }
   	
	}
	
	/**Método Iterator para recorrer la lista*/

	@Override
	public Iterator<T> iterator() {
		return lista.iterator();
	}
	


	
}