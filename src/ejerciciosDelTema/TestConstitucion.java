package ejerciciosDelTema;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TestConstitucion {

	public static void main(String[] args) {
		//leemos con Scanner
		Scanner in = new Scanner(System.in);
		in.useDelimiter("[(\\d\\d?\\.)\";/,\\.:\\s*]");
		
		//lista para guardar las palabras
		List<String> palabrasConstitucion = new ArrayList<String>();
		
		//StringBuilder para almacenar las palabras del ArrayList
		StringBuilder sb = new StringBuilder(500);
		
		//vuelco todas las palabras en el ArrayList
		while(in.hasNext()){
			palabrasConstitucion.add(in.next());
		}
		
		//creo la variable random y genero aleatoriamente 500 palabras del fichero
		Random random = new Random();
		int contador = 0;
		while (contador<500) {
			sb.append(palabrasConstitucion.get(random.nextInt(palabrasConstitucion.size()+1)).toString()+" ");
			contador++;
		}
		
		//comprobacion de lo anterior
		System.out.println(sb);
		System.out.println("Hay "+contador+" palabras");
	}
}
