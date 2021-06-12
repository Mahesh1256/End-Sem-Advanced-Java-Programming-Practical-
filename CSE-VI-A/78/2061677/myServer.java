import java.net.*;
import java.io.*;

class myServer {

	public static void main(String[] args) throws Exception {

		ServerSocket ss = new ServerSocket(8080);
		Socket s = ss.accept();

		System.out.println("Connection established");

		DataInputStream readTheData = new DataInputStream(s.getInputStream());

		DataOutputStream writeTheData = new DataOutputStream(s.getOutputStream());

		BufferedReader takeinput = new BufferedReader(new InputStreamReader(System.in));
		String s1 = "", s2 = "";
		while (!s1.equals("stop"))
		{
			s1 = readTheData.readUTF();
			System.out.println("Client->" + s1);
			s2 = takeinput.readLine();
			writeTheData.writeUTF(s2);
			writeTheData.flush();
		}

		readTheData.close();
		s.close();
		ss.close();

	}

}