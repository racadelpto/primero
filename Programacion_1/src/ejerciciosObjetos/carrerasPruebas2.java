package ejerciciosObjetos;

public class carrerasPruebas2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Primero de todo creamos un objeto de la Clase Circuito sobre la que probar
		// las funciones creadas en la clase Campeonato
		Circuito valencia = new Circuito("Circuito de Valencia", "España", "Valencia", 4000, 50000000,
				"Max Verstappen");

		// Expresamos por pantalla el nombre del piloto que tiene la vuelta rápida y el
		// tiempo en milisegundos
		System.out.println("Piloto vuelta rápida: " + valencia.getNombrePilotoVueltaRapida()
				+ "\nTiempo vuelta rápida: " + valencia.getVueltaRapida());

		// Actualizamos los valores del piloto de la vuelta rápida y el tiempo de esta
		// gracias a la función vueltaRapida()
		valencia.vueltaRapida("Fernando Alonso", 45000000);

		// Volvemos a expreasr por pantalla el nombre del piloto que tiene la vuelta
		// rápida y el tiempo en milisegundos y vemos que han cambiado su valor
		System.out.println("\nPiloto vuelta rápida: " + valencia.getNombrePilotoVueltaRapida()
				+ "\nTiempo vuelta rápida: " + valencia.getVueltaRapida());

		// Ahora creamos un array de la clase Circuito con un 3 como referencia para el
		// tamaño
		Circuito[] circuitosF1 = new Circuito[3];

		// Creamos un array de la clase Piloto y le asignamos la constante MAX_PILOTOS
		// de la clase Campeonato
		// que contiene el número máximo de pilotos del campeonato
		Piloto[] pilotosF1 = new Piloto[Campeonato.MAX_PILOTOS];

		// Finalmente creamos un objeto de la clase Campeonato y le asignamos los arrays
		// de las clases Circuito y Piloto
		Campeonato campeonatoF1 = new Campeonato(circuitosF1, pilotosF1, "Formula 1", "Campeonato Mundial de F1");

		// Creamos los 3 circuitos con sus datos
		Circuito Barcelona = new Circuito("Barcelona", "España", "Montmeló", 4700, 3000000, "Fernando Alonso");
		Circuito Baku = new Circuito("Bakú", "Azerbaiyán", "Bakú", 6000, 5000000, "Lewis Hamilton");
		Circuito Monaco = new Circuito("Mónaco", "Mónaco", "Mónaco", 3330, 2000000, "Max Verstappen");

		// Y los asignamos al array de la clase Circuito antes creado
		circuitosF1[0] = Barcelona;
		circuitosF1[1] = Baku;
		circuitosF1[2] = Monaco;

		// Mostramos por pantalla el nombre del circuito más largo del campeonato
		// gracias a la función circuitoMasLargo()
		System.out.println(
				"\nEl circuito más largo del campeonato es el de: " + campeonatoF1.circuitoMasLargo().getNombre());

		// Creamos los pilotos de cada posición del arrays de la clase Piloto antes
		// creado
		// A cada uno de ellos le asignamos un nuevo objeto de la clase Coche sin datos
		// en su interior ya que no
		// nos hacen falta todos ellos
		pilotosF1[0] = new Piloto("Max Verstappen", 24, 1, new Coche(), 1, "Redbull", 2000000);
		pilotosF1[1] = new Piloto("Fernando Alonso", 37, 2, new Coche(), 2, "Alpine", 1500000);
		pilotosF1[2] = new Piloto("Lewis Hamilton", 37, 7, new Coche(), 3, "Mercedes", 3000000);
		pilotosF1[3] = new Piloto("Carlos Sainz", 27, 0, new Coche(), 4, "Ferrari", 500000);
		pilotosF1[4] = new Piloto("Valtteri Bottas", 32, 0, new Coche(), 5, "Mercedes", 1000000);
		pilotosF1[5] = new Piloto("Sergio Pérez", 32, 0, new Coche(), 6, "Redbull", 500000);
		pilotosF1[6] = new Piloto("Lando Norris", 22, 0, new Coche(), 7, "McLaren", 250000);
		pilotosF1[7] = new Piloto("Charles Leclerc", 24, 0, new Coche(), 8, "Ferrari", 1000000);
		pilotosF1[8] = new Piloto("Daniel Ricciardo", 32, 0, new Coche(), 9, "McLaren", 1500000);
		pilotosF1[9] = new Piloto("Pierre Gasly", 25, 0, new Coche(), 10, "AlphaTauri", 250000);

		// Mostramos por pantalla los pilotos de varias escuderías gracias a la función
		// mostrarEscuderia()
		campeonatoF1.mostrarEscuderia("Mercedes");
		campeonatoF1.mostrarEscuderia("Redbull");
		campeonatoF1.mostrarEscuderia("Alpine");

		// Ahora con un for le asignamos a los coches creados para los pilotos la misma
		// potencia y peso
		// Algunos de estos valores los modificaremos después para probar una función
		for (int i = 0; i < pilotosF1.length; i++) {
			pilotosF1[i].getCocheAsignado().setPotencia(600);
			pilotosF1[i].getCocheAsignado().setPeso(620);

			// Dentro hacemos otro for para crearle ruedas a los coches creados para los
			// pilotos y poder asignarles a estas
			// una presión, que modificaremos después en algún caso
			for (int j = 0; j < pilotosF1[i].getCocheAsignado().getRuedas().length; j++) {
				pilotosF1[i].getCocheAsignado().getRuedas()[j] = new Rueda();

				// Usamos un switch con j como referencia
				switch (j) {
				// En cada caso le asignamos un valor de lugarRueda a cada rueda para poder
				// identificarla mejor más tarde
				case 0:
					pilotosF1[i].getCocheAsignado().getRuedas()[0].setlugarRueda("delantera derecha");
					break;
				case 1:
					pilotosF1[i].getCocheAsignado().getRuedas()[1].setlugarRueda("delantera izquierda");
					break;
				case 2:
					pilotosF1[i].getCocheAsignado().getRuedas()[2].setlugarRueda("trasera derecha");
					break;
				case 3:
					pilotosF1[i].getCocheAsignado().getRuedas()[3].setlugarRueda("trasera izquierda");
					break;
				}

				// Le asignamos una potencia general a todas las ruedas de todos los coches
				pilotosF1[i].getCocheAsignado().getRuedas()[j].setPresion(100);
			}
		}

		// Finalmente modificamos los valores de ciertos coches y ruedas para que los
		// resultados no sean idénticos y tengan errores de construcción
		pilotosF1[0].getCocheAsignado().getRuedas()[0].setPresion(150);
		pilotosF1[1].getCocheAsignado().setPotencia(1000);
		pilotosF1[2].getCocheAsignado().setPeso(400);
		pilotosF1[6].getCocheAsignado().setPotencia(1000);
		pilotosF1[7].getCocheAsignado().setPeso(400);

		// Mostramos por pantalla el estado de los coches de cada piloto (si siguen las
		// reglas o no)
		campeonatoF1.comprobarCoches();

	}

}
