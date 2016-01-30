package ejerciciosDelTema;

import java.util.Random;

public class TestClaveSegura {

	public static void main(String[] args) {
		ClaveSegura c = new ClaveSegura();
		final String FUENTE_CARACTERES = "aAbBcCdDeEfFgGhHiIjJkKlLm"
				+ "MnNñÑoOpPqQrRsStTuUvVwWxXyYzZ0123456789>?()=@.:,;!"
				+ "<&{}";
		
		//creo el objeto Random para sacar caracteres aleatorios
		Random r = new Random();
		
		//creo el objeto StringBuilder
		StringBuilder string = new StringBuilder();
		
		//genero aleatoriamente una clave
		for (int i = 0; i < r.nextInt(50); i++) {
			string.append(FUENTE_CARACTERES.charAt(r.nextInt(FUENTE_CARACTERES.length()-1)));
		}
		
		//muestro la clave generada y la actualizo en el setter
		System.out.println("La contraseña es "+string);
		c.setClave(string.toString());
		
		//muestro si la clave generada es segura o no
		System.out.println("La contraseña "+string+" es segura?: "+c.esClaveSegura());		
	}
}
