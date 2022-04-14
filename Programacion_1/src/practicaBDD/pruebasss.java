package practicaBDD;

import java.util.ArrayList;

public class pruebasss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CocheVO coche = new CocheVO("EE", "DDD", "eee", 1, 1, "ee");

		System.out.println(CocheDAO.cargar("EE").getIdPiloto());

	}

}
