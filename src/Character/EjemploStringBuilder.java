package Character;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class EjemploStringBuilder {

	public static void main(String[] args) {
		//ejecutamos cat log.txt | java Ejemplo
		//leemos los datos con Scanner
		//creamos un StringBuilder y añadimos
		//IPs usando una expresion regular
		Scanner in = new Scanner(System.in);
		
		//creamos un Set de String
		//guarda objetos diferentes
		Set<String> EjemploStringBuilder = new HashSet<String>();
		
		//creamos el patron de IPs
		final String REGEX_IP = "((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]\\d|\\d)\\.){3}"
				+ "(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]\\d|\\d)";
		
		//leemos palabra a palabra
		//preparamos una variable para almacenar in.next()
		int contador = 0; //contamos las IPs que hay
		String palabra = "";
		while (in.hasNext()){
			palabra = in.next();
			if (palabra.matches(REGEX_IP)){
				EjemploStringBuilder.add(palabra);
			}
		}
		//cerrar el Scanner
		//quitamos el ultimo caracter
		in.close();
		System.out.println(EjemploStringBuilder);
		System.out.println("Numero de IPs: "+contador);
	}
}
