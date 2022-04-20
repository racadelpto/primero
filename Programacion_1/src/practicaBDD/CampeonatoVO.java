package practicaBDD;

/**
 * Clase CampeonatoVO
 * 
 * @author rhdie
 *
 */
public class CampeonatoVO {

	// Declaramos los atributos privados de la clase CampeonatoVO
	private String idCampeonato;
	private String nombre;
	private int year;
	private int numPilotos;
	private int numCircuitos;
	private String pilotoGanador;

	// Constructor que recibe datos de todos los atributos y se los asigna al objeto
	// que crea de la clase CampeonatoVO
	public CampeonatoVO(String idCampeonato, String nombre, int year, int numPilotos, int numCircuitos,
			String pilotoGanador) {
		super();
		this.idCampeonato = idCampeonato;
		this.nombre = nombre;
		this.year = year;
		this.numPilotos = numPilotos;
		this.numCircuitos = numCircuitos;
		this.pilotoGanador = pilotoGanador;
	}

	// Constructor que no recibe ningún atributo pero inicializa un objeto de la
	// clase CampeonatoVO
	public CampeonatoVO() {
		super();
	}

	/*
	 * Getters y Setters de los atributos de la clase CampeonatoVO
	 */

	// idCampeonato
	public String getIdCampeonato() {
		return idCampeonato;
	}

	public void setIdCampeonato(String idCampeonato) {
		this.idCampeonato = idCampeonato;
	}

	// nombre
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// year
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	// numPilotos
	public int getNumPilotos() {
		return numPilotos;
	}

	public void setNumPilotos(int numPilotos) {
		this.numPilotos = numPilotos;
	}

	// numCircuitos
	public int getNumCircuitos() {
		return numCircuitos;
	}

	public void setNumCircuitos(int numCircuitos) {
		this.numCircuitos = numCircuitos;
	}

	// pilotoGanador
	public String getPilotoGanador() {
		return pilotoGanador;
	}

	public void setPilotoGanador(String pilotoGanador) {
		this.pilotoGanador = pilotoGanador;
	}

}
