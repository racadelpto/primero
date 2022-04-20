package practicaBDD;

/**
 * Clase CircuitoVO
 * 
 * @author rhdie
 *
 */
public class CircuitoVO {

	// Declaramos los atributos privados de la clase CircuitoVO
	private String idCircuito;
	private String nombre;
	private String ciudad;
	private String pais;
	private int longitud;
	private double recordVuelta;
	private int numCurvas;

	// Constructor que recibe datos de todos los atributos y se los asigna al objeto
	// que crea de la clase CircuitoVO
	public CircuitoVO(String idCircuito, String nombre, String ciudad, String pais, int longitud, double recordVuelta,
			int numCurvas) {
		super();
		this.idCircuito = idCircuito;
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.pais = pais;
		this.longitud = longitud;
		this.recordVuelta = recordVuelta;
		this.numCurvas = numCurvas;
	}

	// Constructor que no recibe ningún atributo pero inicializa un objeto de la
	// clase CircuitoVO
	public CircuitoVO() {
		super();
	}

	/*
	 * Getters y Setters de los atributos de la clase CircuitoVO
	 */

	// idCircuito
	public String getIdCircuito() {
		return idCircuito;
	}

	public void setIdCircuito(String idCircuito) {
		this.idCircuito = idCircuito;
	}

	// nombre
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// ciudad
	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	// pais
	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	// longitud
	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	// recordVuelta
	public double getRecordVuelta() {
		return recordVuelta;
	}

	public void setRecordVuelta(double recordVuelta) {
		this.recordVuelta = recordVuelta;
	}

	// numCurvas
	public int getNumCurvas() {
		return numCurvas;
	}

	public void setNumCurvas(int numCurvas) {
		this.numCurvas = numCurvas;
	}

}
