import java.net.*;
import java.io.*;

class Server {

	public static void main(String[] args) throws Exception {

		ServerSocket ss = new ServerSocket(8000);
		Socket s = ss.accept();


		//Name - Bhaskar Singh Bisht
		//Sec - C
		//University Roll no - 1018471
		//Class Roll - 17
		//Sem - 6
		
		
		DataInputStream readTheData = new DataInputStream(s.getInputStream());
		DataOutputStream writeTheData = new DataOutputStream(s.getOutputStream());

		BufferedReader takeinput = new BufferedReader(new InputStreamReader(System.in));
		String s1 = "", s2 = "";
		while (!s1.equals("bye"))
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
