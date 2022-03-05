package tema4;

public class JuegoBarcos {

	// Tablero de juego
	public static char barcosNavegando[][];

	public static final char AGUA = 'A';
	public static final char DISPARO = 'D';
	public static final char TOCADO = 'T';
	public static final char BARCO = 'B';

	// Constructor
	public JuegoBarcos() {
		super();

		// Defino el tamaño del tablero
		barcosNavegando = new char[10][10];

		// Inicializamos las casillas
		inicializarJuego();
	}

	public void inicializarJuego() {
		// Recorremos los 10 arrays
		for (int i = 0; i < barcosNavegando.length; i++) {

			// barcosNavegando[i] es un array, lo recorremos
			for (int j = 0; j < barcosNavegando[i].length; j++) {

				// Inicializo a agus todas las posiciones
				barcosNavegando[i][j] = this.AGUA;
			}
		}
	}

	public void mostrarTablero() {
		// Recorremos los 10 arrays
		for (int i = 0; i < barcosNavegando.length; i++) {

			// barcosNavegando[i] es un array, lo recorremos
			for (int j = 0; j < barcosNavegando[i].length; j++) {

				// Mostramos por pantalla todas las posiciones
				System.out.print(barcosNavegando[i][j] + " ");
			}
			System.out.println();
		}
	}
}