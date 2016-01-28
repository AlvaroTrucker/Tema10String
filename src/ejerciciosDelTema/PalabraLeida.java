package ejerciciosDelTema;

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
		return this.valor.startsWith(valor);
	}
	
	//
}
