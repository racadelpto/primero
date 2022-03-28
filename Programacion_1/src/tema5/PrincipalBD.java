package tema5;

import java.sql.Connection;
import java.util.Scanner;

public class PrincipalBD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		Scanner teclado = new Scanner(System.in);

		// Pedimos los datos del jugador
		System.out.println("Introduce el id:");
		int id = teclado.nextInt();

		System.out.println("Nombre:");
		String nombre = teclado.next();

		System.out.println("Introduce la edad:");
		int edad = teclado.nextInt();

		System.out.println("Introduce la altura:");
		int altura = teclado.nextInt();

		System.out.println("Sexo:");
		String sexo = teclado.next();

		// Insertamos los datos en BD
		JugadorDAO.insertarJugador(id, nombre, edad, altura, sexo);

		teclado.close();
*/
		
		JugadorDAO.mostrarJugadores();
		
		for (int i=10;i<=40;i++)
		{
			JugadorVO changFeng = new JugadorVO(i,"ChangFeng",18,178,"M");
			
			JugadorDAO.actualizarJugador2(changFeng);

		}
		
		JugadorVO yuria = new JugadorVO(9,"Yuria",6,115,"F");
		
		JugadorDAO.actualizarJugador2(yuria);
		
		JugadorVO raulm = new JugadorVO(10,"Manuel",-1,173,"");
		
		JugadorDAO.actualizarJugador(raulm);
		
		JugadorDAO.mostrarJugadores(3,10);
	}

}
