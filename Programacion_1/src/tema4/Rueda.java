package tema4;

public class Rueda {

	// Atributos privados de la clase Rueda
	// El atributo lugarRueda lo he creado yo exclusivamente para una vez ejecutemos
	// el toString
	// de nuestro objeto Coche, podamos diferenciar las 4 ruedas gracias a este
	// atributo que indica
	// el lugar de estas en el coche
	private String lugarRueda;
	private String marca;
	private int radio;
	private int perfil;
	private String tipo;
	private int desgaste;
	private int presion;
	private int precio;

	// Constructor de la clase Rueda que recibe todos los valores
	public Rueda(String lugarRueda, String marca, int radio, int perfil, String tipo, int desgaste, int presion,
			int precio) {
		super();
		this.lugarRueda = lugarRueda;
		this.marca = marca;
		this.radio = radio;
		this.perfil = perfil;
		this.tipo = tipo;
		this.desgaste = desgaste;
		this.presion = presion;
		this.precio = precio;
	}

	// Constructor de la clase Rueda que inicializa los valores
	Rueda() {
		this.lugarRueda = "";
		this.marca = "Pirelli";
		this.radio = 36;
		this.perfil = 310;
		this.tipo = "Slick";
		this.desgaste = 0;
		this.presion = 100;
		this.precio = 170;
	}

	/*
	 * Todos las funciones get y set de cada atributo privado para que podamos
	 * acceder a ellos desde fuera de la clase Rueda
	 */

	// LugarRueda
	public String getlugarRueda() {
		return lugarRueda;
	}

	public void setlugarRueda(String lugarRueda) {
		this.lugarRueda = lugarRueda;
	}

	// Marca
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	// Radio
	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}

	// Perfil
	public int getPerfil() {
		return perfil;
	}

	public void setPerfil(int perfil) {
		this.perfil = perfil;
	}

	// Tipo
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	// Desgaste
	public int getDesgaste() {
		return desgaste;
	}

	public void setDesgaste(int desgaste) {
		this.desgaste = desgaste;
	}

	// Presion
	public int getPresion() {
		return presion;
	}

	public void setPresion(int presion) {
		this.presion = presion;
	}

	// Precio
	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	// toString de la clase Rueda
	@Override
	public String toString() {
		return "Rueda" + lugarRueda + "[marca=" + marca + ", radio=" + radio + ", perfil=" + perfil + ", tipo=" + tipo
				+ ", desgaste=" + desgaste + ", presion=" + presion + ", precio=" + precio + "]";
	}

}
