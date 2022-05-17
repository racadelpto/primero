package examenBDD;

import java.util.Scanner;

public class ExamenTema5 {

	// Ints inmodificables para cada opcion del menu principal
	final static int OPCION_INTRODUCIR = 1;
	final static int OPCION_MODIFICAR = 2;
	final static int OPCION_MOSTRAR = 3;
	final static int OPCION_ELIMINAR = 4;
	final static int OPCION_SALIR = 5;

	public static void main(String[] args) {

		// int para la opcion del menu que introduce el usuario y el Scanner
		int opcionMenu = 0;
		Scanner teclado = new Scanner(System.in);

		// Mientras opcionMenu sea diferente de OPCION_SALIR
		while (opcionMenu != OPCION_SALIR) {

			// Si opcionMenu es igual a OPCION_INTRODUCIR
			if (opcionMenu == OPCION_INTRODUCIR) {

				// String para el 5g y TerminalVO para almacenar los datos del terminal y
				// pasarselo a la funcion
				String SiNo = "";
				TerminalVO terminal = new TerminalVO();

				// Leemos datos y se lo asignamos al terminal
				System.out.println("\nIntroduce el id del terminal: ");
				terminal.setId(teclado.nextInt());

				System.out.println("\nIntroduce el brand del terminal: ");
				terminal.setBrand(teclado.next());

				System.out.println("\nIntroduce el model del terminal: ");
				terminal.setModel(teclado.next());

				System.out.println("\nIntroduce la ram del terminal: ");
				terminal.setRam(teclado.nextInt());

				System.out.println("\nIntroduce la rom del terminal: ");
				terminal.setRom(teclado.nextInt());

				System.out.println("\nIntroduce los inches del terminal: ");
				terminal.setInches(teclado.next());

				System.out.println("\nIntroduce el os del terminal: ");
				terminal.setOs(teclado.next());

				System.out.println("\nIntroduce el price del terminal: ");
				terminal.setPrice(teclado.nextInt());

				System.out.println("\nEspecifica si tiene 5g o no el terminal (s/n): ");
				SiNo = teclado.next();

				// Modificamos el 5g de terminal en función de la variable SiNo
				if (SiNo.toLowerCase().equals("s")) {
					terminal.setCincoG(1);
				} else {
					terminal.setCincoG(0);
				}

				// Si el resultado de la función insertarTerminales() con el terminal recién
				// creado es igual a 0
				if (TerminalDAO.insertarTerminales(terminal) == 0) {

					// Comunicamos el error
					System.out.println(
							"\nHa ocurrido un fallo a la hora de introducir datos. Comprueba que son correctos. Volvemos al menú.");
				} else {

					// Se han introducido correctamente
					System.out.println("\nSe han introducido los datos correctamente.");
				}
			}

			// Si opcionMenu es igual a OPCION_MODIFICAR
			if (opcionMenu == OPCION_MODIFICAR) {

				// int para el id del terminal
				int idTerminal = 0;

				// Leemos el id por teclado
				System.out.println("\nIntroduce el id del terminal que quieres modificar: ");
				idTerminal = teclado.nextInt();

				// Si el resultado de la función modificarTerminal() con el terminal recién
				// creado es igual a 0
				if (TerminalDAO.modificarTerminal(idTerminal) == 0) {

					// Comunicamos el error
					System.out.println("\nHa ocurrido algún error. Volvemos al menú.");
				} else {

					// Se ha modificado correctamente
					System.out.println("\nSe ha modificado correctamente el campo.");
				}
			}

			// Si opcionMenu es igual a OPCION_MOSTRAR
			if (opcionMenu == OPCION_MOSTRAR) {

				// ints para las opciones del menu de la opcion Mostrar Terminales
				int opcionMenu2 = 0;
				int opcionNombreDesc = 1;
				int opcionPrecioDesc = 2;
				int opcionMarca = 3;
				int opcionSalir = 4;

				// Mientras opcionMenu2 sea diferente de opcionSalir
				while (opcionMenu2 != opcionSalir) {

					// Si opcionMenu2 es igual a opcionNombreDesc
					if (opcionMenu2 == opcionNombreDesc) {

						// Ejecutamos la función para mostrar lo que se especifica
						TerminalDAO.mostrarOrdenadosNombre();

					}

					// Si opcionMenu2 es igual a opcionPrecioDesc
					if (opcionMenu2 == opcionPrecioDesc) {

						// Ejecutamos la función para mostrar lo que se especifica
						TerminalDAO.mostrarOrdenadosPrecio();

					}

					// Si opcionMenu2 es igual a opcionMarca
					if (opcionMenu2 == opcionMarca) {

						// String brand para la marca
						String brand = "";

						// Leemos la marca por teclado y la asignamos a la función
						System.out.println("\n¿De qué marca quieres mostrar los terminales?: ");
						brand = teclado.next();

						// Ejecutamos la función para mostrar lo que se especifica
						TerminalDAO.mostrarMarca(brand);

					}

					// Se muestra el menú de la opción 3 hasta que se introduzca el 4 de salir
					System.out.println("\nMenú de la opción 3. Mostrar Terminales\n");
					System.out.println("1. Mostrar todos ordenados por nombre desc");
					System.out.println("2. Mostrar todos ordenados por precio desc");
					System.out.println("3. Mostrar los de Marca");
					System.out.println("4. Salir");
					System.out.println("\nElige una opción (1-4):");
					opcionMenu2 = teclado.nextInt();

				}

			}

			// Si opcionMenu es igual a OPCION_ELIMINAR
			if (opcionMenu == OPCION_ELIMINAR) {

				// int idTerminal
				int idTerminal = 0;

				// Leemos por teclado el id del terminal a eliminar
				System.out.println("\nIntroduce el id del terminal a eliminar: ");
				idTerminal = teclado.nextInt();

				// Si el resultado de la función eliminarTerminal() con el idTerminal
				// es igual a 0
				if (TerminalDAO.eliminarTerminal(idTerminal) == 0) {

					// Se expresa error
					System.out.println("\nHa ocurrido algún tipo de error.");
				} else {

					// Se ha eliminado correctamente
					System.out.println("\nSe ha eliminado correctamente el terminal.");
				}

			}

			// Se muestra el menú de primeras y después de terminar de ejecutar cada opción
			// menos la de salir,
			// con la que se acabará el programa
			System.out.println("\n\n\n****Bienvenido a PhoneStorage****");
			System.out.println("****  Administración  ****\n");
			System.out.println("      1. Introducir Datos de Terminales");
			System.out.println("      2. Modificar Terminal");
			System.out.println("      3. Mostrar Terminales");
			System.out.println("      4. Eliminar Terminal");
			System.out.println("      5. Salir");
			System.out.println("   \nElige una opción (1-5):");
			opcionMenu = teclado.nextInt();
		}

		// Cerramos teclado
		teclado.close();

	}

}
