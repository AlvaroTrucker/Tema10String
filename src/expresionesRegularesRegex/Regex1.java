package expresionesRegularesRegex;

public class Regex1 {

	public static void main(String[] args) {
		String cadenaPrueba = "hola \"mundo\"";
		System.out.println(cadenaPrueba);
		
		String cadenaPrueba2 = "La policía no solo detectó trazas" 
			+ " de Polonio 210 en la tetera y en la taza usada por Litvinenko,"
			+ " también en los servicios del hotel visitados por sus dos "
			+ " \"envenenadores\", Dimitru Kovtun y Andrei Lugovoi, en las " 
			+ " habitaciones de ambos, en la mesa del restaurante Pescatori,"
			+ " en la barra del bar Dar Marrakesh y hasta en los asientos"
			+ " usados por Lugovoi y su familia en el Estadio Emirates"
			+ " del Arsenal, donde presenciaron el encuentro entre los \"Gunnners\""
			+ " y el CSK de Moscú";
		
		//comprueba que empieza con uno o mas espacios en blanco
		if (cadenaPrueba2.matches("^\\s+L.*\\d{3}.*ú\\$"))
			System.out.println("La cadena contiene digitos");
		else
			System.out.println("La cadena no contiene digitos");
	}
}
