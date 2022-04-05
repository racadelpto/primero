package practicaBDD;

public class CarreraVO {

	private String idCarrera;
	private int numVueltas;
	private double vueltaRapida;
	private int numAccidentes;
	private String fecha;
	private String idCircuito;
	private String idCampeonato;
	
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

	public CarreraVO() {
		super();
	}

	
	public String getIdCarrera() {
		return idCarrera;
	}

	public void setIdCarrera(String idCarrera) {
		this.idCarrera = idCarrera;
	}

	
	public int getNumVueltas() {
		return numVueltas;
	}

	public void setNumVueltas(int numVueltas) {
		this.numVueltas = numVueltas;
	}

	
	public double getVueltaRapida() {
		return vueltaRapida;
	}

	public void setVueltaRapida(double vueltaRapida) {
		this.vueltaRapida = vueltaRapida;
	}

	
	public int getNumAccidentes() {
		return numAccidentes;
	}

	public void setNumAccidentes(int numAccidentes) {
		this.numAccidentes = numAccidentes;
	}

	
	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	
	public String getIdCircuito() {
		return idCircuito;
	}

	public void setIdCircuito(String idCircuito) {
		this.idCircuito = idCircuito;
	}

	
	public String getIdCampeonato() {
		return idCampeonato;
	}

	public void setIdCampeonato(String idCampeonato) {
		this.idCampeonato = idCampeonato;
	}
	
	
	
}
