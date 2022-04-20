package practicaBDD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import utils.ConexionBD;

/**
 * Funciones relativas a la clase PilotoDAO
 * 
 * @author raulh
 *
 */
public class PilotoDAO {

	/**
	 * Función que recibe un String con el id de un piloto de la BDD y elimina esa
	 * fila de la BDD
	 * 
	 * @param codXX
	 * @return un 0 o 1 en función de si ha borrado la fila o no
	 */
	public static int eliminar(String codXX) {

		// Inicializamos int resultado a 0
		int resultado = 0;

		// Nos conectamos a la base de datos gracias a conectarBD()
		Connection con = ConexionBD.conectarBD();

		// String query con la consulta a ejecutar
		String query = "DELETE from piloto WHERE idPiloto = ?";

		// Intentamos
		try {

			// PreparedStatement pStmt con query como referencia gracias a con
			PreparedStatement pStmt = con.prepareStatement(query);

			// Asignamos codXX al primer ? del pStmt
			pStmt.setString(1, codXX);

			// resultado es igual a la ejecución del pStmt
			resultado = pStmt.executeUpdate();

			// Cerramos pStmt y con
			pStmt.close();
			con.close();

		} catch (SQLException e) {

			// Expresamos el error
			e.printStackTrace();
		}

		// Devolvemos resultado
		return resultado;
	}

	/**
	 * Función que recibe un objeto de la clase PilotoVO e inserta datos en la tabla
	 * piloto de la BDD en función de los atributos del objeto
	 * 
	 * @param piloto
	 * @return un 0 o 1 en función de si ha insertado los datos o no
	 */
	public static int insertar(PilotoVO piloto) {

		// Inicializamos int resultado a 0
		int resultado = 0;

		// Si piloto es igual a null
		if (piloto == null) {

			// Devolvemos resultado
			return resultado;
		}

		// String query con la consulta a ejecutar
		String query = "INSERT into piloto values(?,?,?,?,?,?)";

		// Nos conectamos a la base de datos gracias a conectarBD()
		Connection con = ConexionBD.conectarBD();

		// Intentamos
		try {

			// PreparedStatement pStmt con query como referencia gracias a con
			PreparedStatement pStmt = con.prepareStatement(query);

			// Si el idPiloto de piloto es diferente de null y no es igual a ""
			if (piloto.getIdPiloto() != null && !piloto.getIdPiloto().equals("")) {

				// Asignamos idPiloto de piloto al primer ? del pStmt
				pStmt.setString(1, piloto.getIdPiloto());

			} // Si no
			else {

				// Devolvemos resultado
				return resultado;
			}

			// Si el dNI de piloto es diferente de null y no es igual a ""
			if (piloto.getdNI() != null && !piloto.getdNI().equals("")) {

				// Asignamos dNI de piloto al segundo ? del pStmt
				pStmt.setString(2, piloto.getdNI());

			} // Si no
			else {

				// Devolvemos resultado
				return resultado;
			}

			// Si el nombre de piloto es diferente de null y no es igual a ""
			if (piloto.getNombre() != null && !piloto.getNombre().equals("")) {

				// Asignamos nombre de piloto al tercer ? del pStmt
				pStmt.setString(3, piloto.getNombre());

			} // Si no
			else {

				// Devolvemos resultado
				return resultado;
			}

			// Si la edad de piloto es mayor de 0
			if (piloto.getEdad() > 0) {

				// Asignamos edad de piloto al cuarto ? del pStmt
				pStmt.setInt(4, piloto.getEdad());

			} // Si no
			else {

				// Devolvemos resultado
				return resultado;
			}

			// Si el sexo de piloto es diferente de null y no es igual a ""
			if (piloto.getSexo() != null && !piloto.getSexo().equals("")) {

				// Asignamos sexo de piloto al quinto ? del pStmt
				pStmt.setString(5, piloto.getSexo());

			} // Si no
			else {

				// Devolvemos resultado
				return resultado;
			}

			// Si la direccion de piloto es diferente de null y no es igual a ""
			if (piloto.getDireccion() != null && !piloto.getDireccion().equals("")) {

				// Asignamos direccion de piloto al sexto ? del pStmt
				pStmt.setString(6, piloto.getDireccion());

			} // Si no
			else {

				// Devolvemos resultado
				return resultado;
			}

			// resultado es igual a la ejecución del pStmt
			resultado = pStmt.executeUpdate();

			// Cerramos pStmt y con
			pStmt.close();
			con.close();

		} catch (SQLException e) {

			// Expresamos el error
			e.printStackTrace();
		}

		// Devolvemos resultado
		return resultado;
	}

	/**
	 * Función que recibe un objeto de la clase PilotoVO y actualiza los datos en la
	 * tabla piloto en función de los atributos del objeto
	 * 
	 * @param piloto
	 * @return un 0 o 1 en función de si ha actualizado los datos o no
	 */
	public static int actualizar(PilotoVO piloto) {

		// Inicializamos in resultado a 0 e int posicion a 1
		int resultado = 0;
		int posicion = 1;

		// String query con la consulta a ejecutar
		String query = "UPDATE piloto SET ";

		// Si carrera es igual a null
		if (piloto == null) {

			// Devolvemos resultado
			return resultado;
		}

		// Si el idPiloto de piloto es diferente de null y no es igual a ""
		if (piloto.getIdPiloto() == null || piloto.getIdPiloto().equals("")) {

			// Devolvemos resultado
			return resultado;
		}

		// Si el dNI de piloto es diferente de null y no es igual a ""
		if (piloto.getdNI() != null && !piloto.getdNI().equals("")) {

			// Sumamos a query ese String
			query += "DNI = ?";

			// Sumamos 1 a posicion
			posicion++;
		}

		// Si el nombre de piloto es diferente de null y no es igual a ""
		if (piloto.getNombre() != null && !piloto.getNombre().equals("")) {

			// Si posicion es igual a 1
			if (posicion == 1) {

				// Sumamos a query ese String
				query += "Nombre = ?";

			} // Si no
			else {

				// Sumamos a query ese String
				query += ", Nombre = ?";
			}

			// Sumamos 1 a posicion
			posicion++;
		}

		// Si el edad de piloto es mayor de 0
		if (piloto.getEdad() > 0) {

			// Si posicion es igual a 1
			if (posicion == 1) {

				// Sumamos a query ese String
				query += "Edad = ?";

			} // Si no
			else {

				// Sumamos a query ese String
				query += ", Edad = ?";
			}

			// Sumamos 1 a posicion
			posicion++;
		}

		// Si el sexo de piloto es diferente de null y no es igual a ""
		if (piloto.getSexo() != null && !piloto.getSexo().equals("")) {

			// Si posicion es igual a 1
			if (posicion == 1) {

				// Sumamos a query ese String
				query += "Sexo = ?";

			} // Si no
			else {

				// Sumamos a query ese String
				query += ", Sexo = ?";
			}

			// Sumamos 1 a posicion
			posicion++;
		}

		// Si el direccion de piloto es diferente de null y no es igual a ""
		if (piloto.getDireccion() != null && !piloto.getDireccion().equals("")) {

			// Si posicion es igual a 1
			if (posicion == 1) {

				// Sumamos a query ese String
				query += "Dirección = ?";

			} // Si no
			else {

				// Sumamos a query ese String
				query += ", Dirección = ?";
			}

			// Sumamos 1 a posicion
			posicion++;
		}

		// Unimos a query ese String
		query = query.concat(" WHERE idPiloto = ?");

		// Si posicion es igual a 1
		if (posicion == 1) {

			// Devolvemos resultado
			return resultado;
		}

		// Nos conectamos a la base de datos gracias a conectarBD()
		Connection con = ConexionBD.conectarBD();

		// Intentamos
		try {

			// PreparedStatement pStmt con query como referencia gracias a con
			PreparedStatement pStmt = con.prepareStatement(query);

			// Definimos posicion igual a 1
			posicion = 1;

			// Si el dNI de piloto es diferente de null y no es igual a ""
			if (piloto.getdNI() != null && !piloto.getdNI().equals("")) {

				// Asignamos dNI de piloto al ? del pStmt en la posicion en ese
				// momento
				pStmt.setString(posicion, piloto.getdNI());

				// Sumamos 1 a posicion
				posicion++;
			}

			// Si el nombre de piloto es diferente de null y no es igual a ""
			if (piloto.getNombre() != null && !piloto.getNombre().equals("")) {

				// Asignamos nombre de piloto al ? del pStmt en la posicion en ese
				// momento
				pStmt.setString(posicion, piloto.getNombre());

				// Sumamos 1 a posicion
				posicion++;
			}

			// Si el edad de piloto es mayor de 0
			if (piloto.getEdad() > 0) {

				// Asignamos edad de piloto al ? del pStmt en la posicion en ese
				// momento
				pStmt.setInt(posicion, piloto.getEdad());

				// Sumamos 1 a posicion
				posicion++;
			}

			// Si el sexo de piloto es diferente de null y no es igual a ""
			if (piloto.getSexo() != null && !piloto.getSexo().equals("")) {

				// Asignamos sexo de piloto al ? del pStmt en la posicion en ese
				// momento
				pStmt.setString(posicion, piloto.getSexo());

				// Sumamos 1 a posicion
				posicion++;
			}

			// Si el direccion de piloto es diferente de null y no es igual a ""
			if (piloto.getDireccion() != null && !piloto.getDireccion().equals("")) {

				// Asignamos direccion de piloto al ? del pStmt en la posicion en ese
				// momento
				pStmt.setString(posicion, piloto.getDireccion());

				// Sumamos 1 a posicion
				posicion++;
			}

			// Asignamos idPiloto de piloto al ? del pStmt en la posicion en ese
			// momento
			pStmt.setString(posicion, piloto.getIdPiloto());

			// resultado es igual a la ejecución del pStmt
			resultado = pStmt.executeUpdate();

			// Cerramos pStmt y con
			pStmt.close();
			con.close();

		} catch (SQLException e) {

			// Expresamos el error
			e.printStackTrace();
		}

		// Devolvemos resultado
		return resultado;
	}

	/**
	 * Función que recibe un String con el id de un piloto de la BDD, crea un objeto
	 * de la clase PilotoVO y le asigna a ese objeto los datos referentes a la fila
	 * de la tabla piloto en la BDD con el id introducido como parámetro
	 * 
	 * @param codPiloto
	 * @return un objeto de la clase PilotoVO
	 */
	public static PilotoVO cargarPiloto(String codPiloto) {

		// Inicializamos un objeto piloto de la clase PilotoVO
		PilotoVO piloto = new PilotoVO();

		// Nos conectamos a la base de datos gracias a conectarBD()
		Connection con = ConexionBD.conectarBD();

		// String query con la consulta a ejecutar
		String query = "SELECT * from piloto where idPiloto = ?";

		// Intentamos
		try {

			// PreparedStatement pStmt con query como referencia gracias a con
			PreparedStatement pStmt = con.prepareStatement(query);

			// Asignamos codPiloto al primer ? del pStmt
			pStmt.setString(1, codPiloto);

			// Inicializamos res de la clase ResultSet a la ejecución del query de pStmt
			ResultSet res = pStmt.executeQuery();

			// Pasamos al siguiente elemento en res
			res.next();

			// Asignamos cada atributo al objeto piloto sacando los datos de las
			// columnas de res dependiendo del dato a asignar
			piloto.setIdPiloto(res.getString("idPiloto"));
			piloto.setdNI(res.getString("DNI"));
			piloto.setNombre(res.getString("Nombre"));
			piloto.setEdad(res.getInt("Edad"));
			piloto.setSexo(res.getString("Sexo"));
			piloto.setDireccion(res.getString("Dirección"));
			piloto.setCoche(PilotoDAO.cargarCoche(codPiloto));

			// Cerramos pStmt, res y con
			pStmt.close();
			res.close();
			con.close();

		} catch (SQLException e) {

			// Expresamos el error
			e.printStackTrace();
		}

		// Devolvemos piloto
		return piloto;
	}

	/**
	 * Función que recibe un String con el id de un piloto de la BDD, crea un objeto
	 * de la clase CocheVO y le asigna a ese objeto los datos referentes a la fila
	 * de la tabla coche en la BDD con el id introducido como parámetro
	 * 
	 * @param codPiloto
	 * @return un objeto de la clase CocheVO
	 */
	public static CocheVO cargarCoche(String codPiloto) {

		// Inicializamos un objeto coche de la clase CocheVO
		CocheVO coche = new CocheVO();

		// Nos conectamos a la base de datos gracias a conectarBD()
		Connection con = ConexionBD.conectarBD();

		// String query con la consulta a ejecutar
		String query = "SELECT * from coche where Piloto_idPiloto = ?";

		// Intentamos
		try {

			// PreparedStatement pStmt con query como referencia gracias a con
			PreparedStatement pStmt = con.prepareStatement(query);

			// Asignamos codPiloto al primer ? del pStmt
			pStmt.setString(1, codPiloto);

			// Inicializamos res de la clase ResultSet a la ejecución del query de pStmt
			ResultSet res = pStmt.executeQuery();

			// Pasamos al siguiente elemento en res
			res.next();

			// Asignamos cada atributo al objeto coche sacando los datos de las
			// columnas de res dependiendo del dato a asignar
			coche.setIdCoche(res.getString("idCoche"));
			coche.setMarca(res.getString("Marca"));
			coche.setModelo(res.getString("Modelo"));
			coche.setPeso(res.getInt("Peso"));
			coche.setPotencia(res.getInt("Potencia"));
			coche.setIdPiloto(res.getString("Piloto_idPiloto"));

			// Cerramos pStmt, res y con
			pStmt.close();
			res.close();
			con.close();

		} catch (SQLException e) {

			// Expresamos el error
			e.printStackTrace();
		}

		// Devolvemos coche
		return coche;
	}

}
