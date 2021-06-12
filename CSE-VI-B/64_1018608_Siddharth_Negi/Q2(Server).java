// Name - Siddharth Negi , roll no-1018608
// server class for sending and receiving data.

import java.io.*;
import java.net.*;

public class Server {
	

	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(7777);
			Socket client = server.accept();
			
			DataInputStream dataReader = new DataInputStream(client.getInputStream());		// to read data from client
			DataOutputStream dataWriter = new DataOutputStream(client.getOutputStream());		// to send data to the client
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));		// to read data from the keyboard

			String str = "";
			String str1 = "";
			while(!str.equals("bye")) {			//repeat as long as str is not equal to "bye"
				
				str = dataReader.readUTF();
				System.out.println("client says: " + str);

				str1 = reader.readLine();
				dataWriter.writeUTF(str1);
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
