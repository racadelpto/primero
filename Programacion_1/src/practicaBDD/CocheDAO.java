package practicaBDD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import utils.ConexionBD;

/**
 * Funciones relativas a la clase CocheDAO
 * @author raulh
 *
 */
public class CocheDAO {

	/**
	 * Función que recibe un String con el id de un coche de la BDD y elimina esa fila de la BDD
	 * @param codXX
	 * @return un 0 o 1 en función de si ha borrado la fila o no
	 */
	public static int eliminar(String codXX) {

		// Inicializamos int resultado a 0
		int resultado = 0;

		// Nos conectamos a la base de datos gracias a conectarBD()
		Connection con = ConexionBD.conectarBD();

		// String query con la consulta a ejecutar
		String query = "DELETE from coche WHERE idCoche = ?";

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
	 * Función que recibe un objeto de la clase CocheVO e inserta datos en la tabla coche de la BDD en función de los atributos del objeto
	 * @param coche
	 * @return un 0 o 1 en función de si ha insertado los datos o no
	 */
	public static int insertar(CocheVO coche) {

		// Inicializamos int resultado a 0
		int resultado = 0;

		// Si coche es igual a null
		if (coche == null) {

			// Devolvemos resultado
			return resultado;
		}

		// String query con la consulta a ejecutar
		String query = "INSERT into coche values(?,?,?,?,?,?)";

		// Nos conectamos a la base de datos gracias a conectarBD()
		Connection con = ConexionBD.conectarBD();

		// Intentamos
		try {

			// PreparedStatement pStmt con query como referencia gracias a con
			PreparedStatement pStmt = con.prepareStatement(query);

			// Si el idCoche de coche es diferente de null y no es igual a ""
			if (coche.getIdCoche() != null && !coche.getIdCoche().equals("")) {

				// Asignamos idCoche de coche al primer ? del pStmt
				pStmt.setString(1, coche.getIdCoche());

			} // Si no
			else {

				// Devolvemos resultado
				return resultado;
			}

			// Si la marca de coche es diferente de null y no es igual a ""
			if (coche.getMarca() != null && !coche.getMarca().equals("")) {

				// Asignamos marca de coche al segundo ? del pStmt
				pStmt.setString(2, coche.getMarca());

			} // Si no
			else {

				// Devolvemos resultado
				return resultado;
			}

			// Si el modelo de coche es diferente de null y no es igual a ""
			if (coche.getModelo() != null && !coche.getModelo().equals("")) {

				// Asignamos modelo de coche al tercer ? del pStmt
				pStmt.setString(3, coche.getModelo());

			} // Si no
			else {

				// Devolvemos resultado
				return resultado;
			}

			// Si el peso de coche es mayor de 0
			if (coche.getPeso() > 0) {

				// Asignamos peso de coche al cuarto ? del pStmt
				pStmt.setInt(4, coche.getPeso());

			} // Si no
			else {

				// Devolvemos resultado
				return resultado;
			}

			// Si la potencia de coche es mayor de 0
			if (coche.getPotencia() > 0) {

				// Asignamos potencia de coche al quinto ? del pStmt
				pStmt.setInt(5, coche.getPotencia());

			} // Si no
			else {

				// Devolvemos resultado
				return resultado;
			}

			// Si el idPiloto de coche es diferente de null y no es igual a ""
			if (coche.getIdPiloto() != null && !coche.getIdPiloto().equals("")) {

				// Asignamos idPiloto de coche al sexto ? del pStmt
				pStmt.setString(6, coche.getIdPiloto());

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
	 * Función que recibe un objeto de la clase CocheVO y actualiza los datos en la tabla coche en función de los atributos del objeto
	 * @param coche
	 * @return un 0 o 1 en función de si ha actualizado los datos o no
	 */
	public static int actualizar(CocheVO coche) {

		// Inicializamos in resultado a 0 e int posicion a 1
		int resultado = 0;
		int posicion = 1;

		// String query con la consulta a ejecutar
		String query = "UPDATE coche SET ";

		// Si carrera es igual a null
		if (coche == null) {

			// Devolvemos resultado
			return resultado;
		}

		// Si el idCoche de coche es diferente de null y no es igual a ""
		if (coche.getIdCoche() == null || coche.getIdCoche().equals("")) {

			// Devolvemos resultado
			return resultado;
		}

		// Si el marca de coche es diferente de null y no es igual a ""
		if (coche.getMarca() != null && !coche.getMarca().equals("")) {

			// Sumamos a query ese String
			query += "Marca = ?";

			// Sumamos 1 a posicion
			posicion++;
		}

		// Si el modelo de coche es diferente de null y no es igual a ""
		if (coche.getModelo() != null && !coche.getModelo().equals("")) {

			// Si posicion es igual a 1
			if (posicion == 1) {

				// Sumamos a query ese String
				query += "Modelo = ?";

			} // Si no
			else {

				// Sumamos a query ese String
				query += ", Modelo = ?";
			}

			// Sumamos 1 a posicion
			posicion++;
		}

		// Si el peso de coche es mayor de 0
		if (coche.getPeso() > 0) {

			// Si posicion es igual a 1
			if (posicion == 1) {

				// Sumamos a query ese String
				query += "Peso = ?";

			} // Si no
			else {

				// Sumamos a query ese String
				query += ", Peso = ?";
			}

			// Sumamos 1 a posicion
			posicion++;
		}

		// Si el potencia de coche es mayor de 0
		if (coche.getPotencia() > 0) {

			// Si posicion es igual a 1
			if (posicion == 1) {

				// Sumamos a query ese String
				query += "Potencia = ?";

			} // Si no
			else {

				// Sumamos a query ese String
				query += ", Potencia = ?";
			}

			// Sumamos 1 a posicion
			posicion++;
		}

		// Si el idPiloto de coche es diferente de null y no es igual a ""
		if (coche.getIdPiloto() != null && !coche.getIdPiloto().equals("")) {

			// Si posicion es igual a 1
			if (posicion == 1) {

				// Sumamos a query ese String
				query += "Piloto_idPiloto = ?";

			} // Si no
			else {

				// Sumamos a query ese String
				query += ", Piloto_idPiloto = ?";
			}

			// Sumamos 1 a posicion
			posicion++;
		}

		// Unimos a query ese String
		query = query.concat(" WHERE idCoche = ?");

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

			// Si el marca de coche es diferente de null y no es igual a ""
			if (coche.getMarca() != null && !coche.getMarca().equals("")) {

				// Asignamos marca de coche al ? del pStmt en la posicion en ese
				// momento
				pStmt.setString(posicion, coche.getMarca());

				// Sumamos 1 a posicion
				posicion++;
			}

			// Si el modelo de coche es diferente de null y no es igual a ""
			if (coche.getModelo() != null && !coche.getModelo().equals("")) {

				// Asignamos modelo de coche al ? del pStmt en la posicion en ese
				// momento
				pStmt.setString(posicion, coche.getModelo());

				// Sumamos 1 a posicion
				posicion++;
			}

			// Si el peso de coche es mayor de 0
			if (coche.getPeso() > 0) {

				// Asignamos peso de coche al ? del pStmt en la posicion en ese
				// momento
				pStmt.setInt(posicion, coche.getPeso());

				// Sumamos 1 a posicion
				posicion++;
			}

			// Si el potencia de coche es mayor de 0
			if (coche.getPotencia() > 0) {

				// Asignamos potencia de coche al ? del pStmt en la posicion en ese
				// momento
				pStmt.setInt(posicion, coche.getPotencia());

				// Sumamos 1 a posicion
				posicion++;
			}

			// Si el idPiloto de coche es diferente de null y no es igual a ""
			if (coche.getIdPiloto() != null && !coche.getIdPiloto().equals("")) {

				// Asignamos idPiloto de coche al ? del pStmt en la posicion en ese
				// momento
				pStmt.setString(posicion, coche.getIdPiloto());

				// Sumamos 1 a posicion
				posicion++;
			}

			// Asignamos idCoche de coche al ? del pStmt en la posicion en ese
			// momento
			pStmt.setString(posicion, coche.getIdCoche());

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
	 * Función que recibe un String con el id de un coche de la BDD, crea un objeto de la clase CocheVO y le asigna a ese objeto los datos referentes a la fila de la 
	 * tabla coche en la BDD con el id introducido como parámetro
	 * @param codXX
	 * @return un objeto de la clase CocheVO 
	 */
	public static CocheVO cargar(String codXX) {

		// Inicializamos un objeto coche de la clase CocheVO
		CocheVO coche = new CocheVO();

		// Nos conectamos a la base de datos gracias a conectarBD()
		Connection con = ConexionBD.conectarBD();

		// String query con la consulta a ejecutar
		String query = "SELECT * from coche where idCoche = ?";

		// Intentamos
		try {

			// PreparedStatement pStmt con query como referencia gracias a con
			PreparedStatement pStmt = con.prepareStatement(query);

			// Asignamos codXX al primer ? del pStmt
			pStmt.setString(1, codXX);

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
