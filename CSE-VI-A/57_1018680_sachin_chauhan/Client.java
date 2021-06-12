import java.io.*;
import java.net.*;

public class Client {
	
	private static String host = "localhost";
	
	private static int port = 9090;
	
	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) {
		
		try {
			Socket client = new Socket(host, port);

			
			DataInputStream dataReader = new DataInputStream(client.getInputStream());
			
			DataOutputStream dataWriter = new DataOutputStream(client.getOutputStream());

			String sendMsg = "";
			
			String recvMsg = "";
			
			while(!sendMsg.equalsIgnoreCase("bye")) {
				
				sendMsg = reader.readLine();
				
				dataWriter.writeUTF(sendMsg);
				
				dataWriter.flush();

				recvMsg = dataReader.readUTF();
				System.out.println("Server says: " + recvMsg);
			}

			dataReader.close();
			client.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
