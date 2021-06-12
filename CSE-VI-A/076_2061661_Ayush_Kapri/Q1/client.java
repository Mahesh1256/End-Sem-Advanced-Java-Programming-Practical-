import java.io.*;
import java.net.*;
import java.util.*;
// Solution to Question 2 of Advanced Java Practical
// Name - Ayush Kapri
// Roll no - 2061661
// Class Roll no - 076

class Client {


	public static void main(String[] args) throws Exception {


		Socket clientSocket = new Socket("localhost", 8000);
		DataInputStream 	readTheData = new DataInputStream(clientSocket.getInputStream());

		DataOutputStream 	writeTheData = new DataOutputStream(clientSocket.getOutputStream());

		BufferedReader takeinput = new BufferedReader(new InputStreamReader(System.in));
		String s1 = "", s2 = "";
		while (!s1.equals("stop")) {
			s1 = takeinput.readLine();
			writeTheData.writeUTF(s1);
			writeTheData.flush();
			s2 = readTheData.readUTF();
			writeTheData.flush();
			System.out.println("Server->" + s2);

		}

		readTheData.close();
		clientSocket.close();
	}

}

