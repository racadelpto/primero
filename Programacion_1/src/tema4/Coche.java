package tema4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Coche {

	// Variables estáticas constantes de colores
	public static final String ROJO = "Rojo";
	public static final String AZUL = "Azul";
	public static final String VERDE = "Verde";
	public static final String MORADO = "Morado";
	public static final String AMARILLO = "Amarillo";

	public static final int DELANTERA_DERECHA = 0;
	public static final int DELANTERA_IZQUIERDA = 1;
	public static final int TRASERA_DERECHA = 2;
	public static final int TRASERA_IZQUIERDA = 3;

	// Variables estáticas constantes para la práctica de ficheros
	public static final int ERROR_FICHERO = -1;
	public static final int ERROR_ESCRITURA = -2;

	// Atributos privados de la clase Coche
	private int potencia;
	private String nombre;
	private String modelo;
	private String marca;
	private int peso;
	private String color;
	private int velocidad;

	// Definimos los arrays de ruedas y suspensiones a 4
	private Rueda ruedas[] = new Rueda[4];
	private Suspension suspensiones[] = new Suspension[4];

	// Constructor de la clase Coche que recibe todos los valores
	public Coche(int potencia, String nombre, String modelo, String marca, int peso, String color, int velocidad,
			Rueda[] ruedas, Suspension[] suspensiones) {
		super();
		this.potencia = potencia;
		this.nombre = nombre;
		this.modelo = modelo;
		this.marca = marca;
		this.peso = peso;
		this.color = color;
		this.velocidad = velocidad;
		this.ruedas = ruedas;
		this.suspensiones = suspensiones;
	}

	// Constructor de la clase Coche que inicializa los valores
	Coche() {
		this.potencia = 0;
		this.nombre = "";
		this.modelo = "";
		this.marca = "";
		this.peso = 0;
		this.color = "";
		this.velocidad = 0;
		this.ruedas = new Rueda[4];
		this.suspensiones = new Suspension[4];
	}

	/**
	 * La función incrementa el valor de velocidad del objeto sobre el que
	 * realicemos la función. Recibe un entero
	 * 
	 * @param num
	 */
	public void acelerar(int porcentaje) {
		// Sumamos a this.velocidad la multiplicación de esta por (porcentaje/100)
		this.velocidad += this.velocidad * (porcentaje / 100);
	}

	/**
	 * La función cambia el color y el nombre del objeto sobre el que realicemos la
	 * función. Recibe un String
	 * 
	 * @param color
	 */
	public void pintar(String color) {
		// Comprobamos que el color introducido sea igual a uno de los creados en
		// constantes
		if (color == ROJO || color == VERDE || color == AZUL || color == AMARILLO || color == MORADO) {
			// Cambiamos this.color a color
			this.color = color;

			// Le agregamos a this.nombre " " y color
			this.nombre = this.nombre + " " + color;
		} // Si no
		else {
			// Lo expresamos por pantalla
			System.out.println("El color introducido no corresponde a uno de los 5 definidos.");
		}
	}

	/**
	 * La función cambia la posición de la rueda introducida por la posicion
	 * introducida
	 * 
	 * @param posicion
	 * @param rueda
	 * @return true o false dependiendo de si se realiza correctamente
	 */
	public boolean cambiarRueda(int posicion, Rueda rueda) {
		// Si posicion es mayor o igual a 0 y menor de 4
		if (posicion >= 0 && posicion < 4) {
			// La rueda en la posicion introducida pasa a ser rueda
			this.ruedas[posicion] = rueda;
			// Devolvemos true
			return true;
		} // Si no
		else {
			// Devolvemos false
			return false;
		}
	}

	/**
	 * La función cambia la posición de la suspension introducida por la posición
	 * introducida
	 * 
	 * @param posicion
	 * @param suspension
	 * @return true o false dependiendo de si se realiza correctamente
	 */
	public boolean cambiarSuspension(int posicion, Suspension suspension) {
		// Si posicion es mayor o igual a 0 y menor de 4
		if (posicion >= 0 && posicion < 4) {
			// La suspension en la posicion introducida pasa a ser suspension
			this.suspensiones[posicion] = suspension;
			// Devolvemos true
			return true;
		} // Si no
		else {
			// Devolvemos false
			return false;
		}
	}

	/**
	 * La función modifica la presión de la rueda en la posición introducida
	 * sumándole o restándole la presion introducida
	 * 
	 * @param posicion
	 * @param presion
	 * @return true o false dependiendo de si se realiza correctamente
	 */
	public boolean ajustarPresion(int posicion, int presion) {
		// Si la posicion es mayor o igual a 0 y menor de 4 Y presion es menor de 100 y
		// mayor de 0
		if ((posicion >= 0 && posicion < 4) && (presion < 100 && presion > 0)) {

			// Declaramos un int nuevaPresion y en él sumamos la presion de la rueda en la
			// posición introducida
			// y la presion introducida
			int nuevaPresion = this.ruedas[posicion].getPresion() + presion;

			// Le asignamos la nuevaPresion a la rueda en la posición introducida
			this.ruedas[posicion].setPresion(nuevaPresion);

			// Devolvemos true
			return true;
		} // Si no
		else {
			// Devolvemos false
			return false;
		}
	}

	/*
	 * FUNCIONES EJERCICIOS DE FICHEROS
	 */

	/**
	 * Una función que escribe los datos de los coches del array recibido en el
	 * fichero indicado como parámetro
	 * 
	 * @param listaCoches
	 * @param ficheroDestino
	 * @return un número dependiendo de si ha funcionado correctamente o hay algún
	 *         error
	 */
	public int guardarCoches(Coche listaCoches[], String ficheroDestino) {

		// Intentamos el siguiente código
		try {
			// Creamos un objeto FileWriter con ficheroDestino como referencia de fichero
			FileWriter fw = new FileWriter(ficheroDestino);

			// Creamos un objeto PrintWriter con el objeto FileWriter como referencia
			PrintWriter pw = new PrintWriter(fw);

			// Usamos un for para ir guardando en un String los datos de los coches del
			// array de coches recibido
			for (int i = 0; i < listaCoches.length; i++) {
				// Vamos guardando los datos del coche en el String linea
				String linea = listaCoches[i].nombre + ", " + listaCoches[i].modelo + ", " + listaCoches[i].marca + ", "
						+ listaCoches[i].peso + ", " + listaCoches[i].potencia + ", " + listaCoches[i].color + ", "
						+ listaCoches[i].velocidad;

				// Imprimimos linea en el fichero recibido gracias al objeto PrintWriter
				pw.println(linea);
			}

			// Cerramos los objetos fw y pw
			fw.close();
			pw.close();
			
		} // Si da el error FileNotFoundException
		catch (FileNotFoundException e) {
			// Se comunica el error
			e.printStackTrace();

			// Devolvemos ERROR_FICHERO
			return ERROR_FICHERO;
		} // Si da el error IOException
		catch (IOException ioe) {
			// Se comunica el error
			ioe.printStackTrace();

			// Devolvemos ERROR_ESCRITURA
			return ERROR_ESCRITURA;
		}

		// Devolvemos 0 si llegamos hasta aquí
		return 0;

	}

	/**
	 * Una función que recibe un fichero como parámetro y cuenta las líneas que
	 * este tiene
	 * 
	 * @param fichero
	 * @return el número de líneas que tenga o error en el caso que lo haya
	 */
	public int contarLineas(String fichero) {
		// Creamos un objeto File con el fichero como referencia
		File ficheroALeer = new File(fichero);

		// Creamos un int cantidadLineas para ir almacenando el número de líneas
		int cantidadLineas = 0;

		// Intentamos el siguiente código
		try {
			// Creamos un objeto FileReader con ficheroALeer como referencia
			FileReader fr = new FileReader(ficheroALeer);

			// Creamos un objeto BufferedReader con el objeto FileReader como referencia
			BufferedReader br = new BufferedReader(fr);

			// Creamos un String linea que almacene la linea que lee el br
			String linea = br.readLine();

			// Mientras linea sea diferente de null
			while (linea != null) {

				// Vamos sumando 1 a cantidadLineas
				cantidadLineas++;

				// linea pasa a ser la siguiente linea leida por br
				linea = br.readLine();
			}

			// Cerramos fr y br
			fr.close();
			br.close();
			
		} // Si da el error FileNotFoundException
		catch (FileNotFoundException e) {
			// Se comunica el error
			e.printStackTrace();

			// Devolvemos ERROR_FICHERO
			return ERROR_FICHERO;
		} // Si da el error IOException
		catch (IOException ioe) {
			// Se comunica el error
			ioe.printStackTrace();

			// Devolvemos ERROR_ESCRITURA
			return ERROR_ESCRITURA;
		}

		// Devolvemos cantidadLineas
		return cantidadLineas;
	}

	/**
	 * Una función que va leyendo un fichero recibido como parámetro y va
	 * almacenando los datos de cada línea en un objeto Coche
	 * 
	 * @param rutaFichero
	 * @return un array de Coche con todos los objetos Coche con los datos leídos
	 */
	public Coche[] cargarCoches(String rutaFichero) {
		// Creamos un objeto File con rutaFichero como referencia
		File ficheroALeer = new File(rutaFichero);

		// Intentamos el siguiente código
		try {
			// Creamos un objeto FileReader con ficheroALeer como referencia
			FileReader fr = new FileReader(ficheroALeer);

			// Creamos un objeto BufferedReader con el objeto FileReader como referencia
			BufferedReader br = new BufferedReader(fr);

			// Creamos una String linea que almacena la linea que lee el br
			String linea = br.readLine();

			// Creamos un int cantidadCoches y lo inicializamos a 0
			int cantidadCoches = 0;

			// Mientras linea sea diferente de null
			while (linea != null) {
				// Vamos sumando 1 a cantidadCoches
				cantidadCoches++;

				// linea pasa a ser la siguiente linea leída por br
				linea = br.readLine();
			}

			// Creamos un array de Coche con cantidadCoches como tamaño
			Coche[] arrayCoches = new Coche[cantidadCoches];

			// Definimos de nuevo el objeto FileReader para resetear el fichero y empezar
			// desde el principio
			fr = new FileReader(ficheroALeer);

			// Hacemos lo mismo con el BufferedReader
			br = new BufferedReader(fr);

			// Almacenamos en linea la linea leída por el br
			linea = br.readLine();

			// Creamos un int contador y lo inicializamos a 0
			int contador = 0;

			// Mientras linea sea diferente de null
			while (linea != null) {

				// Creamos un StringTokenizer separador con linea como referencia
				StringTokenizer separador = new StringTokenizer(linea);

				// Mientras separador tenga más elementos que leer
				while (separador.hasMoreTokens()) {
					// Primero inicializamos el objeto Coche del arrayCoches en la posición contador
					arrayCoches[contador] = new Coche();

					// Le vamos asignando las variables en orden
					// Se especifica ", " como espacio entre cada elemento
					arrayCoches[contador].setNombre(separador.nextToken(", "));
					arrayCoches[contador].setModelo(separador.nextToken(", "));
					arrayCoches[contador].setMarca(separador.nextToken(", "));
					arrayCoches[contador].setPeso(Integer.parseInt(separador.nextToken(", ")));
					arrayCoches[contador].setPotencia(Integer.parseInt(separador.nextToken(", ")));
					arrayCoches[contador].setColor(separador.nextToken(", "));
					arrayCoches[contador].setVelocidad(Integer.parseInt(separador.nextToken(", ")));

					// Sumamos 1 a contador
					contador++;
				}

				// linea pasa a ser la siguiente línea leída
				linea = br.readLine();
			}

			// Cerramos el fr y el br
			fr.close();
			br.close();

			// Devolvemos el arrayCoches
			return arrayCoches;

		} // Si da el error FileNotFoundException
		catch (FileNotFoundException e) {
			// Se comunica el error
			e.printStackTrace();

			// Devolvemos null
			return null;
		} // Si da el error IOException
		catch (IOException ioe) {
			// Se comunica el error
			ioe.printStackTrace();

			// Devolvemos null
			return null;
		}

	}

	/*
	 * Todos las funciones get y set de cada atributo privado para que podamos
	 * acceder a ellos desde fuera de la clase Coche
	 */

	// Potencia
	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	// Nombre
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// Modelo
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	// Marca
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	// Peso
	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	// Color
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	// Velocidad
	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	// Ruedas
	public Rueda[] getRuedas() {
		return ruedas;
	}

	public void setRuedas(Rueda[] ruedas) {
		this.ruedas = ruedas;
	}

	// Suspensiones
	public Suspension[] getSuspensiones() {
		return suspensiones;
	}

	public void setSuspensiones(Suspension[] suspensiones) {
		this.suspensiones = suspensiones;
	}

	// toString de la clase Coche
	@Override
	public String toString() {
		return "Coche [potencia=" + potencia + ", nombre=" + nombre + ", modelo=" + modelo + ", marca=" + marca
				+ ", peso=" + peso + ", color=" + color + ", velocidad=" + velocidad + ", ruedas="
				+ Arrays.toString(ruedas) + ", suspensiones=" + Arrays.toString(suspensiones) + "]";
	}

}
