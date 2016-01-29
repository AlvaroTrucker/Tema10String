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
		PalabraLeida p = new PalabraLeida(palabraIn);
		System.out.printf("%s tiene %d letras%n",palabraIn, p.numeroLetras());
		System.out.printf("%s empieza por vocal?: %b%n ",palabraIn, p.empiezaVocal());
		System.out.printf("%s acaba por vocal?: %b%n",palabraIn, p.acabaVocal());
		System.out.printf("%s tiene %d vocales %n",palabraIn, p.numeroVocales());
		System.out.printf("%s contiene la h? %b%n",palabraIn, p.contieneH());
		System.out.printf("%s es un palindromo?: %b%n",palabraIn, p.esPalindromo());

		//programacion de forma segura
		if (args.length == 0){
			System.out.println("Falta argumento");
			System.exit(1);
		}
		System.out.printf("%s es igual a %s: %b%n",palabraIn,args[0],p.sonIguales(args[0]));

	}

}
