package entornos;

/**
 * Esta clase contiene dos métodos: valorAbsoluto() y raizCuadrada()
 * @author raulh
 * @version: 15/03/2022/A
 * @see <a href="https://docs.google.com/document/d/1oNxk3lGgbLHdOplsASC_9Qz5HoNz_i6GTp6tsWdHbLY/edit"/> docs.google.com -- Práctica Básica Documentación Javadoc </a>
 *	
 */
public class MiniCalculadoraEjemplo {

	/**
	 * Método que devuelve el valor absoluto de un double introducido
	 * @param numero El parámetro numero define el numero sobre el que se calculará el valor absoluto
	 * @return El valor absoluto del double introducido
	 */
	public double valorAbsoluto(double numero) {
		
		return Math.abs(numero);
		
	}//Cierre del método
	
	/**
	 * Método que devuelve la raíz cuadrada de un double introducido
	 * @param numero El parámetro numero define el numero del que se calculará la raíz cuadrada
	 * @return La raíz cuadrada del double introducido
	 */
	public double raizCuadrada(double numero) {
		
		return Math.sqrt(numero);
		
	}//Cierre del método
	
}//Cierre de la clase MiniCalculadoraEjemplo
