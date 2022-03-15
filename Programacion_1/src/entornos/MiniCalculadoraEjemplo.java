package entornos;

/**
 * Esta clase contiene dos m�todos: valorAbsoluto() y raizCuadrada()
 * @author raulh
 * @version: 15/03/2022/A
 * @see <a href="https://docs.google.com/document/d/1oNxk3lGgbLHdOplsASC_9Qz5HoNz_i6GTp6tsWdHbLY/edit"/> docs.google.com -- Pr�ctica B�sica Documentaci�n Javadoc </a>
 *	
 */
public class MiniCalculadoraEjemplo {

	/**
	 * M�todo que devuelve el valor absoluto de un double introducido
	 * @param numero El par�metro numero define el numero sobre el que se calcular� el valor absoluto
	 * @return El valor absoluto del double introducido
	 */
	public double valorAbsoluto(double numero) {
		
		return Math.abs(numero);
		
	}//Cierre del m�todo
	
	/**
	 * M�todo que devuelve la ra�z cuadrada de un double introducido
	 * @param numero El par�metro numero define el numero del que se calcular� la ra�z cuadrada
	 * @return La ra�z cuadrada del double introducido
	 */
	public double raizCuadrada(double numero) {
		
		return Math.sqrt(numero);
		
	}//Cierre del m�todo
	
}//Cierre de la clase MiniCalculadoraEjemplo
