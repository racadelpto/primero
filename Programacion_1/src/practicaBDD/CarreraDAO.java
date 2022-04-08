package practicaBDD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;

import utils.ConexionBD;

public class CarreraDAO {

	ArrayList<PilotoVO> pilotos;

	public static int eliminar(String codXX) {

		//Inicializamos int resultado a 0
		int resultado = 0;

		//Nos conectamos a la base de datos gracias a conectarBD()
		Connection con = ConexionBD.conectarBD();

		//String query con la consulta a ejecutar
		String query = "DELETE from carrera WHERE idCarrera = ?";

		//Intentamos
		try {

			//PreparedStatement pStmt con query como referencia gracias a con
			PreparedStatement pStmt = con.prepareStatement(query);

			//Asignamos codXX al primer ? del pStmt
			pStmt.setString(1, codXX);

			//resultado es igual a la ejecución del pStmt
			resultado = pStmt.executeUpdate();

			//Cerramos pStmt y con
			pStmt.close();
			con.close();

		} catch (SQLException e) {

			//Expresamos el error
			e.printStackTrace();
		}

		//Devolvemos resultado
		return resultado;
	}

	public static int insertar(CarreraVO carrera) {

		//Inicializamos int resultado a 0
		int resultado = 0;

		//Si carrera es igual a null
		if (carrera == null) {
			
			//Devolvemos resultado
			return resultado;
		}

		//String query con la consulta a ejecutar
		String query = "INSERT into carrera values(?,?,?,?,?,?,?)";

		//Nos conectamos a la base de datos gracias a conectarBD()
		Connection con = ConexionBD.conectarBD();

		//Intentamos
		try {

			//PreparedStatement pStmt con query como referencia gracias a con
			PreparedStatement pStmt = con.prepareStatement(query);

			//Si el idCarrera de carrera es diferente de null y no es igual a ""
			if (carrera.getIdCarrera() == null && carrera.getIdCarrera().equals("")) {

				//Asignamos idCarrera de carrera al primer ? del pStmt
				pStmt.setString(1, carrera.getIdCarrera());
				
			} //Si no
			else {

				//Devolvemos resultado
				return resultado;
			}

			//Si el numVueltas de carrera es mayor de 0
			if (carrera.getNumVueltas() > 0) {

				//Asignamos numVueltas de carrera al segundo ? del pStmt
				pStmt.setInt(2, carrera.getNumVueltas());
				
			} //Si no
			else {

				//Devolvemos resultado
				return resultado;
			}

			//Si el vueltaRapida de carrera es mayor de 0
			if (carrera.getVueltaRapida() > 0) {

				//Asignamos vueltaRapida de carrera al tercer ? del pStmt
				pStmt.setDouble(3, carrera.getVueltaRapida());
				
			} //Si no
			else {

				//Devolvemos resultado
				return resultado;
			}

			//Si el numAccidentes de carrera es mayor de -1
			if (carrera.getNumAccidentes() > -1) {

				//Asignamos numAccidentes de carrera al cuarto ? del pStmt
				pStmt.setInt(4, carrera.getNumAccidentes());
				
			} //Si no
			else {

				//Devolvemos resultado
				return resultado;
			}

			//Si la fecha de carrera es diferente de null y no es igual a ""
			if (carrera.getFecha() != null && !carrera.getFecha().equals("")) {

				//Asignamos fecha de carrera al quinto ? del pStmt
				pStmt.setString(5, carrera.getFecha());
				
			} //Si no
			else {

				//Devolvemos resultado
				return resultado;
			}

			//Si el idCircuito de carrera es diferente de null y no es igual a ""
			if (carrera.getIdCircuito() != null && !carrera.getIdCircuito().equals("")) {

				//Asignamos idCircuito de carrera al sexto ? del pStmt
				pStmt.setString(6, carrera.getIdCircuito());
				
			} //Si no
			else {

				//Devolvemos resultado
				return resultado;
			}

			//Si el idCampeonato de carrera es diferente de null y no es igual a ""
			if (carrera.getIdCampeonato() != null && !carrera.getIdCampeonato().equals("")) {

				//Asignamos idCampeonato de carrera al séptimo ? del pStmt
				pStmt.setString(7, carrera.getIdCampeonato());
				
			} //Si no
			else {

				//Devolvemos resultado
				return resultado;
			}

			//resultado es igual a la ejecución del pStmt
			resultado = pStmt.executeUpdate();

			//Cerramos pStmt y con
			pStmt.close();
			con.close();

		} catch (SQLException e) {

			//Expresamos el error
			e.printStackTrace();
		}

		//Devolvemos resultado
		return resultado;
	}

	public static int actualizar(CarreraVO carrera) {
		int resultado = 0;
		int posicion = 1;

		String query = "UPDATE carrera SET ";

		if (carrera == null) {
			return resultado;
		}

		if (carrera.getIdCarrera() == null || carrera.getIdCarrera().equals("")) {
			return resultado;
		}

		if (carrera.getNumVueltas() > 0) {
			query += "numVueltas = ?";

			posicion++;
		}

		if (carrera.getVueltaRapida() > 0) {

			if (posicion == 1) {
				query += "vueltaRapida = ?";
			} else {
				query += ", vueltaRapida = ?";
			}

			posicion++;
		}

		if (carrera.getNumAccidentes() > 0) {

			if (posicion == 1) {
				query += "numAccidentes = ?";
			} else {
				query += ", numAccidentes = ?";
			}

			posicion++;
		}

		if (carrera.getFecha() != null && !carrera.getFecha().equals("")) {

			if (posicion == 1) {
				query += "Fecha = ?";
			} else {
				query += ", Fecha = ?";
			}

			posicion++;
		}

		if (carrera.getIdCircuito() != null && !carrera.getIdCircuito().equals("")) {

			if (posicion == 1) {
				query += "Circuito_idCircuito = ?";
			} else {
				query += ", Circuito_idCircuito = ?";
			}

			posicion++;
		}

		if (carrera.getIdCampeonato() != null && !carrera.getIdCampeonato().equals("")) {

			if (posicion == 1) {
				query += "Campeonato_idCampeonato = ?";
			} else {
				query += ", Campeonato_idCampeonato = ?";
			}

			posicion++;
		}

		query = query.concat(" WHERE idCarrera = ?");

		if (posicion == 1) {
			return 0;
		}

		Connection con = ConexionBD.conectarBD();

		try {
			PreparedStatement pStmt = con.prepareStatement(query);

			posicion = 1;

			if (carrera.getNumVueltas() > 0) {

				pStmt.setInt(posicion, carrera.getNumVueltas());
				posicion++;
			}

			if (carrera.getVueltaRapida() > 0) {

				pStmt.setDouble(posicion, carrera.getVueltaRapida());
				posicion++;
			}

			if (carrera.getNumAccidentes() > 0) {

				pStmt.setInt(posicion, carrera.getNumAccidentes());
				posicion++;
			}

			if (carrera.getFecha() != null && !carrera.getFecha().equals("")) {

				pStmt.setString(posicion, carrera.getFecha());
				posicion++;
			}

			if (carrera.getIdCircuito() != null && !carrera.getIdCircuito().equals("")) {

				pStmt.setString(posicion, carrera.getIdCircuito());
				posicion++;
			}

			if (carrera.getIdCampeonato() != null && !carrera.getIdCampeonato().equals("")) {

				pStmt.setString(posicion, carrera.getIdCampeonato());
				posicion++;
			}

			pStmt.setString(posicion, carrera.getIdCarrera());

			resultado = pStmt.executeUpdate();

			pStmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return resultado;
	}

	public static CarreraVO cargar(String codXX) {
		CarreraVO carrera = new CarreraVO();

		Connection con = ConexionBD.conectarBD();

		String query = "SELECT * from carrera where idCarrera = ?";

		try {
			PreparedStatement pStmt = con.prepareStatement(query);

			pStmt.setString(1, codXX);

			ResultSet res = pStmt.executeQuery();

			res.next();

			carrera.setIdCarrera(res.getString("idCarrera"));
			carrera.setNumVueltas(res.getInt("numVueltas"));
			carrera.setVueltaRapida(res.getDouble("vueltaRapida"));
			carrera.setNumAccidentes(res.getInt("numAccidentes"));
			carrera.setFecha(res.getString("Fecha"));
			carrera.setIdCircuito(res.getString("Circuito_idCircuito"));
			carrera.setIdCampeonato(res.getString("Campeonato_idCampeonato"));

			pStmt.close();

			res.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return carrera;
	}

	public static ArrayList<PilotoVO> cargarPilotos(String codCarrera) {

		ArrayList<PilotoVO> pilotos = new ArrayList<PilotoVO>();

		Connection con = ConexionBD.conectarBD();

		String query = "SELECT * from piloto_has_carrera where Carrera_idCarrera = ?";

		try {
			PreparedStatement pStmt = con.prepareStatement(query);

			pStmt.setString(1, codCarrera);

			ResultSet res = pStmt.executeQuery();

			while (res.next()) {

				PilotoVO piloto = PilotoDAO.cargarPiloto(res.getString("Piloto_idPiloto"));

				pilotos.add(piloto);
			}

			pStmt.close();

			res.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return pilotos;
	}
}
