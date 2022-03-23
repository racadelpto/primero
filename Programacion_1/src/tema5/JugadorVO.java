package tema5;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JugadorVO {

	private int id;
	private String nombre;
	private int edad;
	private int altura;
	private String sexo;

	public JugadorVO() {
		super();
	}

	public JugadorVO(int id, String nombre, int edad, int altura, String sexo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
		this.altura = altura;
		this.sexo = sexo;
	}

	/**
	 * Nos introduce en la BD los datos del jugador
	 * 
	 * @param jugador
	 * @return 1 si se insertó el registro en BD, 0 si no se pudo
	 */
	public static int insertarJugador(JugadorVO jugador) {

		// Variable para retornar si se pudo insertar
		int resultado = 0;

		// Conexion para acceder a BD
		Connection con = null;

		try {

			// Nos conectamos a la Base de Datos
			con = ConexionBD.conectarBD();

			// Consulta a ejecutar
			String query = "insert into jugador values (?,?,?,?,?)";

			// El preparedStatement lo genera la conexion utilizando
			// la consulta/query a ejecutar
			PreparedStatement pStmt = con.prepareStatement(query);

			pStmt.setInt(1, jugador.getId());
			pStmt.setString(2, jugador.getNombre());
			pStmt.setInt(3, jugador.getEdad());
			pStmt.setInt(4, jugador.getAltura());
			pStmt.setString(5, jugador.getSexo());

			// Ejecutamos la query
			resultado = pStmt.executeUpdate();

			// Cerramos el statement
			pStmt.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Cerramos la conexion
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return resultado;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

}
