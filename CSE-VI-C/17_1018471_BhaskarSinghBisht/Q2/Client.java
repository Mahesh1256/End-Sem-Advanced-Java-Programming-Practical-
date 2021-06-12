import java.io.*;
import java.net.*;
import java.util.*;


class Client {


	public static void main(String[] args) throws Exception {


		Socket clientSocket = new Socket("localhost", 8000);
		DataInputStream 	readTheData = new DataInputStream(clientSocket.getInputStream());
		DataOutputStream 	writeTheData = new DataOutputStream(clientSocket.getOutputStream());



		//Name - Bhaskar Singh Bisht
		//Sec - C
		//University Roll no - 1018471
		//Class Roll - 17
		//Sem - 6
		
		BufferedReader takeinput = new BufferedReader(new InputStreamReader(System.in));
		String s1 = "", s2 = "";
		while (!s1.equals("bye")) {
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













