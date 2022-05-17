package examenBDD;

public class TerminalVO {

	// Atributos privados de la clase TerminalVO
	private int id;
	private String brand;
	private String model;
	private int ram;
	private int rom;
	private String inches;
	private String os;
	private int price;
	private int cincoG;

	// Constructor que recibe todos los datos e inicializa un objeto TerminalVO
	public TerminalVO(int id, String brand, String model, int ram, int rom, String inches, String os, int price,
			int cincoG) {
		super();
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.ram = ram;
		this.rom = rom;
		this.inches = inches;
		this.os = os;
		this.price = price;
		this.cincoG = cincoG;
	}

	// Constructor que inicializa un objeto TerminalVO
	public TerminalVO() {
		super();
	}

	/* Getters y setters de los atributos de la clase TerminalVO */

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getRom() {
		return rom;
	}

	public void setRom(int rom) {
		this.rom = rom;
	}

	public String getInches() {
		return inches;
	}

	public void setInches(String inches) {
		this.inches = inches;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCincoG() {
		return cincoG;
	}

	public void setCincoG(int cincoG) {
		this.cincoG = cincoG;
	}

}
