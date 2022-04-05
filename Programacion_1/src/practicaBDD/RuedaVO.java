package practicaBDD;

public class RuedaVO {

	private String idRueda;
	private String marca;
	private String modelo;
	private String dimensiones;
	private int peso;
	private String componente;
	private String estado;
	private String fecha;
	private String sesion;
	private String idCoche;
	
	public RuedaVO(String idRueda, String marca, String modelo, String dimensiones, int peso, String componente,
			String estado, String fecha, String sesion, String idCoche) {
		super();
		this.idRueda = idRueda;
		this.marca = marca;
		this.modelo = modelo;
		this.dimensiones = dimensiones;
		this.peso = peso;
		this.componente = componente;
		this.estado = estado;
		this.fecha = fecha;
		this.sesion = sesion;
		this.idCoche = idCoche;
	}

	public RuedaVO() {
		super();
	}

	
	public String getIdRueda() {
		return idRueda;
	}

	public void setIdRueda(String idRueda) {
		this.idRueda = idRueda;
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

	
	public String getDimensiones() {
		return dimensiones;
	}

	public void setDimensiones(String dimensiones) {
		this.dimensiones = dimensiones;
	}

	
	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	
	public String getComponente() {
		return componente;
	}

	public void setComponente(String componente) {
		this.componente = componente;
	}

	
	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	
	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	
	public String getSesion() {
		return sesion;
	}

	public void setSesion(String sesion) {
		this.sesion = sesion;
	}

	
	public String getIdCoche() {
		return idCoche;
	}

	public void setIdCoche(String idCoche) {
		this.idCoche = idCoche;
	}
	
	
}
