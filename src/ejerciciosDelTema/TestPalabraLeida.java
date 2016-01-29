package ejerciciosDelTema;

import java.util.Scanner;

public class TestPalabraLeida {

	public static void main(String[] args) {
		//leemos el atributo usando un Scanner
		Scanner in = new Scanner(System.in);
		System.out.println("Introduce una palabra");
		String palabraIn = in.next();
		in.close();
		
		//creamos el objeto
		PalabraLeida p = new PalabraLeida(args[0]);
		System.out.printf("%s tiene %d letras",args[0],palabraIn, p.numeroLetras());
		System.out.printf("%s empieza por vocal?: ",args[0],palabraIn, p.empiezaVocal());
		System.out.printf("%s acaba por vocal?: ",args[0],palabraIn, p.empiezaVocal());
		System.out.printf("%s tiene %d vocales",args[0],palabraIn, p.numeroVocales());
		System.out.printf("%s empieza por vocal?: ",args[0],palabraIn, p.empiezaVocal());
		System.out.printf("%s contiene la h?",args[0],palabraIn, p.contieneH());
		System.out.printf("%s es un palindromo?: ",args[0],palabraIn, p.esPalindromo());
		System.out.printf("%s empieza por vocal?: ",args[0],palabraIn, p.empiezaVocal());

		//programacion de forma segura
		if (args.length == 0){
			System.out.println("Falta argumento");
			System.exit(1);
		}
		System.out.printf("%s es igual que %s?");

	}

}
