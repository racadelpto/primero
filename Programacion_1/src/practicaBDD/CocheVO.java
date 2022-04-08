package practicaBDD;

public class CocheVO {

	//Declaramos los atributos privados de la clase CocheVO
	private String idCoche;
	private String marca;
	private String modelo;
	private int peso;
	private int potencia;
	private String idPiloto;
	
	//Constructor que recibe datos de todos los atributos y se los asigna al objeto que crea de la clase CocheVO
	public CocheVO(String idCoche, String marca, String modelo, int peso, int potencia, String idPiloto) {
		super();
		this.idCoche = idCoche;
		this.marca = marca;
		this.modelo = modelo;
		this.peso = peso;
		this.potencia = potencia;
		this.idPiloto = idPiloto;
	}

	//Constructor que no recibe ningún atributo pero inicializa un objeto de la clase CocheVO
	public CocheVO() {
		super();
	}

	/*
	 * Getters y Setters de los atributos de la clase CocheVO
	 */
	
	//idCoche
	public String getIdCoche() {
		return idCoche;
	}

	public void setIdCoche(String idCoche) {
		this.idCoche = idCoche;
	}

	//marca
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	//modelo
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	//peso
	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	//potencia
	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	//idPiloto
	public String getIdPiloto() {
		return idPiloto;
	}

	public void setIdPiloto(String idPiloto) {
		this.idPiloto = idPiloto;
	}
	
	
	
}
