import java.net.*;
import java.io.*;

public class Client {

	public static  void main(String[] args) throws Exception {
		
		Socket s = new Socket("localhost",7070);
		DataOutputStream writeOverBuffer = new DataOutputStream(s.getOutputStream());
		DataInputStream readFromBuffer = new DataInputStream(s.getInputStream());
		BufferedReader readFromKB =  new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = "", str2 = "";
		while(!str1.equals("See you!")) {
			str1 = readFromKB.readLine();
			writeOverBuffer.writeUTF(str1);
			writeOverBuffer.flush();
			str2 = readFromBuffer.readUTF();
			
			System.out.println("Server: " + str2);
			
		}
		
		readFromBuffer.close();
		s.close();
		
		
	}
}
