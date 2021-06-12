/* 
Name - Gourav Uniyal
Class Rollno - 15
Father's name - Dinesh Chandra Uniyal
University Rollno - 1018488
Subject - Advanced Java Programming
Date - 12/06/2021
*/

import java.net.*;
import java.io.*;

public class SocServer {
	/*
	 * This is SocClient file where I had put my code for client
	 */
	public static void main(String[] args) throws Exception {
		ServerSocket serverSocket = new ServerSocket(8084);
		Socket socket = serverSocket.accept();

		DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());

		DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String clientMessage = "", serverMessage = "";
		while (!clientMessage.equals("close!!")) {
			clientMessage = dataInputStream.readUTF();
			System.out.println("Client:\t" + clientMessage);
			System.out.print("You:\t");
			serverMessage = br.readLine();
			dataOutputStream.writeUTF(serverMessage);
			dataOutputStream.flush();
		}
		dataInputStream.close();
		socket.close();
		serverSocket.close();
	}
}
