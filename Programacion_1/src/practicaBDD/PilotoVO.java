package practicaBDD;

public class PilotoVO {

	private String idPiloto;
	private String dNI;
	private String nombre;
	private int edad;
	private String sexo;
	private String direccion;
	private CocheVO coche;
	
	public PilotoVO(String idPiloto, String dNI, String nombre, int edad, String sexo, String direccion, CocheVO coche) {
		super();
		this.idPiloto = idPiloto;
		this.dNI = dNI;
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.direccion = direccion;
		this.coche = coche;
	}

	public PilotoVO() {
		super();
	}

	
	public String getIdPiloto() {
		return idPiloto;
	}

	public void setIdPiloto(String idPiloto) {
		this.idPiloto = idPiloto;
	}

	
	public String getdNI() {
		return dNI;
	}

	public void setdNI(String dNI) {
		this.dNI = dNI;
	}

	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	
	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	
	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	
	public CocheVO getCoche() {
		return coche;
	}

	public void setCoche(CocheVO coche) {
		this.coche = coche;
	}
	
	
	
}
