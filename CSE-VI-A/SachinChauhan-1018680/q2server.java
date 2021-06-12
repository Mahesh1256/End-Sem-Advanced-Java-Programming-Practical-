import java.io.*;
import java.net.*;

public class Server {
	private static int port = 7000;

	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(port);
			Socket client = server.accept();
			
			DataInputStream dataReader = new DataInputStream(client.getInputStream());
			DataOutputStream dataWriter = new DataOutputStream(client.getOutputStream());
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

			String recvMsg = "";
			String sendMsg = "";
			while(!recvMsg.equalsIgnoreCase("bye")) {
				
				recvMsg = dataReader.readUTF();
				System.out.println("client says: " + recvMsg);

				sendMsg = reader.readLine();
				dataWriter.writeUTF(sendMsg);
				dataWriter.flush();
			}

			dataReader.close();
			client.close();
			server.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
