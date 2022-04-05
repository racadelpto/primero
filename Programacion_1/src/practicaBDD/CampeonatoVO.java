package practicaBDD;

public class CampeonatoVO {

	private String idCampeonato;
	private String nombre;
	private int year;
	private int numPilotos;
	private int numCircuitos;
	private String pilotoGanador;
	
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

	public CampeonatoVO() {
		super();
	}

	
	public String getIdCampeonato() {
		return idCampeonato;
	}

	public void setIdCampeonato(String idCampeonato) {
		this.idCampeonato = idCampeonato;
	}

	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	
	public int getNumPilotos() {
		return numPilotos;
	}

	public void setNumPilotos(int numPilotos) {
		this.numPilotos = numPilotos;
	}

	
	public int getNumCircuitos() {
		return numCircuitos;
	}

	public void setNumCircuitos(int numCircuitos) {
		this.numCircuitos = numCircuitos;
	}

	
	public String getPilotoGanador() {
		return pilotoGanador;
	}

	public void setPilotoGanador(String pilotoGanador) {
		this.pilotoGanador = pilotoGanador;
	}
	
	
	
	
	
	
	
}
