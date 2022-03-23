package tema5;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JugadorDAO {

	/**
	 * Nos introduce en la BD los datos del jugador
	 * 
	 * @param id
	 * @param nombre
	 * @param edad
	 * @param altura
	 * @param sexo
	 * @return 1 si se insertó el registro en BD, 0 si no se pudo
	 */
	public static int insertarJugador(int id, String nombre, int edad, int altura, String sexo) {

		// Variable para retornar si se pudo insertar
		int resultado = 0;

		// Conexion para acceder a BD
		Connection con = null;

		try {

			// Nos conectamos a la Base de Datos
			con = ConexionBD.conectarBD();

			// Consulta a ejecutar
			String query = "insert into jugador values (?,?,?,?,?)";

			// El preparedStatement lo genera la conexion utilizando
			// la consulta/query a ejecutar
			PreparedStatement pStmt = con.prepareStatement(query);

			pStmt.setInt(1, id);
			pStmt.setString(2, nombre);
			pStmt.setInt(3, edad);
			pStmt.setInt(4, altura);
			pStmt.setString(5, sexo);

			// Ejecutamos la query
			resultado = pStmt.executeUpdate();

			// Cerramos el statement
			pStmt.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Cerramos la conexion
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return resultado;
	}

	public static void mostrarJugadores() {

		// Nos conectamos a la BD
		Connection con = ConexionBD.conectarBD();

		String query = "SELECT * FROM jugador";

		try {

			// Generamos el preparedStatement a partir de la query sql
			PreparedStatement pStmt = con.prepareStatement(query);

			// Ejecutamos la query y nos devuelve los datos en una estructura resultSet
			ResultSet res = pStmt.executeQuery();

			int id = 0, altura = 0, edad = 0;
			String sexo = "", nombre = "";

			System.out.println("*******************************");
			System.out.println("********JUGADORES*************");
			System.out.println("*******************************");

			// Mientras haya un siguiente elemento seguimos leyendo registros,
			// next nos pasa al siguiente registro y nos devuelve true si hya mas registros
			// por leer
			while (res.next()) {

				id = res.getInt("idjugador");
				nombre = res.getString("nombre");
				edad = res.getInt("edad");
				altura = res.getInt("altura");
				sexo = res.getString("sexo");

				System.out.println("nombre: " + nombre);
				System.out.println("id: " + id);
				System.out.println("edad: " + edad);
				System.out.println("altura: " + altura);
				System.out.println("sexo: " + sexo);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static int eliminarJugador(int idJugador) {

		int resultado = 1;

		Connection con = null;

		con = ConexionBD.conectarBD();

		String query = "SELECT * from jugador";

		try {

			PreparedStatement pStmt = con.prepareStatement(query);

			ResultSet res = pStmt.executeQuery();

			int id = 0;

			while (res.next()) {

				id = res.getInt("id");

				if (id == idJugador) {

					res.deleteRow();

					resultado = 0;

				}
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

		return resultado;
	}

	public static int actualizarJugador2(JugadorVO jugador) {
		int resultado = 0;

		String query = "UPDATE jugador SET nombre=?, edad=?, altura=?, sexo=? WHERE idjugador=?";

		// Nos conectamos a la BD
		Connection con = ConexionBD.conectarBD();

		try {

			// Creamos el preparedStatement
			PreparedStatement pStmt = con.prepareStatement(query);

			// Ponemos los parámetros en las ?
			pStmt.setString(1, jugador.getNombre());
			pStmt.setInt(2, jugador.getEdad());
			pStmt.setInt(3, jugador.getAltura());
			pStmt.setString(4, jugador.getSexo());
			pStmt.setInt(5, jugador.getId());

			// Ejecutamos la instrucción
			resultado = pStmt.executeUpdate();

			pStmt.close();

		} catch (SQLException e) {

			e.printStackTrace();
		}

		return resultado;
	}
}
