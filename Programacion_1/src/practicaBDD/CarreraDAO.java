package practicaBDD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import utils.ConexionBD;

public class CarreraDAO {

	ArrayList<PilotoVO> pilotos;

	public static int eliminar(String codXX) {

		// Inicializamos int resultado a 0
		int resultado = 0;

		// Nos conectamos a la base de datos gracias a conectarBD()
		Connection con = ConexionBD.conectarBD();

		// String query con la consulta a ejecutar
		String query = "DELETE from carrera WHERE idCarrera = ?";

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

	public static int insertar(CarreraVO carrera) {

		// Inicializamos int resultado a 0
		int resultado = 0;

		// Si carrera es igual a null
		if (carrera == null) {

			// Devolvemos resultado
			return resultado;
		}

		// String query con la consulta a ejecutar
		String query = "INSERT into carrera values(?,?,?,?,?,?,?)";

		// Nos conectamos a la base de datos gracias a conectarBD()
		Connection con = ConexionBD.conectarBD();

		// Intentamos
		try {

			// PreparedStatement pStmt con query como referencia gracias a con
			PreparedStatement pStmt = con.prepareStatement(query);

			// Si el idCarrera de carrera es diferente de null y no es igual a ""
			if (carrera.getIdCarrera() != null && !carrera.getIdCarrera().equals("")) {

				// Asignamos idCarrera de carrera al primer ? del pStmt
				pStmt.setString(1, carrera.getIdCarrera());

			} // Si no
			else {

				// Devolvemos resultado
				return resultado;
			}

			// Si el numVueltas de carrera es mayor de 0
			if (carrera.getNumVueltas() > 0) {

				// Asignamos numVueltas de carrera al segundo ? del pStmt
				pStmt.setInt(2, carrera.getNumVueltas());

			} // Si no
			else {

				// Devolvemos resultado
				return resultado;
			}

			// Si el vueltaRapida de carrera es mayor de 0
			if (carrera.getVueltaRapida() > 0) {

				// Asignamos vueltaRapida de carrera al tercer ? del pStmt
				pStmt.setDouble(3, carrera.getVueltaRapida());

			} // Si no
			else {

				// Devolvemos resultado
				return resultado;
			}

			// Si el numAccidentes de carrera es mayor de -1
			if (carrera.getNumAccidentes() > -1) {

				// Asignamos numAccidentes de carrera al cuarto ? del pStmt
				pStmt.setInt(4, carrera.getNumAccidentes());

			} // Si no
			else {

				// Devolvemos resultado
				return resultado;
			}

			// Si la fecha de carrera es diferente de null y no es igual a ""
			if (carrera.getFecha() != null && !carrera.getFecha().equals("")) {

				// Asignamos fecha de carrera al quinto ? del pStmt
				pStmt.setString(5, carrera.getFecha());

			} // Si no
			else {

				// Devolvemos resultado
				return resultado;
			}

			// Si el idCircuito de carrera es diferente de null y no es igual a ""
			if (carrera.getIdCircuito() != null && !carrera.getIdCircuito().equals("")) {

				// Asignamos idCircuito de carrera al sexto ? del pStmt
				pStmt.setString(6, carrera.getIdCircuito());

			} // Si no
			else {

				// Devolvemos resultado
				return resultado;
			}

			// Si el idCampeonato de carrera es diferente de null y no es igual a ""
			if (carrera.getIdCampeonato() != null && !carrera.getIdCampeonato().equals("")) {

				// Asignamos idCampeonato de carrera al séptimo ? del pStmt
				pStmt.setString(7, carrera.getIdCampeonato());

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

	public static int actualizar(CarreraVO carrera) {

		// Inicializamos in resultado a 0 e int posicion a 1
		int resultado = 0;
		int posicion = 1;

		// String query con la consulta a ejecutar
		String query = "UPDATE carrera SET ";

		// Si carrera es igual a null
		if (carrera == null) {

			// Devolvemos resultado
			return resultado;
		}

		// Si el idCarrera de carrera es diferente de null y no es igual a ""
		if (carrera.getIdCarrera() == null || carrera.getIdCarrera().equals("")) {

			// Devolvemos resultado
			return resultado;
		}

		// Si el numVueltas de carrera es mayor de 0
		if (carrera.getNumVueltas() > 0) {

			// Sumamos a query ese String
			query += "numVueltas = ?";

			// Sumamos 1 a posicion
			posicion++;
		}

		// Si el vueltaRapida de carrera es mayor de 0
		if (carrera.getVueltaRapida() > 0) {

			// Si posicion es igual a 1
			if (posicion == 1) {

				// Sumamos a query ese String
				query += "vueltaRapida = ?";

			} // Si no
			else {

				// Sumamos a query ese String
				query += ", vueltaRapida = ?";
			}

			// Sumamos 1 a posicion
			posicion++;
		}

		// Si el numAccidentes de carrera es mayor de 0
		if (carrera.getNumAccidentes() > 0) {

			// Si posicion es igual a 1
			if (posicion == 1) {

				// Sumamos a query ese String
				query += "numAccidentes = ?";

			} // Si no
			else {

				// Sumamos a query ese String
				query += ", numAccidentes = ?";
			}

			// Sumamos 1 a posicion
			posicion++;
		}

		// Si el fecha de carrera es diferente de null y no es igual a ""
		if (carrera.getFecha() != null && !carrera.getFecha().equals("")) {

			// Si posicion es igual a 1
			if (posicion == 1) {

				// Sumamos a query ese String
				query += "Fecha = ?";

			} // Si no
			else {

				// Sumamos a query ese String
				query += ", Fecha = ?";
			}

			// Sumamos 1 a posicion
			posicion++;
		}

		// Si el idCircuito de carrera es diferente de null y no es igual a ""
		if (carrera.getIdCircuito() != null && !carrera.getIdCircuito().equals("")) {

			// Si posicion es igual a 1
			if (posicion == 1) {

				// Sumamos a query ese String
				query += "Circuito_idCircuito = ?";

			} // Si no
			else {

				// Sumamos a query ese String
				query += ", Circuito_idCircuito = ?";
			}

			// Sumamos 1 a posicion
			posicion++;
		}

		// Si el idCampeonato de carrera es diferente de null y no es igual a ""
		if (carrera.getIdCampeonato() != null && !carrera.getIdCampeonato().equals("")) {

			// Si posicion es igual a 1
			if (posicion == 1) {

				// Sumamos a query ese String
				query += "Campeonato_idCampeonato = ?";

			} // Si no
			else {

				// Sumamos a query ese String
				query += ", Campeonato_idCampeonato = ?";
			}

			// Sumamos 1 a posicion
			posicion++;
		}

		// Unimos a query ese String
		query = query.concat(" WHERE idCarrera = ?");

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

			// Si el numVueltas de carrera es mayor de 0
			if (carrera.getNumVueltas() > 0) {

				// Asignamos numVueltas de carrera al ? del pStmt en la posicion en ese
				// momento
				pStmt.setInt(posicion, carrera.getNumVueltas());

				// Sumamos 1 a posicion
				posicion++;
			}

			// Si el vueltaRapida de carrera es mayor de 0
			if (carrera.getVueltaRapida() > 0) {

				// Asignamos vueltaRapida de carrera al ? del pStmt en la posicion en ese
				// momento
				pStmt.setDouble(posicion, carrera.getVueltaRapida());

				// Sumamos 1 a posicion
				posicion++;
			}

			// Si el numAccidentes de carrera es mayor de 0
			if (carrera.getNumAccidentes() > 0) {

				// Asignamos numAccidentes de carrera al ? del pStmt en la posicion en ese
				// momento
				pStmt.setInt(posicion, carrera.getNumAccidentes());

				// Sumamos 1 a posicion
				posicion++;
			}

			// Si el fecha de carrera es diferente de null y no es igual a ""
			if (carrera.getFecha() != null && !carrera.getFecha().equals("")) {

				// Asignamos fecha de carrera al ? del pStmt en la posicion en ese
				// momento
				pStmt.setString(posicion, carrera.getFecha());

				// Sumamos 1 a posicion
				posicion++;
			}

			// Si el idCircuito de carrera es diferente de null y no es igual a ""
			if (carrera.getIdCircuito() != null && !carrera.getIdCircuito().equals("")) {

				// Asignamos idCircuito de carrera al ? del pStmt en la posicion en ese
				// momento
				pStmt.setString(posicion, carrera.getIdCircuito());

				// Sumamos 1 a posicion
				posicion++;
			}

			// Si el idCampeonato de carrera es diferente de null y no es igual a ""
			if (carrera.getIdCampeonato() != null && !carrera.getIdCampeonato().equals("")) {

				// Asignamos idCampeonato de carrera al ? del pStmt en la posicion en ese
				// momento
				pStmt.setString(posicion, carrera.getIdCampeonato());

				// Sumamos 1 a posicion
				posicion++;
			}

			// Asignamos idCarrera de carrera al ? del pStmt en la posicion en ese
			// momento
			pStmt.setString(posicion, carrera.getIdCarrera());

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

	public static CarreraVO cargar(String codXX) {

		// Inicializamos un objeto carrera de la clase CarreraVO
		CarreraVO carrera = new CarreraVO();

		// Nos conectamos a la base de datos gracias a conectarBD()
		Connection con = ConexionBD.conectarBD();

		// String query con la consulta a ejecutar
		String query = "SELECT * from carrera where idCarrera = ?";

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

			// Asignamos cada atributo al objeto carrera sacando los datos de las
			// columnas de res dependiendo del dato a asignar
			carrera.setIdCarrera(res.getString("idCarrera"));
			carrera.setNumVueltas(res.getInt("numVueltas"));
			carrera.setVueltaRapida(res.getDouble("vueltaRapida"));
			carrera.setNumAccidentes(res.getInt("numAccidentes"));
			carrera.setFecha(res.getString("Fecha"));
			carrera.setIdCircuito(res.getString("Circuito_idCircuito"));
			carrera.setIdCampeonato(res.getString("Campeonato_idCampeonato"));

			// Cerramos pStmt, res y con
			pStmt.close();
			res.close();
			con.close();

		} catch (SQLException e) {

			// Expresamos el error
			e.printStackTrace();
		}

		// Devolvemos carrera
		return carrera;
	}

	public static ArrayList<PilotoVO> cargarPilotos(String codCarrera) {

		// Inicializamos un ArrayList pilotos de la clase PilotoVO
		ArrayList<PilotoVO> pilotos = new ArrayList<PilotoVO>();

		// Nos conectamos a la base de datos gracias a conectarBD()
		Connection con = ConexionBD.conectarBD();

		// String query con la consulta a ejecutar
		String query = "SELECT Piloto_idPiloto from piloto_has_carrera where Carrera_idCarrera = ?";

		// Intentamos
		try {

			// PreparedStatement pStmt con query como referencia gracias a con
			PreparedStatement pStmt = con.prepareStatement(query);

			// Asignamos codCarrera al primer ? del pStmt
			pStmt.setString(1, codCarrera);

			// Inicializamos res de la clase ResultSet a la ejecución del query de pStmt
			ResultSet res = pStmt.executeQuery();

			// Mientras res tenga elementos
			while (res.next()) {

				// Inicializamos un objeto piloto de la clase PilotoVO al resultado de la
				// función
				// PilotoDAO.cargaPilotor() con el dato sacado de la columna de res como
				// referencia
				PilotoVO piloto = PilotoDAO.cargarPiloto(res.getString("Piloto_idPiloto"));

				// Añadimos piloto a pilotos
				pilotos.add(piloto);
			}

			// Cerramos pStmt, res y con
			pStmt.close();
			res.close();
			con.close();

		} catch (SQLException e) {

			// Expresamos el error
			e.printStackTrace();
		}

		// Devolvemos pilotos
		return pilotos;
	}
}
