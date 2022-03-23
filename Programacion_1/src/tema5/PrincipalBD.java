package tema5;

import java.sql.Connection;
import java.util.Scanner;

public class PrincipalBD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Conexion para acceder a BD
		Connection con = null;

		Scanner teclado = new Scanner(System.in);

		// Nos conectamos a la Base de Datos
		con = ConexionBD.conectarBD();

		// Pedimos los datos del jugador
		System.out.println("Introduce el id:");
		int id = teclado.nextInt();

		System.out.println("Nombre:");
		String nombre = teclado.next();

		System.out.println("Introduce la edad:");
		int edad = teclado.nextInt();

		System.out.println("Introduce la altura:");
		int altura = teclado.nextInt();

		System.out.println("Sexo:");
		String sexo = teclado.next();

		JugadorDAO.insertarJugador(id, nombre, edad, altura, sexo);

		teclado.close();

		JugadorDAO.mostrarJugadores();

		JugadorVO raul = new JugadorVO(12, "Raúl", 21, 178, "M");

		// JugadorVO.insertarJugador(raul);

		JugadorVO yuria = new JugadorVO(12, "Yuria", 6, 123, "F");

		JugadorDAO.actualizarJugador2(yuria);
	}

}
