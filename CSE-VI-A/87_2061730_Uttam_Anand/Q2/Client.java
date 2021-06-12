import java.io.*;
import java.net.*;
import java.util.*;


class Client {


	public static void main(String[] args) throws Exception {

		//  Uttam Anand
		Socket clientSocket = new Socket("localhost", 8000);
		DataInputStream 	rd = new DataInputStream(clientSocket.getInputStream());

		DataOutputStream 	wd = new DataOutputStream(clientSocket.getOutputStream());

		BufferedReader takeinput = new BufferedReader(new InputStreamReader(System.in));
		String s1 = "", s2 = "";
		while (!s1.equals("stop")) {
			s1 = takeinput.readLine();
			wd.writeUTF(s1);
			wd.flush();
			s2 = rd.readUTF();
			wd.flush();
			System.out.println("Server->" + s2);
			//  2061730
		}

		rd.close();
		clientSocket.close();
	}

}













