package practicaBDD;

public class CircuitoVO {

	private String idCircuito;
	private String nombre;
	private String ciudad;
	private String pais;
	private int longitud;
	private double recordVuelta;
	private int numCurvas;
	
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

	public CircuitoVO() {
		super();
	}

	
	public String getIdCircuito() {
		return idCircuito;
	}

	public void setIdCircuito(String idCircuito) {
		this.idCircuito = idCircuito;
	}

	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	
	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	
	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	
	public double getRecordVuelta() {
		return recordVuelta;
	}

	public void setRecordVuelta(double recordVuelta) {
		this.recordVuelta = recordVuelta;
	}


	public int getNumCurvas() {
		return numCurvas;
	}

	public void setNumCurvas(int numCurvas) {
		this.numCurvas = numCurvas;
	}
	
	
}
