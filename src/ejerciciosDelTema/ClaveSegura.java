/*
 * @author Alvaro
 * @version 1.0
 */

package ejerciciosDelTema;

public class ClaveSegura {
	//atributos
	private String clave;

	//constructor
	public ClaveSegura() {
	}
	
	//setters
	public void setClave(String clave) {
		this.clave = clave;
	}
	
	//metodo para determinar si una clave es segura
	public boolean esClaveSegura(){
		boolean clave = false;
		if (this.clave.matches(".{8,}") && (this.clave.matches(".*[a-z]+.*"))
				&& (this.clave.matches(".*[A-Z]+.*")) && (this.clave.matches(".*[0-9]+.*"))
				&& (this.clave.matches(".*[^a-zA-Z0-9].*")))
			clave = true;
		return clave;
	}

	
	
	
}
