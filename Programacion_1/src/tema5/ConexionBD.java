package tema5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {

	/*
	 * Siempre que utilizamos un servicio necesitamos Conectarnos al servicio, para
	 * eso es esta clase
	 * 
	 * Se necesitan siempre 4 parametros para conectarnos a un servicio ip o nombre
	 * de dominio: localhost en nuestro caso que es nuestra maquina usuario:root
	 * password:toor (en vuestro caso ""); puerto de comunicaciones del
	 * servicio:3306 para mysql Base de datos o esquema a utilizar
	 * 
	 */

	/**
	 * Función que se conecta a la BD de mysql y nos devuelve la conexion
	 * 
	 * @return Una conexion activa a la bd o null si no se puedo conectar
	 */
	public static Connection conectarBD() {
		// Parametros para la conexion a BD
		String user = "root";
		String password = "admin";
		String url = "jdbc:mysql://localhost:3306/grandslam";
		// Conexion para acceder a BD
		Connection con = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Nos conectamos a la Base de Datos
			con = DriverManager.getConnection(url, user, password);

		} catch (SQLException | ClassNotFoundException e) {

			e.printStackTrace();
		} catch (Exception ex) {

			ex.printStackTrace();
		}

		return con;
	}

}
