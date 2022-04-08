package practicaBDD;

public class CarreraVO {

	//Declaramos los atributos privados de la clase CarreraVO
	private String idCarrera;
	private int numVueltas;
	private double vueltaRapida;
	private int numAccidentes;
	private String fecha;
	private String idCircuito;
	private String idCampeonato;
	
	//Constructor que recibe datos de todos los atributos y se los asigna al objeto que crea de la clase CarreraVO
	public CarreraVO(String idCarrera, int numVueltas, double vueltaRapida, int numAccidentes, String fecha,
			String idCircuito, String idCampeonato) {
		super();
		this.idCarrera = idCarrera;
		this.numVueltas = numVueltas;
		this.vueltaRapida = vueltaRapida;
		this.numAccidentes = numAccidentes;
		this.fecha = fecha;
		this.idCircuito = idCircuito;
		this.idCampeonato = idCampeonato;
	}

	//Constructor que no recibe ningún atributo pero inicializa un objeto de la clase CarreraVO
	public CarreraVO() {
		super();
	}

	/*
	 * Getters y Setters de los atributos de la clase CarreraVO
	 */
	
	//idCarrera
	public String getIdCarrera() {
		return idCarrera;
	}

	public void setIdCarrera(String idCarrera) {
		this.idCarrera = idCarrera;
	}

	//numVueltas
	public int getNumVueltas() {
		return numVueltas;
	}

	public void setNumVueltas(int numVueltas) {
		this.numVueltas = numVueltas;
	}

	//vueltaRapida
	public double getVueltaRapida() {
		return vueltaRapida;
	}

	public void setVueltaRapida(double vueltaRapida) {
		this.vueltaRapida = vueltaRapida;
	}

	//numAccidentes
	public int getNumAccidentes() {
		return numAccidentes;
	}

	public void setNumAccidentes(int numAccidentes) {
		this.numAccidentes = numAccidentes;
	}

	//fecha
	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	//idCircuito
	public String getIdCircuito() {
		return idCircuito;
	}

	public void setIdCircuito(String idCircuito) {
		this.idCircuito = idCircuito;
	}

	//idCampeonato
	public String getIdCampeonato() {
		return idCampeonato;
	}

	public void setIdCampeonato(String idCampeonato) {
		this.idCampeonato = idCampeonato;
	}
	
	
	
}
