import java.net.*;
import java.io.*;
public class client3 {

	public static void main(String[] args) throws Exception {
		
		Socket s = new Socket("localhost",8080);
		
		DataInputStream dr = new DataInputStream(s.getInputStream());
		DataOutputStream dw = new DataOutputStream(s.getOutputStream());
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		String str1 = "",str2 = "";
		while(!str1.equals("bye"))
		{
			str1 = br.readLine();
			dw.writeUTF(str1);
			dw.flush();
			str2 = dr.readUTF();
			System.out.println("Server says: "+str2);
		}
		dr.close();
		s.close();
	}

}
