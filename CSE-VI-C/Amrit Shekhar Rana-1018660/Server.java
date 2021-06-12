import java.net.*;
import java.io.*;

public class Server {

	public static void main(String[] args) throws Exception {
		
		ServerSocket ss = new ServerSocket(7070);
		Socket s = ss.accept();
		
		System.out.println("I'm Ready to accept request!!");
		
		DataOutputStream writeOverBuffer = new DataOutputStream(s.getOutputStream());
		DataInputStream readFromBuffer = new DataInputStream(s.getInputStream());
		BufferedReader readFromKB = new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = "", str2 = "";
		while(!str1.equals("See you!")) {
			str1 = readFromBuffer.readUTF();
			System.out.println("Client: " + str1);
			str2 = readFromKB.readLine();
			writeOverBuffer.writeUTF(str2);
			writeOverBuffer.flush();
			
		}
		readFromBuffer.close();
		s.close();
		ss.close();
	}
}
