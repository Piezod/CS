package BLL;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import Beans.Tarjeta;

public class NuevaPartidaBLL {

	public void creartablero()
	{		
		int azules=9,rojas=9,negras=1,verde=6;
		/*
		 * Un array de 25 posiciones, en caad posicion una tarjeta recuperada de bd (SOLO EL NOMBRE), luego una vez
		 * creado eso, le pongo al azar un color en la posicion 1 tal posicion 2 tal, y asi cada posicion del array tiene 
		 * un objeto con 1 tarjeta, esa tarjeta tendra un nombre, oid_tarjeta,oid_tablero,color,
		 */
		
		// Creo la lista con 25 posiciones
		List<Integer> tablero = new ArrayList<>(25);
		List<Tarjeta> tableroconstruido= new ArrayList<>(25);
		for (int i=1;i<25;i++){
			tablero.add(i);
		   //System.out.println(i);
		}
		// Conjunto de números ya usados
		Set<Integer> alreadyUsedNumbers = new HashSet<>();
		
		Random random = new Random();

		
		
		while (alreadyUsedNumbers.size()<azules) {

			   // Número aleatorio entre 0 y 26, excluido el 26.  
			   int randomNumber = random.nextInt(26);

			   // Si no lo hemos usado ya, lo usamos y lo metemos en el conjunto de usados.
			   if (!alreadyUsedNumbers.contains(randomNumber)){
			      System.out.println("Creamos la ficha azul en la posicion "+randomNumber);
			      alreadyUsedNumbers.add(randomNumber);
			   }			 
		}
		System.out.println("******************************************");
		  System.out.println("Tarjetas azules creadas, ahora las rojas");
		  System.out.println("******************************************");
		while (alreadyUsedNumbers.size()<rojas+azules) {

			   // Número aleatorio entre 0 y 26, excluido el 26.  
			   int randomNumber = random.nextInt(26);

			   // Si no lo hemos usado ya, lo usamos y lo metemos en el conjunto de usados.
			   if (!alreadyUsedNumbers.contains(randomNumber)){
			      System.out.println("Creamos la ficha rojas en la posicion "+randomNumber);
			      alreadyUsedNumbers.add(randomNumber);
			   }			   			  
		}
		System.out.println("******************************************");
		System.out.println("Tarjetas azules creadas, ahora las verdes");
		System.out.println("******************************************");
		while (alreadyUsedNumbers.size()<verde+rojas+azules) {

			   // Número aleatorio entre 0 y 26, excluido el 26.  
			   int randomNumber = random.nextInt(26);

			   // Si no lo hemos usado ya, lo usamos y lo metemos en el conjunto de usados.
			   if (!alreadyUsedNumbers.contains(randomNumber)){
			      System.out.println("Creamos la ficha verdes en la posicion "+randomNumber);
			      alreadyUsedNumbers.add(randomNumber);
			   }			  		
		}
		System.out.println("******************************************");
		   System.out.println("Tarjetas azules creadas, ahora las negras");
		   System.out.println("******************************************");
		   
			while (alreadyUsedNumbers.size()<verde+rojas+azules+negras) {

				   // Número aleatorio entre 0 y 26, excluido el 26.  
				   int randomNumber = random.nextInt(26);

				   // Si no lo hemos usado ya, lo usamos y lo metemos en el conjunto de usados.
				   if (!alreadyUsedNumbers.contains(randomNumber)){
				      System.out.println("Creamos la ficha MUERTE en la posicion "+randomNumber);
				      alreadyUsedNumbers.add(randomNumber);
				   }			  		
			}
			System.out.println("******************************************");
			System.out.println("Tarjetas azules creadas, ahora las negras");
			System.out.println("******************************************");
			System.out.println("\n");
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
			System.out.println("Tablero aleatorio completado");
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
	}
}

