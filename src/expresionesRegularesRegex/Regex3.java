package expresionesRegularesRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex3 {

	public static void main(String[] args) {
		String cadena1 = "Un terremoto de magnitud 6.3 en la escala de Richter con epicentro en el Mar de Alborán se ha dejado notar esta madrugada en Melilla y varias provincias andaluzas, especialmente en Málaga y Granada. El seísmo se ha producido a las 5.22 horas y ha sacado literalmente de sus camas a cientos de melillenses, que han salido sobresaltados en pijama a la calle.";
		String cadena2 = " El terremoto acumulaba hasta las 11,39 horas 27 réplicas, siendo las más elevadas dos registradas a las 6,54 y a las 7,10 horas y que alcanzaron una magnitud de 4,6.";
		String cadena3 = "En total 26 personas han recibido asistencia en el hospital por percances a raíz o tras el terremoto, en concreto por crisis de ansiedad, por cortes en algún caso al recoger objetos de cristal o cerámica que cayeron al suelo en las viviendas o por golpes que sufrieron al bajar escaleras o en otras situaciones derivadas de la premura con que intentaban salir de sus casas, según los últimos datos de la Delegación del Gobierno.";
		final String INPUT = cadena1+cadena2+cadena3;
		
		//generar el patrón el, los, las, la, una, un, unos, unas
		final String PATRON = "\\b(el|l[oa]s?|la|una?|un[ao]s)\\b";
		
		//generar el objeto Pattern
		Pattern patron = Pattern.compile(PATRON);
		Matcher matcher = patron.matcher(INPUT.toLowerCase());
		
		//creamos un contador
		int contador = 0;
		while (matcher.find())
			contador++;
		System.out.println("Numero de articulos: "+contador);
	}

}
