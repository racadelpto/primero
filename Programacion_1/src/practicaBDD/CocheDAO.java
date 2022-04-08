package practicaBDD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import utils.ConexionBD;

public class CocheDAO {

	public static int eliminar(String codXX) {

		//Inicializamos int resultado a 0
		int resultado = 0;

		//Nos conectamos a la base de datos gracias a conectarBD()
		Connection con = ConexionBD.conectarBD();

		//String query con la consulta a ejecutar
		String query = "DELETE from coche WHERE idCoche = ?";

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

	public static int insertar(CocheVO coche) {

		//Inicializamos int resultado a 0
		int resultado = 0;

		//Si coche es igual a null
		if (coche == null) {
			
			//Devolvemos resultado
			return resultado;
		}

		//String query con la consulta a ejecutar
		String query = "INSERT into coche values(?,?,?,?,?,?)";

		//Nos conectamos a la base de datos gracias a conectarBD()
		Connection con = ConexionBD.conectarBD();

		//Intentamos
		try {

			//PreparedStatement pStmt con query como referencia gracias a con
			PreparedStatement pStmt = con.prepareStatement(query);

			//Si el idCoche de coche es diferente de null y no es igual a ""
			if (coche.getIdCoche() == null || coche.getIdCoche().equals("")) {

				//Asignamos idCoche de coche al primer ? del pStmt
				pStmt.setString(1, coche.getIdCoche());
				
			} //Si no
			else {

				//Devolvemos resultado
				return resultado;
			}

			//Si la marca de coche es diferente de null y no es igual a ""
			if (coche.getMarca() != null && !coche.getMarca().equals("")) {

				//Asignamos marca de coche al segundo ? del pStmt
				pStmt.setString(2, coche.getMarca());
				
			} //Si no
			else {

				//Devolvemos resultado
				return resultado;
			}

			//Si el modelo de coche es diferente de null y no es igual a ""
			if (coche.getModelo() != null && !coche.getModelo().equals("")) {

				//Asignamos modelo de coche al tercer ? del pStmt
				pStmt.setString(3, coche.getModelo());
				
			} //Si no
			else {

				//Devolvemos resultado
				return resultado;
			}

			//Si el peso de coche es mayor de 0
			if (coche.getPeso() > 0) {

				//Asignamos peso de coche al cuarto ? del pStmt
				pStmt.setInt(4, coche.getPeso());
				
			} //Si no
			else {

				//Devolvemos resultado
				return resultado;
			}

			//Si la potencia de coche es mayor de 0
			if (coche.getPotencia() > 0) {

				//Asignamos potencia de coche al quinto ? del pStmt
				pStmt.setInt(5, coche.getPotencia());
				
			} //Si no
			else {

				//Devolvemos resultado
				return resultado;
			}

			//Si el idPiloto de coche es diferente de null y no es igual a ""
			if (coche.getIdPiloto() != null && !coche.getIdPiloto().equals("")) {

				//Asignamos idPiloto de coche al sexto ? del pStmt
				pStmt.setString(6, coche.getIdPiloto());
				
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

	public static int actualizar(CocheVO coche) {

		int resultado = 0;
		int posicion = 1;

		String query = "UPDATE coche SET ";

		if (coche == null) {
			return resultado;
		}

		if (coche.getIdCoche() == null || coche.getIdCoche().equals("")) {
			return resultado;
		}

		if (coche.getMarca() != null && !coche.getMarca().equals("")) {
			query += "Marca = ?";

			posicion++;
		}

		if (coche.getModelo() != null && !coche.getModelo().equals("")) {

			if (posicion == 1) {
				query += "Modelo = ?";
			} else {
				query += ", Modelo = ?";
			}

			posicion++;
		}

		if (coche.getPeso() > 0) {

			if (posicion == 1) {
				query += "Peso = ?";
			} else {
				query += ", Peso = ?";
			}

			posicion++;
		}

		if (coche.getPotencia() > 0) {

			if (posicion == 1) {
				query += "Potencia = ?";
			} else {
				query += ", Potencia = ?";
			}

			posicion++;
		}

		if (coche.getIdPiloto() != null && !coche.getIdPiloto().equals("")) {

			if (posicion == 1) {
				query += "Piloto_idPiloto = ?";
			} else {
				query += ", Piloto_idPiloto = ?";
			}

			posicion++;
		}

		query = query.concat(" WHERE idCoche = ?");

		if (posicion == 1) {
			return 0;
		}

		Connection con = ConexionBD.conectarBD();

		try {
			PreparedStatement pStmt = con.prepareStatement(query);

			posicion = 1;

			if (coche.getMarca() != null && !coche.getMarca().equals("")) {

				pStmt.setString(posicion, coche.getMarca());
				posicion++;
			}

			if (coche.getModelo() != null && !coche.getModelo().equals("")) {

				pStmt.setString(posicion, coche.getModelo());
				posicion++;
			}

			if (coche.getPeso() > 0) {

				pStmt.setInt(posicion, coche.getPeso());
				posicion++;
			}

			if (coche.getPotencia() > 0) {

				pStmt.setInt(posicion, coche.getPotencia());
				posicion++;
			}

			if (coche.getIdPiloto() != null && !coche.getIdPiloto().equals("")) {

				pStmt.setString(posicion, coche.getIdPiloto());
				posicion++;
			}

			pStmt.setString(posicion, coche.getIdCoche());

			resultado = pStmt.executeUpdate();

			pStmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return resultado;
	}

	public static CocheVO cargar(String codXX) {

		CocheVO coche = new CocheVO();

		Connection con = ConexionBD.conectarBD();

		String query = "SELECT * from coche where idCoche = ?";

		try {
			PreparedStatement pStmt = con.prepareStatement(query);

			pStmt.setString(1, codXX);

			ResultSet res = pStmt.executeQuery();

			res.next();

			coche.setIdCoche(res.getString("idCoche"));
			coche.setMarca(res.getString("Marca"));
			coche.setModelo(res.getString("Modelo"));
			coche.setPeso(res.getInt("Peso"));
			coche.setPotencia(res.getInt("Potencia"));
			coche.setIdPiloto(res.getString("Piloto_idPiloto"));

			pStmt.close();

			res.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return coche;
	}
}
