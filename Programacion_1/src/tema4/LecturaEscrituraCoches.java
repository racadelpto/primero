package tema4;

public class LecturaEscrituraCoches {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int cantidadCoches = 5;
		Coche[] arrayCoches = new Coche[5];

		for (int i = 0; i < arrayCoches.length; i++) {
			arrayCoches[i] = new Coche((int) (Math.random() * 100 + 1), "Coche" + (i + 1), "Corvette", "Mercedes",
					(int) (Math.random() * 1000 + 1), Coche.AMARILLO, (int) (Math.random() * 100 + 1), new Rueda[4],
					new Suspension[4]);
			for (int j = 0; j < arrayCoches[i].getRuedas().length; j++) {
				arrayCoches[i].getRuedas()[j] = new Rueda();
	
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

		arrayCoches[0].guardarCoches(arrayCoches, "c:\\logs\\arrayCoches.txt");
		
		System.out.println(arrayCoches[0].contarLineas("c:\\logs\\arrayCoches.txt"));
		
		Coche[] cochesLeidos = arrayCoches[0].cargarCoches("c:\\logs\\arrayCoches.txt");
		cochesLeidos.toString();
		System.out.println(cochesLeidos[4].toString());

	}

}
