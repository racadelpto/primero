package tema4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EjemploPatrones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Pattern define el patron que debe cumplir el texto
		Pattern p = Pattern.compile("[01]+");

		// Matcher recibe el texto a comprobar
		// Y con matches() nos dice si cumple el patron
		Matcher m = p.matcher("00001010");

		if (m.matches())
			System.out.println("Si, contiene el patrón");
		else
			System.out.println("No, no contiene el patrón");

	}

}
