package expresionesRegularesRegex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Regex2 {

	public static void main(String[] args) {
		//leemos con Scanner posibles direcciones IP
		//las direcciones IP pueden ser:
		//127.0.0.1 255.255.255.255 192.168.0.1
		//no son validas 127.0.1 ni 256.255.255.255
		Scanner in = new Scanner(System.in);
		System.out.println("Introduce IPs válidas");
		String posibleIP = in.next();
		
		//creamos una coleccion para guardar esas IPs
		List<String> listaIPs = new ArrayList<String>();
		while (validarIP(posibleIP)){
			//si es valida se añade a la lista
			listaIPs.add(posibleIP);
			posibleIP = in.next();
		}
		in.close();
		System.out.println(listaIPs);
	}
	
	//metodo que nos valida la IP
	public static boolean validarIP(String IP){
		//boolean valida = false;
		
		//primero que encaje con xxx.xxx.xxx.xxx donde x es un digito
		//return IP.matches("\\d{3}\\.\\d{3}\\.\\d{3}\\.\\d{3}");
		
		//aquí no encaja la 192.168.0.1 modificamos la regex
		//return IP.matches("\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}");
		//ahora el problema es que se traga direcciones superiores a 255.255.255.255
		
		//version definitiva
		return IP.matches("(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]\\d|\\d)\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]\\d|\\d)\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]\\d|\\d)\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]\\d|\\d)");

		//return valida;
	}
}
