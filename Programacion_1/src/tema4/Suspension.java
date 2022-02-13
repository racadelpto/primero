package tema4;

public class Suspension {

	// Atributos privados de la clase Suspension
	// El atributo lugarSuspension lo he creado yo exclusivamente para una vez
	// ejecutemos el toString
	// de nuestro objeto Coche, podamos diferenciar las 4 suspensiones gracias a
	// este atributo que indica
	// el lugar de estas en el coche
	private String marca;
	private String lugarSuspension;
	private int dureza;
	private int carga;
	private int compresion;

	// Constructor de la clase Suspension que recibe todos los valores
	public Suspension(String marca, String lugarSuspension, int dureza, int carga, int compresion) {
		super();
		this.marca = marca;
		this.lugarSuspension = lugarSuspension;
		this.dureza = dureza;
		this.carga = carga;
		this.compresion = compresion;
	}

	// Constructor de la clase Suspension que inicializa os valores
	Suspension() {
		this.marca = "TRW";
		this.lugarSuspension = "";
		this.dureza = 34;
		this.carga = 25;
		this.compresion = 23;
	}

	/*
	 * Todos las funciones get y set de cada atributo privado para que podamos
	 * acceder a ellos desde fuera de la clase Suspension
	 */

	// lugarSuspension
	public String getlugarSuspension() {
		return lugarSuspension;
	}

	public void setlugarSuspension(String lugarSuspension) {
		this.lugarSuspension = lugarSuspension;
	}

	// Marca
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	// Dureza
	public int getDureza() {
		return dureza;
	}

	public void setDureza(int dureza) {
		this.dureza = dureza;
	}

	// Carga
	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}

	// Compresion
	public int getCompresion() {
		return compresion;
	}

	public void setCompresion(int compresion) {
		this.compresion = compresion;
	}

	@Override
	public String toString() {
		return "Suspension" + lugarSuspension + "[marca=" + marca + ", dureza=" + dureza + ", carga=" + carga
				+ ", compresion=" + compresion + "]";
	}

}
