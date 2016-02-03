package ejerciciosDelTema;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestConstitucion {

	public static void main(String[] args) {
		//leemos con Scanner
		Scanner in = new Scanner(System.in);
		
		//lista para guardar las palabras
		List<String> palabrasConstitucion = new ArrayList<String>();
		
		//StringBuilder para almacenar las palabras del ArrayList
		StringBuilder sb = new StringBuilder();
		
		String palabra;
		int contador = 0;
		while(in.hasNext() && sb.length()<500){
			palabra = in.nextLine();
			palabrasConstitucion.add(palabra);
			sb.append(palabra);
			contador++;
		}
		System.out.println("Hay "+contador+" palabras en el fichero");
		System.out.println();
	}
}
