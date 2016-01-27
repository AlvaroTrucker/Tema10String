package expresionesRegularesRegex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex4 {

	public static void main(String[] args) {
		
		//final String INPUT = "Mozilla Safari Opera Chrome Explorer Edge"
		//		+ "Mozilla Safari Opera Chrome Explorer Edge";
		Scanner in = new Scanner(System.in);
		String INPUT = "";
		while (in.hasNext())
			INPUT += in.next();
		final String PATRON_MOZILLA_SAFARI = "(Mozilla|Safari)";
		Pattern patron = Pattern.compile(PATRON_MOZILLA_SAFARI);
		Matcher matcher = patron.matcher(INPUT);
		int contador = 0;
		System.out.println(INPUT);
		while (matcher.find())
			contador++;
		System.out.println("Numero de ocurrencias de Mozilla: "+contador);
	}

}

