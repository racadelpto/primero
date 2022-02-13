package tema4;

public class LecturaEscrituraCoches {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int cantidadCoches = 5;
		Coche[] arrayCoches = new Coche[5];

		for (int i = 0; i < arrayCoches.length; i++) {
			arrayCoches[i] = new Coche((int) Math.random() * 100 + 1, "Coche " + i + 1, "Corvette", "Mercedes",
					(int) Math.random() * 1000 + 1, Coche.AMARILLO, (int) Math.random() * 100 + 1, new Rueda[4],
					new Suspension[4]);
			for (int j = 0; i < arrayCoches[i].getRuedas().length; j++) {
				switch (j) {
				case 0:
					arrayCoches[i].getRuedas()[j].setlugarRueda(" delantera derecha");
					break;
				case 1:
					arrayCoches[i].getRuedas()[j].setlugarRueda(" delantera izquierda");
					break;
				case 2:
					arrayCoches[i].getRuedas()[j].setlugarRueda(" trasera derecha");
					break;
				case 3:
					arrayCoches[i].getRuedas()[j].setlugarRueda(" trasera izquierdaw");
					break;
				}
			}
		}

		guardarCoches(arrayCoches, "C:\\arrayCoches.txt");

	}

}
