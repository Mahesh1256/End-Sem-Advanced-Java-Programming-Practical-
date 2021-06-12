import java.io.*;
import java.net.*;
public class server3 {

	public static void main(String[] args) throws Exception {
		
		ServerSocket servers = new ServerSocket(8080);
		Socket s=servers.accept();
		System.out.println("Connection Has Been Made");
		
		DataInputStream dr = new DataInputStream(s.getInputStream());
		DataOutputStream dw = new DataOutputStream(s.getOutputStream());
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str1="",str2="";
		while(!str1.equals("bye"))
		{
			str1 = dr.readUTF();
			System.out.println("client says : "+str1);
			str2=br.readLine();
			dw.writeUTF(str2);
			dw.flush();
		}
		dr.close();
		s.close();
		servers.close();
	}

}
