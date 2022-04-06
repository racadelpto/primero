package practicaBDD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;

import utils.ConexionBD;

public class CampeonatoDAO {

	ArrayList<CarreraVO> carreras;
	
	public static int eliminar(String codXX) {
		
		int resultado = 0;

		Connection con = null;

		con = ConexionBD.conectarBD();

		String query = "DELETE from campeonato WHERE idCampeonato = ?";

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
	
	public static int insertar(CampeonatoVO campeonato) {
		
		int resultado = 0;
		
		if(campeonato==null) {
			return resultado;
		}
		
		String query = "INSERT into campeonato values(?,?,?,?,?,?)";
		
		Connection con = ConexionBD.conectarBD();
		
		
		try {
			
			PreparedStatement pStmt = con.prepareStatement(query);
			
			if(campeonato.getIdCampeonato()==null || campeonato.getIdCampeonato().equals("")) {
				return resultado;
			} else {
				
				pStmt.setString(1, campeonato.getIdCampeonato());
			}
			
			if(campeonato.getNombre()!=null && !campeonato.getNombre().equals("")) {
				
				pStmt.setString(2, campeonato.getNombre());
			} else {
				
				pStmt.setString(2, null);
			}
			
			if(campeonato.getYear()>0) {
				
				pStmt.setInt(3, campeonato.getYear());
			} else {
				
				pStmt.setString(3, null);
			}
			
			if(campeonato.getNumPilotos()>0) {

				pStmt.setInt(4, campeonato.getNumPilotos());
			} else {
				
				pStmt.setString(4, null);
			}

			if(campeonato.getNumCircuitos()>0) {

				pStmt.setInt(5, campeonato.getNumCircuitos());
			} else {
				
				pStmt.setString(5, null);
			}
			
			if(campeonato.getPilotoGanador()!=null && !campeonato.getPilotoGanador().equals("")) {
				
				pStmt.setString(6, campeonato.getPilotoGanador());
			} else {
				
				pStmt.setString(6, null);
			}
			
			resultado = pStmt.executeUpdate();
			
			pStmt.close();
			
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		return resultado;
	}
	
	public static int actualizar(CampeonatoVO campeonato) {
		
		int resultado = 0;
		int posicion = 1;
		
		String query = "UPDATE campeonato SET ";
		
		if(campeonato==null) {
			return resultado;
		}
		
		if(campeonato.getIdCampeonato()==null || campeonato.getIdCampeonato().equals("")) {
			return resultado;
		}
		
		if(campeonato.getNombre()!=null && !campeonato.getNombre().equals("")) {
			query += "Nombre = ?";
			
			posicion++;
		}
		
		if(campeonato.getYear()>0) {
			
			if(posicion==1) {
				query += "Año = ?";
			} else {
				query += ", Año = ?";
			}
			
			posicion++;
		}
		
		if(campeonato.getNumPilotos()>0) {

			if(posicion==1) {
				query += "numPilotos = ?";
			} else {
				query += ", numPilotos = ?";
			}

			posicion++;
		}

		if(campeonato.getNumCircuitos()>0) {

			if(posicion==1) {
				query += "numCircuitos = ?";
			} else {
				query += ", numCircuitos = ?";
			}

			posicion++;
		}
		
		if(campeonato.getPilotoGanador()!=null && !campeonato.getPilotoGanador().equals("")) {
			
			if(posicion==1) {
				query += "pilotoGanador = ?";
			} else {
				query += ", pilotoGanador = ?";
			}
			
			posicion++;
		}
		
		query = query.concat(" WHERE idCampeonato = ?");
		
		if(posicion==1) {
			return 0;
		}
		
		Connection con = ConexionBD.conectarBD();	
		
		try {
			PreparedStatement pStmt = con.prepareStatement(query);
			
			posicion = 1;
			
			if(campeonato.getNombre()!=null && !campeonato.getNombre().equals("")) {
				
				pStmt.setString(posicion, campeonato.getNombre());
				posicion++;
			}
			
			if(campeonato.getYear()>0) {
				
				pStmt.setInt(posicion, campeonato.getYear());
				posicion++;
			}
			
			if(campeonato.getNumPilotos()>0) {

				pStmt.setInt(posicion, campeonato.getNumPilotos());
				posicion++;
			}

			if(campeonato.getNumCircuitos()>0) {

				pStmt.setInt(posicion, campeonato.getNumCircuitos());
				posicion++;
			}
			
			if(campeonato.getPilotoGanador()!=null && !campeonato.getPilotoGanador().equals("")) {
				
				pStmt.setString(posicion, campeonato.getPilotoGanador());
				posicion++;
			}
			
			System.out.println(query);
			
			pStmt.setString(posicion, campeonato.getIdCampeonato());
			
			System.out.println(pStmt.toString());
			
			resultado = pStmt.executeUpdate();
			
			pStmt.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return resultado;
	}
	
	public static CampeonatoVO cargar(String codXX) {
		
		CampeonatoVO campeonato = new CampeonatoVO();
		
		Connection con = ConexionBD.conectarBD();
		
		String query = "SELECT * from campeonato where idCampeonato = ?";
		
		try {
			PreparedStatement pStmt = con.prepareStatement(query);
			
			pStmt.setString(1, codXX);
			
			ResultSet res = pStmt.executeQuery();
			
			res.next();
			
			campeonato.setIdCampeonato(res.getString("idCampeonato"));
			campeonato.setNombre(res.getString("Nombre"));
			campeonato.setNumCircuitos(res.getInt("numCircuitos"));
			campeonato.setNumPilotos(res.getInt("numPilotos"));
			campeonato.setYear(res.getInt("Año"));
			campeonato.setPilotoGanador(res.getString("pilotoGanador"));
			
			pStmt.close();
			
			res.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return campeonato;
		}
	
	public static ArrayList<CarreraVO> cargarCarreras(String codCampeonato){
		ArrayList<CarreraVO> carreras = new ArrayList<CarreraVO>();
		
		Connection con = ConexionBD.conectarBD();
		
		String query = "SELECT * from carrera where Campeonato_idCampeonato = ?";
		
		try {
			PreparedStatement pStmt = con.prepareStatement(query);
			
			pStmt.setString(1, codCampeonato);
			
			ResultSet res = pStmt.executeQuery();
			
			while(res.next()) {
				CarreraVO carrera = CarreraDAO.cargar(res.getString("idCarrera"));
				
				carreras.add(carrera);
			}
			
			pStmt.close();
			
			res.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
				
		return carreras;
	}
	
	public static int cantidadCarreras(String codCampeonato) {
	
		int resultado = 0;
		
		Connection con = ConexionBD.conectarBD();
		
		String query = "SELECT count(idCarrera) from carrera where Campeonato_idCampeonato = ?";
		
		try {
			PreparedStatement pStmt = con.prepareStatement(query);
			
			pStmt.setString(1, query);
			
			ResultSet res = pStmt.executeQuery();
			
			res.next();
			
			resultado = res.getInt(1);
			
			pStmt.close();
			
			res.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return resultado;
	}
}
