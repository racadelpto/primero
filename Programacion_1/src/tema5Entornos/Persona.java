package tema5Entornos;

public class Persona {

	private String nombre = "";
	private char genero = ' ';
	private String direccion = "";
	private int edad = 0;

	public Persona() {
		super();
	}

	public Persona(String nombre, char genero, String direccion, int edad) {
		super();
		this.nombre = nombre;
		this.genero = genero;
		this.direccion = direccion;
		this.edad = edad;
	}

	public int calculoRetenciones() {

		switch (genero) {

		case 'H':
			if (edad >= 35) {
				return 19;
			} else {
				return 14;
			}

		case 'M':
			if (edad >= 35) {
				return 17;
			} else {
				return 12;
			}

		default:
			return -1;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDirección(String direccion) {
		this.direccion = direccion;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

}
