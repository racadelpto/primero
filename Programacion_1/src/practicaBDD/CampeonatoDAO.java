package practicaBDD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import utils.ConexionBD;

/**
 * Funciones relativas a la clase CampeonatoDAO
 * @author raulh
 *
 */
public class CampeonatoDAO {

	// ArrayList de la clase CampeonatoDAO
	ArrayList<CarreraVO> carreras;

	/**
	 * Función que recibe un String con el id de un campeonato de la BDD y elimina esa fila de la BDD
	 * @param codXX
	 * @return un 0 o 1 en función de si ha borrado la fila o no
	 */
	public static int eliminar(String codXX) {

		// Inicializamos int resultado a 0
		int resultado = 0;

		// Nos conectamos a la base de datos gracias a conectarBD()
		Connection con = ConexionBD.conectarBD();

		// String query con la consulta a ejecutar
		String query = "DELETE from campeonato WHERE idCampeonato = ?";

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
	 * Función que recibe un objeto de la clase CampeonatoVO e inserta datos en la tabla campeonato de la BDD en función de los atributos del objeto
	 * @param campeonato
	 * @return un 0 o 1 en función de si ha insertado los datos o no
	 */
	public static int insertar(CampeonatoVO campeonato) {

		// Inicializamos int resultado a 0
		int resultado = 0;

		// Si campeonato es igual a null
		if (campeonato == null) {

			// Devolvemos resultado
			return resultado;
		}

		// String query con la consulta a ejecutar
		String query = "INSERT into campeonato values(?,?,?,?,?,?)";

		// Nos conectamos a la base de datos gracias a conectarBD()
		Connection con = ConexionBD.conectarBD();

		// Intentamos
		try {

			// PreparedStatement pStmt con query como referencia gracias a con
			PreparedStatement pStmt = con.prepareStatement(query);

			// Si el idCampeonato de campeonato es diferente de null y no es igual a ""
			if (campeonato.getIdCampeonato() != null && !campeonato.getIdCampeonato().equals("")) {

				// Asignamos idCampeonato de campeonato al primer ? del pStmt
				pStmt.setString(1, campeonato.getIdCampeonato());

			} // Si no
			else {

				// Devolvemos resultado
				return resultado;
			}

			// Si el nombre de campeonato es diferente de null y no es igual a ""
			if (campeonato.getNombre() != null && !campeonato.getNombre().equals("")) {

				// Asignamos nombre de campeonato al segundo ? del pStmt
				pStmt.setString(2, campeonato.getNombre());

			} // Si no
			else {

				// Devolvemos resultado
				return resultado;
			}

			// Si el year de campeonato es mayor de 0
			if (campeonato.getYear() > 0) {

				// Asignamos year de campeonato al tercer ? del pStmt
				pStmt.setInt(3, campeonato.getYear());

			} // Si no
			else {

				// Devolvemos resultado
				return resultado;
			}

			// Si el numPilotos de campeonato es mayor de 0
			if (campeonato.getNumPilotos() > 0) {

				// Asignamos numPilotos de campeonato al cuarto ? del pStmt
				pStmt.setInt(4, campeonato.getNumPilotos());

			} // Si no
			else {

				// Devolvemos resultado
				return resultado;
			}

			// Si el numCircuitos de campeonato es mayor de 0
			if (campeonato.getNumCircuitos() > 0) {

				// Asignamos numCircuitos de campeonato al quinto ? del pStmt
				pStmt.setInt(5, campeonato.getNumCircuitos());

			} // Si no
			else {

				// Devolvemos resultado
				return resultado;
			}

			// Si el pilotoGanador de campeonato es diferente de null y no es igual a ""
			if (campeonato.getPilotoGanador() != null && !campeonato.getPilotoGanador().equals("")) {

				// Asignamos pilotoGanador de campeonato al sexto ? del pStmt
				pStmt.setString(6, campeonato.getPilotoGanador());

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
	 * Función que recibe un objeto de la clase CampeonatoVO y actualiza los datos en la tabla campeonato en función de los atributos del objeto
	 * @param campeonato
	 * @return un 0 o 1 en función de si ha actualizado los datos o no
	 */
	public static int actualizar(CampeonatoVO campeonato) {

		// Inicializamos in resultado a 0 e int posicion a 1
		int resultado = 0;
		int posicion = 1;

		// String query con la consulta a ejecutar
		String query = "UPDATE campeonato SET ";

		// Si campeonato es igual a null
		if (campeonato == null) {

			// Devolvemos resultado
			return resultado;
		}

		// Si el idCampeonato de campeonato es diferente de null y no es igual a ""
		if (campeonato.getIdCampeonato() == null || campeonato.getIdCampeonato().equals("")) {

			// Devolvemos resultado
			return resultado;
		}

		// Si el nombre de campeonato es diferente de null y no es igual a ""
		if (campeonato.getNombre() != null && !campeonato.getNombre().equals("")) {

			// Sumamos a query ese String
			query += "Nombre = ?";

			// Sumamos 1 a posicion
			posicion++;
		}

		// Si el year de campeonato es mayor de 0
		if (campeonato.getYear() > 0) {

			// Si posicion es igual a 1
			if (posicion == 1) {

				// Sumamos a query ese String
				query += "Año = ?";

			} // Si no
			else {

				// Sumamos a query ese String
				query += ", Año = ?";
			}

			// Sumamos 1 a posicion
			posicion++;
		}

		// Si el numPilotos de campeonato es mayor de 0
		if (campeonato.getNumPilotos() > 0) {

			// Si posicion es igual a 1
			if (posicion == 1) {

				// Sumamos a query ese String
				query += "numPilotos = ?";

			} // Si no
			else {

				// Sumamos a query ese String
				query += ", numPilotos = ?";
			}

			// Sumamos 1 a posicion
			posicion++;
		}

		// Si el numCircuitos de campeonato es mayor de 0
		if (campeonato.getNumCircuitos() > 0) {

			// Si posicion es igual a 1
			if (posicion == 1) {

				// Sumamos a query ese String
				query += "numCircuitos = ?";

			} // Si no
			else {

				// Sumamos a query ese String
				query += ", numCircuitos = ?";
			}

			// Sumamos 1 a posicion
			posicion++;
		}

		// Si el pilotoGanador de campeonato es diferente de null y no es igual a ""
		if (campeonato.getPilotoGanador() != null && !campeonato.getPilotoGanador().equals("")) {

			// Si posicion es igual a 1
			if (posicion == 1) {

				// Sumamos a query ese String
				query += "pilotoGanador = ?";

			} // Si no
			else {

				// Sumamos a query ese String
				query += ", pilotoGanador = ?";
			}

			// Sumamos 1 a posicion
			posicion++;
		}

		// Unimos a query ese String
		query = query.concat(" WHERE idCampeonato = ?");

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

			// Si el nombre de campeonato es diferente de null y no es igual a ""
			if (campeonato.getNombre() != null && !campeonato.getNombre().equals("")) {

				// Asignamos nombre de campeonato al ? del pStmt en la posicion en ese momento
				pStmt.setString(posicion, campeonato.getNombre());

				// Sumamos 1 a posicion
				posicion++;
			}

			// Si el year de campeonato es mayor de 0
			if (campeonato.getYear() > 0) {

				// Asignamos year de campeonato al ? del pStmt en la posicion en ese momento
				pStmt.setInt(posicion, campeonato.getYear());

				// Sumamos 1 a posicion
				posicion++;
			}

			// Si el numPilotos de campeonato es mayor de 0
			if (campeonato.getNumPilotos() > 0) {

				// Asignamos numPilotos de campeonato al ? del pStmt en la posicion en ese
				// momento
				pStmt.setInt(posicion, campeonato.getNumPilotos());

				// Sumamos 1 a posicion
				posicion++;
			}

			// Si el numCircuitos de campeonato es mayor de 0
			if (campeonato.getNumCircuitos() > 0) {

				// Asignamos numCircuitos de campeonato al ? del pStmt en la posicion en ese
				// momento
				pStmt.setInt(posicion, campeonato.getNumCircuitos());

				// Sumamos 1 a posicion
				posicion++;
			}

			// Si el pilotoGanador de campeonato es diferente de null y no es igual a ""
			if (campeonato.getPilotoGanador() != null && !campeonato.getPilotoGanador().equals("")) {

				// Asignamos pilotoGanador de campeonato al ? del pStmt en la posicion en ese
				// momento
				pStmt.setString(posicion, campeonato.getPilotoGanador());

				// Sumamos 1 a posicion
				posicion++;
			}

			// Asignamos idCampeonato de campeonato al ? del pStmt en la posicion en ese
			// momento
			pStmt.setString(posicion, campeonato.getIdCampeonato());

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
	 * Función que recibe un String con el id de un campeonato de la BDD, crea un objeto de la clase CampeonatoVO y le asigna a ese objeto los datos referentes a la fila de la 
	 * tabla campeonato en la BDD con el id introducido como parámetro
	 * @param codXX
	 * @return un objeto de la clase CampeonatoVO 
	 */
	public static CampeonatoVO cargar(String codXX) {

		// Inicializamos un objeto campeonato de la clase CampeonatoVO
		CampeonatoVO campeonato = new CampeonatoVO();

		// Nos conectamos a la base de datos gracias a conectarBD()
		Connection con = ConexionBD.conectarBD();

		// String query con la consulta a ejecutar
		String query = "SELECT * from campeonato where idCampeonato = ?";

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

			// Asignamos cada atributo al objeto campeonato sacando los datos de las
			// columnas de res dependiendo del dato a asignar
			campeonato.setIdCampeonato(res.getString("idCampeonato"));
			campeonato.setNombre(res.getString("Nombre"));
			campeonato.setNumCircuitos(res.getInt("numCircuitos"));
			campeonato.setNumPilotos(res.getInt("numPilotos"));
			campeonato.setYear(res.getInt("Año"));
			campeonato.setPilotoGanador(res.getString("pilotoGanador"));

			// Cerramos pStmt, res y con
			pStmt.close();
			res.close();
			con.close();

		} catch (SQLException e) {

			// Expresamos el error
			e.printStackTrace();
		}

		// Devolvemos campeonato
		return campeonato;
	}

	/**
	 * Función que recibe un String con el id de un campeonato de la BDD, crea un ArrayList de la clase CarreraVO e introduce en él las carreras referentes
	 * a la fila de la tabla campeonato en la BDD con el id introducido como parámetro
	 * @param codCampeonato
	 * @return un ArrayList de la clase CarreraVO
	 */
	public static ArrayList<CarreraVO> cargarCarreras(String codCampeonato) {

		// Inicializamos un ArrayList carreras de la clase CarreraVO
		ArrayList<CarreraVO> carreras = new ArrayList<CarreraVO>();

		// Nos conectamos a la base de datos gracias a conectarBD()
		Connection con = ConexionBD.conectarBD();

		// String query con la consulta a ejecutar
		String query = "SELECT idCarrera from carrera where Campeonato_idCampeonato = ?";

		// Intentamos
		try {

			// PreparedStatement pStmt con query como referencia gracias a con
			PreparedStatement pStmt = con.prepareStatement(query);

			// Asignamos codCampeonato al primer ? del pStmt
			pStmt.setString(1, codCampeonato);

			// Inicializamos res de la clase ResultSet a la ejecución del query de pStmt
			ResultSet res = pStmt.executeQuery();

			// Mientras res tenga elementos
			while (res.next()) {

				// Inicializamos un objeto carrera de la clase CarreraVO al resultado de la
				// función
				// CarreraDAO.cargar() con el dato sacado de la columna de res como referencia
				CarreraVO carrera = CarreraDAO.cargar(res.getString("idCarrera"));

				// Añadimos carrera a carreras
				carreras.add(carrera);
			}

			// Cerramos pStmt, res y con
			pStmt.close();
			res.close();
			con.close();

		} catch (SQLException e) {

			// Expresamos el error
			e.printStackTrace();
		}

		// Devolvemos carreras
		return carreras;
	}

	/**
	 * Función que recibe un String con el id de un campeonato de la BDD y calcula cuantas carreras están referenciadas a la fila de la tabla campeonato en la BDD con el id introducido
	 * @param codCampeonato
	 * @return un int con la cantidad de carreras del campeonato al que se referencia con el id introducido
	 */
	public static int cantidadCarreras(String codCampeonato) {

		// Inicializamos int resultado a 0
		int resultado = 0;

		// Nos conectamos a la base de datos gracias a conectarBD()
		Connection con = ConexionBD.conectarBD();

		// String query con la consulta a ejecutar
		String query = "SELECT count(idCarrera) from carrera where Campeonato_idCampeonato = ?";

		// Intentamos
		try {

			// PreparedStatement pStmt con query como referencia gracias a con
			PreparedStatement pStmt = con.prepareStatement(query);

			// Asignamos codCampeonato al primer ? del pStmt
			pStmt.setString(1, codCampeonato);

			// Inicializamos res de la clase ResultSet a la ejecución del query de pStmt
			ResultSet res = pStmt.executeQuery();

			// Pasamos al siguiente elemento en res
			res.next();

			// resultado pasa a valer el valor de la primera columna de res
			resultado = res.getInt(1);

			// Cerramos pStmt, res y con
			pStmt.close();
			res.close();
			con.close();

		} catch (SQLException e) {

			// Expresamos el error
			e.printStackTrace();
		}

		// Devolvemos resultado
		return resultado;
	}
}
