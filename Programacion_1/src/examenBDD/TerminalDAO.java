package examenBDD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class TerminalDAO {

	/**
	 * Función que inserta datos de un TerminalVO en la base de datos
	 * 
	 * @param terminal
	 * @return int en función de si hay error o no
	 */
	public static int insertarTerminales(TerminalVO terminal) {

		int resultado = 0;

		// String query con la consulta a ejecutar
		String query = "INSERT into phones values(?,?,?,?,?,?,?,?,?)";

		// Nos conectamos a la base de datos gracias a conectarBD()
		Connection con = ConexionBDExamen.conectarBD();

		// Intentamos
		try {

			// PreparedStatement pStmt con query como referencia gracias a con
			PreparedStatement pStmt = con.prepareStatement(query);

			/* Comprobamos que cada dato de terminal sea correcto */

			if (terminal.getId() > 0) {

				pStmt.setInt(1, terminal.getId());

			} // Si no
			else {

				// Devolvemos resultado
				return resultado;
			}

			if (terminal.getBrand() != null && !terminal.getBrand().equals("")) {

				pStmt.setString(2, terminal.getBrand());

			} // Si no
			else {

				// Devolvemos resultado
				return resultado;
			}

			if (terminal.getModel() != null && !terminal.getModel().equals("")) {

				pStmt.setString(3, terminal.getModel());

			} // Si no
			else {

				// Devolvemos resultado
				return resultado;
			}

			if (terminal.getRam() > 0) {

				pStmt.setInt(4, terminal.getRam());

			} // Si no
			else {

				// Devolvemos resultado
				return resultado;
			}

			if (terminal.getRom() > 0) {

				pStmt.setInt(5, terminal.getRom());

			} // Si no
			else {

				// Devolvemos resultado
				return resultado;
			}

			if (terminal.getInches() != null && !terminal.getInches().equals("")) {

				pStmt.setString(6, terminal.getInches());

			} // Si no
			else {

				// Devolvemos resultado
				return resultado;
			}

			if (terminal.getOs() != null && !terminal.getOs().equals("")) {

				pStmt.setString(7, terminal.getOs());

			} // Si no
			else {

				// Devolvemos resultado
				return resultado;
			}

			if (terminal.getPrice() > 0) {

				pStmt.setInt(8, terminal.getPrice());

			} // Si no
			else {

				// Devolvemos resultado
				return resultado;
			}

			if (terminal.getCincoG() == 0 || terminal.getCincoG() == 1) {

				pStmt.setInt(9, terminal.getCincoG());

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
	 * Función que modifica un campo del terminal con el id introducido
	 * 
	 * @param id
	 * @return int en función de si hay error o no
	 */
	public static int modificarTerminal(int id) {

		// int para el resultado, Strings para el nombre de campo a modificar y el nuevo
		// valor a introducir, Scanner
		int resultado = 0;
		String nombreCampo = "", nuevoValorString = "";
		Scanner teclado = new Scanner(System.in);

		// Nos conectamos a la base de datos gracias a conectarBD()
		Connection con = ConexionBDExamen.conectarBD();

		// String query con la consulta a ejecutar
		String query = "SELECT * from phones where idphones = ?";

		// Intentamos
		try {

			// PreparedStatement pStmt con query como referencia gracias a con
			PreparedStatement pStmt = con.prepareStatement(query);

			// Asignamos id al primer ? del pStmt
			pStmt.setInt(1, id);

			ResultSet res = pStmt.executeQuery();

			// Pasamos al siguiente elemento de res
			res.next();

			// Expresamos datos del terminal
			System.out.println("\nDatos del terminal: ");
			System.out.println("Id del terminal: " + res.getString("idphones"));
			System.out.println("Brand del terminal: " + res.getString("brand"));
			System.out.println("Model del terminal: " + res.getString("model"));
			System.out.println("Ram del terminal: " + res.getInt("ram"));
			System.out.println("Rom del terminal: " + res.getInt("rom"));
			System.out.println("Inches del terminal: " + res.getString("inches"));
			System.out.println("Os del terminal: " + res.getString("os"));
			System.out.println("Price del terminal: " + res.getInt("price"));
			System.out.println("5g del terminal: " + res.getInt("5g"));

			// Leemos el campo a modificar
			System.out.println("\n¿Qué campo desea modificar?: ");
			nombreCampo = teclado.next();

			// nuevo String con la consulta de update
			String query2 = "UPDATE phones SET ";

			// Preguntamos el nuevo valor
			System.out.println("\n¿Qué valor desea ponerle a este campo?:");

			// Dependiendo de nombreCampo modificamos nuevoValorString
			switch (nombreCampo.toLowerCase()) {

			/*
			 * En cada caso se introduce el nuevo valor, se comprueba si el valor
			 * introducido es correcto y se añade al query2, si no, devolvemos resultado
			 */

			case "brand":

				nuevoValorString = teclado.next();

				if (nuevoValorString != null && !nuevoValorString.equals("")) {

					query2 += "brand = ?";

				} // Si no
				else {

					// Devolvemos resultado
					return resultado;
				}

				break;

			case "model":

				nuevoValorString = teclado.next();

				if (nuevoValorString != null && !nuevoValorString.equals("")) {

					query2 += "model = ?";

				} // Si no
				else {

					// Devolvemos resultado
					return resultado;
				}

				break;

			case "ram":

				nuevoValorString = teclado.next();

				if (Integer.parseInt(nuevoValorString) > 0) {

					query2 += "ram = ?";

				} // Si no
				else {

					// Devolvemos resultado
					return resultado;
				}

				break;

			case "rom":

				nuevoValorString = teclado.next();

				if (Integer.parseInt(nuevoValorString) > 0) {

					query2 += "rom = ?";

				} // Si no
				else {

					// Devolvemos resultado
					return resultado;
				}

				break;

			case "inches":

				nuevoValorString = teclado.next();

				if (nuevoValorString != null && !nuevoValorString.equals("")) {

					query2 += "inches = ?";

				} // Si no
				else {

					// Devolvemos resultado
					return resultado;
				}

				break;

			case "os":

				nuevoValorString = teclado.next();

				if (nuevoValorString != null && !nuevoValorString.equals("")) {

					query2 += "os = ?";

				} // Si no
				else {

					// Devolvemos resultado
					return resultado;
				}

				break;

			case "price":

				nuevoValorString = teclado.next();

				if (Integer.parseInt(nuevoValorString) > 0) {

					query2 += "price = ?";

				} // Si no
				else {

					// Devolvemos resultado
					return resultado;
				}

				break;

			case "5g":

				nuevoValorString = teclado.next();

				// En este caso, dependiendo del valor de nuevoValorString lo modificamos a 1 o
				// a 0
				if (nuevoValorString.toLowerCase().equals("s")) {
					nuevoValorString = "1";
				} else {
					nuevoValorString = "0";
				}

				if (Integer.parseInt(nuevoValorString) == 0 || Integer.parseInt(nuevoValorString) == 1) {

					query2 += "5g = ?";

				} // Si no
				else {

					// Devolvemos resultado
					return resultado;
				}

				break;
			}

			// Juntamos query2 con el WHERE y el id
			query2 = query2.concat(" WHERE idphones = ?");

			// pStmt pasa a tener query2 como referencia
			pStmt = con.prepareStatement(query2);

			// Asignamos valores a las posiciones 1 y 2 del pStmt
			pStmt.setString(1, nuevoValorString);
			pStmt.setInt(2, id);

			resultado = pStmt.executeUpdate();

			// Cerramos todo
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

	/**
	 * Función que muestra terminales ordenados por nombre desc
	 */
	public static void mostrarOrdenadosNombre() {

		// Nos conectamos a la base de datos
		Connection con = ConexionBDExamen.conectarBD();

		// query con la consulta
		String query = "SELECT * from phones order by model DESC";

		try {
			PreparedStatement pStmt = con.prepareStatement(query);

			ResultSet res = pStmt.executeQuery();

			// Expresamos los datos
			System.out.println("\nTerminales y sus datos, ordenados por nombre desc: \n");

			while (res.next()) {

				System.out.println(
						res.getString("idphones") + ", " + res.getString("brand") + ", " + res.getString("model") + ", "
								+ res.getInt("ram") + ", " + res.getInt("rom") + ", " + res.getString("inches") + ", "
								+ res.getString("os") + ", " + res.getInt("price") + ", " + res.getInt("5g"));

			}

			// Cerramos todo
			pStmt.close();
			res.close();
			con.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Función que muestra terminales ordenados por precio desc
	 */
	public static void mostrarOrdenadosPrecio() {

		// Nos conectamos a la base de datos
		Connection con = ConexionBDExamen.conectarBD();

		// query con la consulta
		String query = "SELECT * from phones order by price DESC";

		try {
			PreparedStatement pStmt = con.prepareStatement(query);

			ResultSet res = pStmt.executeQuery();

			// Expresamos los datos
			System.out.println("\nTerminales y sus datos, ordenados por precio desc: \n");

			// Mientras res contenga elementos
			while (res.next()) {

				System.out.println(
						res.getString("idphones") + ", " + res.getString("brand") + ", " + res.getString("model") + ", "
								+ res.getInt("ram") + ", " + res.getInt("rom") + ", " + res.getString("inches") + ", "
								+ res.getString("os") + ", " + res.getInt("price") + ", " + res.getInt("5g"));

			}

			// Cerramos todo
			pStmt.close();
			res.close();
			con.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Función que muestra terminales con la marca especificada
	 * 
	 * @param brand
	 */
	public static void mostrarMarca(String brand) {

		// Nos conectamos a la base de datos
		Connection con = ConexionBDExamen.conectarBD();

		// query con la consulta
		String query = "SELECT * from phones WHERE brand = ?";

		try {
			PreparedStatement pStmt = con.prepareStatement(query);

			pStmt.setString(1, brand.toLowerCase());

			ResultSet res = pStmt.executeQuery();

			// Expresamos los datos
			System.out.println("\nTerminales de la marca " + brand + " y sus datos:\n");

			while (res.next()) {

				System.out.println(
						res.getString("idphones") + ", " + res.getString("brand") + ", " + res.getString("model") + ", "
								+ res.getInt("ram") + ", " + res.getInt("rom") + ", " + res.getString("inches") + ", "
								+ res.getString("os") + ", " + res.getInt("price") + ", " + res.getInt("5g"));

			}

			// Cerramos todo
			pStmt.close();
			res.close();
			con.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Función que elimina el terminal con el id introducido
	 * 
	 * @param id
	 * @return int en función de si hay error o no
	 */
	public static int eliminarTerminal(int id) {
		int resultado = 0;

		// Nos conectamos a la base de datos gracias a conectarBD()
		Connection con = ConexionBDExamen.conectarBD();

		// String query con la consulta a ejecutar
		String query = "DELETE from phones WHERE idphones = ?";

		// Intentamos
		try {

			// PreparedStatement pStmt con query como referencia gracias a con
			PreparedStatement pStmt = con.prepareStatement(query);

			// Asignamos id al primer ? del pStmt
			pStmt.setInt(1, id);

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

}
