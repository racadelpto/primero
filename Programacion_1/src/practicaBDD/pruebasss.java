package practicaBDD;

import java.util.ArrayList;

public class pruebasss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<CarreraVO> carreras = CampeonatoDAO.cargarCarreras("Camp2015");
		
		for(int i= 0; i<5; i++) {
			System.out.println(carreras.get(i).getIdCarrera());
		}
		
	}

}
