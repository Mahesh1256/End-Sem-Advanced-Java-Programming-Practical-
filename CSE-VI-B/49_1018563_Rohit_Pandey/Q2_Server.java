import java.io.*;
import java.net.*;

public class Server {

	public static void main(String[] args) throws Exception {
		ServerSocket ss=new ServerSocket(8088);
		Socket s=ss.accept();
		System.out.println("Connection is established Successfully");
		DataInputStream dataRead=new DataInputStream(s.getInputStream());
		DataOutputStream dataWrite=new DataOutputStream(s.getOutputStream());
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str="",str2="";
		while(!str.equals("bye"))
		{
			str=dataRead.readUTF();
			System.out.println("Client :---->"+str);
			System.out.print("You :--->");
			str2=br.readLine();
			dataWrite.writeUTF(str2);
			dataWrite.flush();
			
		}
		dataRead.close();
		s.close();
		ss.close();
			
	}
}