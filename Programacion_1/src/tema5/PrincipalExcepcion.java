package tema5;

import exceptions.InvalidEmailException;
import utils.Validaciones;

public class PrincipalExcepcion {

	public static void main(String[] args) {

		String correo1 = "invalido";
		String correo2 = "valido@tucasa.com";

		try {

			Validaciones.emailValido(correo2);
			Validaciones.emailValido(correo1);

		} catch (InvalidEmailException e) {

			e.printStackTrace();
		}

	}

}
