package practicaBDD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import utils.ConexionBD;

public class PilotoDAO {

	public static int eliminar(String codXX) {

		//Inicializamos int resultado a 0
		int resultado = 0;

		//Nos conectamos a la base de datos gracias a conectarBD()
		Connection con = ConexionBD.conectarBD();

		//String query con la consulta a ejecutar
		String query = "DELETE from piloto WHERE idPiloto = ?";

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

	public static int insertar(PilotoVO piloto) {

		//Inicializamos int resultado a 0
		int resultado = 0;

		//Si piloto es igual a null
		if (piloto == null) {
			
			//Devolvemos resultado
			return resultado;
		}

		//String query con la consulta a ejecutar
		String query = "INSERT into piloto values(?,?,?,?,?,?)";

		//Nos conectamos a la base de datos gracias a conectarBD()
		Connection con = ConexionBD.conectarBD();

		//Intentamos
		try {

			//PreparedStatement pStmt con query como referencia gracias a con
			PreparedStatement pStmt = con.prepareStatement(query);

			//Si el idPiloto de piloto es diferente de null y no es igual a ""
			if (piloto.getIdPiloto() != null || !piloto.getIdPiloto().equals("")) {

				//Asignamos idPiloto de piloto al primer ? del pStmt
				pStmt.setString(1, piloto.getIdPiloto());
				
			} //Si no
			else {

				//Devolvemos resultado
				return resultado;
			}

			//Si el dNI de piloto es diferente de null y no es igual a ""
			if (piloto.getdNI() != null && !piloto.getdNI().equals("")) {

				//Asignamos dNI de piloto al segundo ? del pStmt
				pStmt.setString(2, piloto.getdNI());
				
			} //Si no
			else {

				//Devolvemos resultado
				return resultado;
			}

			//Si el nombre de piloto es diferente de null y no es igual a ""
			if (piloto.getNombre() != null && !piloto.getNombre().equals("")) {

				//Asignamos nombre de piloto al tercer ? del pStmt
				pStmt.setString(3, piloto.getNombre());
				
			} //Si no
			else {

				//Devolvemos resultado
				return resultado;
			}

			//Si la edad de piloto es mayor de 0
			if (piloto.getEdad() > 0) {

				//Asignamos edad de piloto al cuarto ? del pStmt
				pStmt.setInt(4, piloto.getEdad());
				
			} //Si no
			else {

				//Devolvemos resultado
				return resultado;
			}

			//Si el sexo de piloto es diferente de null y no es igual a ""
			if (piloto.getSexo() != null && !piloto.getSexo().equals("")) {

				//Asignamos sexo de piloto al quinto ? del pStmt
				pStmt.setString(5, piloto.getSexo());
				
			} //Si no
			else {

				//Devolvemos resultado
				return resultado;
			}

			//Si la direccion de piloto es diferente de null y no es igual a ""
			if (piloto.getDireccion() != null && !piloto.getDireccion().equals("")) {

				//Asignamos direccion de piloto al sexto ? del pStmt
				pStmt.setString(6, piloto.getDireccion());
				
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

	public static int actualizar(PilotoVO piloto) {

		int resultado = 0;
		int posicion = 1;

		String query = "UPDATE piloto SET ";

		if (piloto == null) {
			return resultado;
		}

		if (piloto.getIdPiloto() == null || piloto.getIdPiloto().equals("")) {
			return resultado;
		}

		if (piloto.getdNI() != null && !piloto.getdNI().equals("")) {
			query += "DNI = ?";

			posicion++;
		}

		if (piloto.getNombre() != null && !piloto.getNombre().equals("")) {

			if (posicion == 1) {
				query += "Nombre = ?";
			} else {
				query += ", Nombre = ?";
			}

			posicion++;
		}

		if (piloto.getEdad() > 0) {

			if (posicion == 1) {
				query += "Edad = ?";
			} else {
				query += ", Edad = ?";
			}

			posicion++;
		}

		if (piloto.getSexo() != null && !piloto.getSexo().equals("")) {

			if (posicion == 1) {
				query += "Sexo = ?";
			} else {
				query += ", Sexo = ?";
			}

			posicion++;
		}

		if (piloto.getDireccion() != null && !piloto.getDireccion().equals("")) {

			if (posicion == 1) {
				query += "Dirección = ?";
			} else {
				query += ", Dirección = ?";
			}

			posicion++;
		}

		query = query.concat(" WHERE idPiloto = ?");

		if (posicion == 1) {
			return 0;
		}

		Connection con = ConexionBD.conectarBD();

		try {
			PreparedStatement pStmt = con.prepareStatement(query);

			posicion = 1;

			if (piloto.getdNI() != null && !piloto.getdNI().equals("")) {

				pStmt.setString(posicion, piloto.getdNI());
				posicion++;
			}

			if (piloto.getNombre() != null && !piloto.getNombre().equals("")) {

				pStmt.setString(posicion, piloto.getNombre());
				posicion++;
			}

			if (piloto.getEdad() > 0) {

				pStmt.setInt(posicion, piloto.getEdad());
				posicion++;
			}

			if (piloto.getSexo() != null && !piloto.getSexo().equals("")) {

				pStmt.setString(posicion, piloto.getSexo());
				posicion++;
			}

			if (piloto.getDireccion() != null && !piloto.getDireccion().equals("")) {

				pStmt.setString(posicion, piloto.getDireccion());
				posicion++;
			}

			pStmt.setString(posicion, piloto.getIdPiloto());

			resultado = pStmt.executeUpdate();

			pStmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return resultado;
	}

	public static PilotoVO cargarPiloto(String codPiloto) {

		PilotoVO piloto = new PilotoVO();

		Connection con = ConexionBD.conectarBD();

		String query = "SELECT * from piloto where idPiloto = ?";

		try {
			PreparedStatement pStmt = con.prepareStatement(query);

			pStmt.setString(1, codPiloto);

			ResultSet res = pStmt.executeQuery();

			res.next();

			piloto.setIdPiloto(res.getString("idPiloto"));
			piloto.setdNI(res.getString("DNI"));
			piloto.setNombre(res.getString("Nombre"));
			piloto.setEdad(res.getInt("Edad"));
			piloto.setSexo(res.getString("Sexo"));
			piloto.setDireccion(res.getString("Dirección"));
			piloto.setCoche(PilotoDAO.cargar(codPiloto));

			pStmt.close();

			res.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return piloto;
	}

	public static CocheVO cargar(String codPiloto) {

		CocheVO coche = new CocheVO();

		Connection con = ConexionBD.conectarBD();

		String query = "SELECT * from coche where Piloto_idPiloto = ?";

		try {
			PreparedStatement pStmt = con.prepareStatement(query);

			pStmt.setString(1, codPiloto);

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
