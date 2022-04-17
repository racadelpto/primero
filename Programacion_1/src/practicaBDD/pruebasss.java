package practicaBDD;

import java.util.ArrayList;

public class pruebasss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PilotoVO piloto = new PilotoVO("Car63V", "saffds", "afafs", 22, "D", "qafdasf", new CocheVO());
		
		System.out.println(PilotoDAO.actualizar(piloto));

		

	}

}
