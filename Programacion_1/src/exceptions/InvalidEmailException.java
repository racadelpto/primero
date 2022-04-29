package exceptions;

/**
 * 
 * @author rhdie
 *
 */
public class InvalidEmailException extends Exception {

	// Cuando se genera esta excepcion, creamos una excepcion generica con el
	// mensaje
	public InvalidEmailException(String mensaje) {

		super(mensaje);
	}

}
