import java.io.*;
import java.net.*;

public class server {

	public static void main(String[] args) throws Exception {
		ServerSocket ss=new ServerSocket(8081);
		Socket s=ss.accept();
		System.out.println("Connection is Sucessfully established--!");
		DataInputStream dataRead=new DataInputStream(s.getInputStream());
		DataOutputStream dataWrite=new DataOutputStream(s.getOutputStream());
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s1="",s2="";
		while(!s1.equals("bye"))
		{
			s1=dataRead.readUTF();
			System.out.println("From Client:" +s1);
			s2=br.readLine();
			dataWrite.writeUTF(s2);
			dataWrite.flush();
			
		}
		dataRead.close();
		s.close();
		ss.close();
			
	}
}