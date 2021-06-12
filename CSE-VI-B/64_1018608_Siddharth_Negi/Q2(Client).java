// Name - Siddharth Negi , roll no-1018608
// client class for sending and receiving data.

import java.io.*;
import java.net.*;

public class Client {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) {
		try {
			Socket client = new Socket("localhost", 7777);     // Create client socket

			DataInputStream dataReader = new DataInputStream(client.getInputStream());		// to read data from server
			DataOutputStream dataWriter = new DataOutputStream(client.getOutputStream());           // to send data to the server
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));		// to read data from the keyboard
			
			String str = "";
			String str1 = "";
			while(!str.equals("bye")) {         //repeat as long as str is not equal to "bye"
				
				str = reader.readLine();
				dataWriter.writeUTF(str);
				dataWriter.flush();

				str1 = dataReader.readUTF();
				System.out.println("Server says: " + str1);
			}

			dataReader.close();
			client.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
