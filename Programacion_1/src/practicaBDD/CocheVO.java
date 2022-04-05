package practicaBDD;

public class CocheVO {

	private String idCoche;
	private String marca;
	private String modelo;
	private int peso;
	private int potencia;
	private String idPiloto;
	
	public CocheVO(String idCoche, String marca, String modelo, int peso, int potencia, String idPiloto) {
		super();
		this.idCoche = idCoche;
		this.marca = marca;
		this.modelo = modelo;
		this.peso = peso;
		this.potencia = potencia;
		this.idPiloto = idPiloto;
	}

	public CocheVO() {
		super();
	}

	
	public String getIdCoche() {
		return idCoche;
	}

	public void setIdCoche(String idCoche) {
		this.idCoche = idCoche;
	}

	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	
	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	
	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	
	public String getIdPiloto() {
		return idPiloto;
	}

	public void setIdPiloto(String idPiloto) {
		this.idPiloto = idPiloto;
	}
	
	
	
}
