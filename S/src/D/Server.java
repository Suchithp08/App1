package D;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java. security.PublicKey;

public class Server {
	public static void main(String[] args) {

	}

	{
		try {
			ServerSocket ssoc = new ServerSocket(6000);
			System.out.println("Server is ready to accept the request");
			Socket ss = ssoc.accept();
			System.out.println("Accepted req");
			InputStream is = ss.getInputStream();
			DataInputStream dis = new DataInputStream(is);
			String msg = dis.readUTF();
			System.out.println(msg);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}