package tema5Entornos;

public class Repartidor extends Persona {

	private String motoAsignada = "";
	private String turno = "";
	private boolean extraVelocidad = false;
	private double sueldo = 0;

	public Repartidor() {
		super();
	}

	public Repartidor(String nombre, char genero, String direccion, int edad, String motoAsignada, String turno,
			boolean extraVelocidad, double sueldo) {

		// Llamamos al constructor de la clase padre Persona con los datos de los
		// propios suyos
		super(nombre, genero, direccion, edad);
		this.motoAsignada = motoAsignada;
		this.turno = turno;
		this.extraVelocidad = extraVelocidad;
		this.sueldo = sueldo;
	}

	public Repartidor(String motoAsignada, String turno, boolean extraVelocidad, double sueldo) {
		super();
		this.motoAsignada = motoAsignada;
		this.turno = turno;
		this.extraVelocidad = extraVelocidad;
		this.sueldo = sueldo;
	}

	public int calculoRetenciones() {

		// A los repartidos se les retiene solo un 10%
		return 10;
	}

	public double calculoSueldo() {

		return this.sueldo - this.sueldo * this.calculoRetenciones() / 100;
	}

	public String getMotoAsignada() {
		return motoAsignada;
	}

	public void setMotoAsignada(String motoAsignada) {
		this.motoAsignada = motoAsignada;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public boolean isExtraVelocidad() {
		return extraVelocidad;
	}

	public void setExtraVelocidad(boolean extraVelocidad) {
		this.extraVelocidad = extraVelocidad;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

}
