package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Clase que contiene la función conectarBD()
 * 
 * @author raulh
 *
 */
public class ConexionBD {

	/**
	 * Función que se conecta a la BD de mysql y nos devuelve la conexion
	 * 
	 * @return una conexion activa a la bd o null si no se puedo conectar
	 */
	public static Connection conectarBD() {

		// Parametros para la conexion a BD
		String user = "root";
		String password = "";
		String url = "jdbc:mysql://localhost:3306/mydb";

		// Conexion para acceder a BD
		Connection con = null;

		// Intentamos
		try {

			// A veces es necesario usar este driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Nos conectamos a la Base de Datos
			con = DriverManager.getConnection(url, user, password);

		} catch (SQLException | ClassNotFoundException e) {

			// Se comunica el error
			e.printStackTrace();
		}

		// Devolvemos la conexión
		return con;
	}
}
