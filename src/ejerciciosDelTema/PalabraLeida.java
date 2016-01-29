/*
 * @author Alvaro
 * @version 1.0
 */

package ejerciciosDelTema;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PalabraLeida {
	//atributos
	private String valor;
	
	//constructor
	public PalabraLeida(String valor) {
		this.valor = valor;
	}
	
	//metodo para calcular el numero de letras
	public int numeroLetras(){
		return this.valor.length();
	}
	
	//metodo para determinar si una palabra empieza por vocal
	public boolean empiezaVocal(){
		return this.valor.toLowerCase().matches("[aeiouáéíóú].*");
	}
	
	//metodo para determinar si una palabra acaba en vocal
	public boolean acabaVocal(){
		return this.valor.toLowerCase().matches(".*[aeiouáéíóú]");
	}
	
	//metodo para calcular el numero de vocales
	public int numeroVocales(){
		Pattern patron = Pattern.compile("[aeiouáéíóú]");
		Matcher matcher = patron.matcher(this.valor.toLowerCase());
		int contador = 0;
		while (matcher.find())
			contador++;
		return contador;
	}
	
	//metodo para comprobar si contiene H
	public boolean contieneH(){
		return this.valor.toLowerCase().contains("h");
	}
	
	//metodo para comprobar si es palíndromo
	public boolean esPalindromo(){
		StringBuilder sBuilder = new StringBuilder(this.valor);
		return this.valor.equalsIgnoreCase(sBuilder.reverse().toString());
	}
	
	//metodo para comprobar si dos palabras son iguales
	public boolean sonIguales(String palabra){
		return this.valor.equalsIgnoreCase(palabra);
	}
	
	/*
	//comprobacion con un main
	public static void main(String[] args) {
		PalabraLeida p = new PalabraLeida("pepe");
		System.out.println(p.sonIguales("PEPE"));
	} */
}
