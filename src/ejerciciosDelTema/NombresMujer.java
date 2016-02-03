package ejerciciosDelTema;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class NombresMujer {

	public static void main(String[] args) {
		//leemos con Scanner
		Scanner in = new Scanner(System.in);
		String palabras;
		int contador = 0;

		while (in.hasNextLine()){
			palabras = in.nextLine();
			contador++;
		}
		
		//comprobaciones
		System.out.println("Hay "+contador+" palabras en el fichero");
	
		//lista para los nombres que empiezan por A
		List<String> palabrasComienzaPorA = new ArrayList<String>();
		
		//lista para los nombres que no acaban en vocal
		List<String> palabrasAcabanEnConsonante = new ArrayList<String>();
		
		while (in.hasNextLine()){
			palabras = in.nextLine();
			if (palabras.toLowerCase().startsWith("a"))
				palabrasComienzaPorA.add(palabras);
			contador++;
			if (palabras.toLowerCase().matches(".*[^aeiou]$"))
				palabrasAcabanEnConsonante.add(palabras);
		}
		System.out.println(palabrasComienzaPorA);
		System.out.println(palabrasAcabanEnConsonante);
		
	//metodo que comprueba las palabras con mayor tamaño
	
	//metodo que comprueba las palabras con menor tamaño
	}
}
