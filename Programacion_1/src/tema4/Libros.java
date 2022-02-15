package tema4;

public class Libros {

	// Definimos las constantes estáticas públicas de la clase Libros
	public static final int AVENTURAS = 0;
	public static final int THRILLER = 1;
	public static final int EDUCATIVOS = 2;
	public static final int AUTOAYUDA = 3;
	public static final int DEPORTES = 4;

	// Definimos los atributos privados de la clase Libros
	private String nombre;
	private String autor;
	private int categoria;
	private int ejemplaresVendidos;
	private int numPaginas;
	private boolean prestado;
	private int diaPrestamo;
	private int anioPublicacion;
	private String isbn;

	// Definimos un constructor de la clase Libros que recibe valores de todas las
	// variables miembro
	public Libros(String nombre, String autor, int categoria, int ejemplaresVendidos, int numPaginas, boolean prestado,
			int diaPrestamo, int anioPublicacion, String isbn) {
		super();
		this.nombre = nombre;
		this.autor = autor;
		this.categoria = categoria;
		this.ejemplaresVendidos = ejemplaresVendidos;
		this.numPaginas = numPaginas;
		this.prestado = prestado;
		this.diaPrestamo = diaPrestamo;
		this.anioPublicacion = anioPublicacion;
		this.isbn = isbn;
	}

	// Definimos un constructor de la clase Libros que recibe valores de las
	// variables nombre e isbn, e inicializamos
	// las demás
	public Libros(String nombre, String isbn) {
		super();
		this.nombre = nombre;
		this.isbn = isbn;
		this.autor = "";
		this.categoria = 0;
		this.ejemplaresVendidos = 0;
		this.numPaginas = 0;
		this.prestado = false;
		this.diaPrestamo = 0;
		this.anioPublicacion = 0;
	}

	// Definimos un constructor de la clase Libros que no recibe ningún atributo
	// pero inicializa todas las variables miembro
	public Libros() {
		super();
		this.nombre = "";
		this.autor = "";
		this.categoria = 0;
		this.ejemplaresVendidos = 0;
		this.numPaginas = 0;
		this.prestado = false;
		this.diaPrestamo = 0;
		this.anioPublicacion = 0;
		this.isbn = "";
	}

	/**
	 * Una función que recibe un int dia y comprueba si el objeto está prestado o
	 * no, si no devuelve false, si sí devuelve true y modifica el valor de
	 * diaPrestamo
	 * 
	 * @param dia
	 * @return true o false dependiendo de si el libro está prestado o no
	 */
	public boolean prestar(int dia) {
		// Si prestado es igual a true
		if (this.prestado == true) {

			// Devolvemos false
			return false;

		} // Si no
		else {
			// prestado pasa a valer true
			this.prestado = true;

			// diaPrestamo pasa a valer dia
			this.diaPrestamo = dia;

			// Devolvemos true
			return true;
		}
	}

	/**
	 * Una función que comprueba si el libro está prestado o no, si no devuelve
	 * false, si sí devuelve true y modifica algunas variables de este
	 * 
	 * @return true o false dependiendo de si el libro está prestado o no
	 */
	public boolean devolver() {
		// Si prestado es igual a false
		if (this.prestado == false) {

			// Devolvemos false
			return false;

		} // Si no
		else {
			// diaPrestamo pasa a valer 0
			this.diaPrestamo = 0;

			// prestado pasa a ser true
			this.prestado = true;

			// Devolvemos true
			return true;
		}
	}

	/*
	 * A continuación se encuentran todos los getters y setters de las variables
	 * miembro, excepto el set de la variable isbn que no se pide
	 */

	// nombre
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// autor
	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	// categoria
	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

	// ejemplaresVendidos
	public int getEjemplaresVendidos() {
		return ejemplaresVendidos;
	}

	public void setEjemplaresVendidos(int ejemplaresVendidos) {
		this.ejemplaresVendidos = ejemplaresVendidos;
	}

	// numPaginas
	public int getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}

	// prestado
	public boolean isPrestado() {
		return prestado;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}

	// diaPrestamo
	public int getDiaPrestamo() {
		return diaPrestamo;
	}

	public void setDiaPrestamo(int diaPrestamo) {
		this.diaPrestamo = diaPrestamo;
	}

	// anioPublicacion
	public int getAnioPublicacion() {
		return anioPublicacion;
	}

	public void setAnioPublicacion(int anioPublicacion) {
		this.anioPublicacion = anioPublicacion;
	}

	// isbn
	public String getIsbn() {
		return isbn;
	}

}
