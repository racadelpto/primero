package practicaBDD;

/**
 * Clase PilotoVO
 * 
 * @author rhdie
 *
 */
public class PilotoVO {

	// Declaramos los atributos privados de la clase PilotoVO
	private String idPiloto;
	private String dNI;
	private String nombre;
	private int edad;
	private String sexo;
	private String direccion;
	private CocheVO coche;

	// Constructor que recibe datos de todos los atributos y se los asigna al objeto
	// que crea de la clase PilotoVO
	public PilotoVO(String idPiloto, String dNI, String nombre, int edad, String sexo, String direccion,
			CocheVO coche) {
		super();
		this.idPiloto = idPiloto;
		this.dNI = dNI;
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.direccion = direccion;
		this.coche = coche;
	}

	// Constructor que no recibe ningún atributo pero inicializa un objeto de la
	// clase PilotoVO
	public PilotoVO() {
		super();
	}

	/*
	 * Getters y Setters de los atributos de la clase PilotoVO
	 */

	// idPiloto
	public String getIdPiloto() {
		return idPiloto;
	}

	public void setIdPiloto(String idPiloto) {
		this.idPiloto = idPiloto;
	}

	// dNI
	public String getdNI() {
		return dNI;
	}

	public void setdNI(String dNI) {
		this.dNI = dNI;
	}

	// nombre
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// edad
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	// sexo
	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	// direccion
	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	// coche
	public CocheVO getCoche() {
		return coche;
	}

	public void setCoche(CocheVO coche) {
		this.coche = coche;
	}

}
