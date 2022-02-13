package tema4;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class EjemploSocketCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Definimos la variable socket
		Socket sock = null;
		DataOutputStream out = null;
		DataInputStream din = null;

		// Intentamos conectarnos con el servidor remoto
		try {
			sock = new Socket("localhost", 12345);

			// Para poder escribir en el socket utilizamos un DataOutput
			out = new DataOutputStream(sock.getOutputStream());
			din = new DataInputStream(sock.getInputStream());

			out.writeUTF("Solicitando plataforma de aterrizaje");

			String msg = din.readUTF();
			System.out.println("Señor, hemos recibido el mensaje de bienvenida de la base");

			System.out.println("Señor, la plataforma asignada es " + din.readInt());

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Nos desconectamos
		try {
			sock.close();
			out.close();
			din.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
