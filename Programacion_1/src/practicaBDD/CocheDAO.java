package practicaBDD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import utils.ConexionBD;

public class CocheDAO {

	public static int eliminar(String codXX) {

		int resultado = 0;

		Connection con = null;

		con = ConexionBD.conectarBD();

		String query = "DELETE from coche WHERE idCoche = ?";

		try {

			PreparedStatement pStmt = con.prepareStatement(query);

			pStmt.setString(1, codXX);

			resultado = pStmt.executeUpdate();

			pStmt.close();

			con.close();

		} catch (SQLException e) {

			e.printStackTrace();
		}

		return resultado;
	}

	public static int insertar(CocheVO coche) {

		int resultado = 0;

		if (coche == null) {
			return resultado;
		}

		String query = "INSERT into coche values(?,?,?,?,?,?)";

		Connection con = ConexionBD.conectarBD();

		try {

			PreparedStatement pStmt = con.prepareStatement(query);

			if (coche.getIdCoche() == null || coche.getIdCoche().equals("")) {

				pStmt.setString(1, coche.getIdCoche());
			} else {

				return resultado;
			}

			if (coche.getMarca() != null && !coche.getMarca().equals("")) {

				pStmt.setString(2, coche.getMarca());
			} else {

				return resultado;
			}

			if (coche.getModelo() != null && !coche.getModelo().equals("")) {

				pStmt.setString(3, coche.getModelo());
			} else {

				return resultado;
			}

			if (coche.getPeso() > 0) {

				pStmt.setInt(4, coche.getPeso());
			} else {

				return resultado;
			}

			if (coche.getPotencia() > 0) {

				pStmt.setInt(5, coche.getPotencia());
			} else {

				return resultado;
			}

			if (coche.getIdPiloto() != null && !coche.getIdPiloto().equals("")) {

				pStmt.setString(6, coche.getIdPiloto());
			} else {

				return resultado;
			}

			resultado = pStmt.executeUpdate();

			pStmt.close();

		} catch (SQLException e) {

			e.printStackTrace();
		}

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
