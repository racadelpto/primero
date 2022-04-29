package utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import exceptions.InvalidEmailException;

public class Validaciones {

	/**
	 * Funci�n para validar un email
	 * 
	 * @param email
	 * @return
	 * @throws InvalidEmailException
	 */
	public static boolean emailValido(String email) throws InvalidEmailException {

		// Pattern define el patron que debe cumplir el texto
		Pattern p = Pattern.compile("^(.+)@(.+)$");

		// Matcher recibe el texto a comprobar
		// Y con matches() nos dice si cumple el patron
		Matcher m = p.matcher(email);

		if (m.matches()) {
			return true;
		} else {
			throw new InvalidEmailException("Email invalido");
		}

	}

}
