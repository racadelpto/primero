package tema4;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class EjemploSocketServidor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Definimos la variable del socket servidor
		ServerSocket servSock = null;
		Socket sockCliente = null;
		DataInputStream din = null;
		DataOutputStream don = null;

		// Creamos el socket servidor
		try {
			// Arranco el servidor en el puerto 12345
			servSock = new ServerSocket(12345);

			// Espero a que un cliente se conecte
			sockCliente = servSock.accept();
			System.out.println("Se ha conectado un cliente");

			// Creamos el InputStream para leer
			din = new DataInputStream(sockCliente.getInputStream());
			don = new DataOutputStream(sockCliente.getOutputStream());

			// Leemos el mensaje
			String msg = din.readUTF();

			if (msg.toLowerCase().contains("solicitando")) {
				// Respondemos al cliente dandole plataforma de aterrizaje
				don.writeUTF("Bienvenido a la base su plataforma de aterrizaje es: ");
				don.writeInt((int) (Math.random() * 100));
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Cerramos el socket servidor y cliente
		try {
			servSock.close();
			sockCliente.close();
			din.close();
			don.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
