import java.net.*;
import java.io.*;
public class Q2Server
{
	public static void main(String[] args) throws Exception
	{
		//Create a Server Socket.
		ServerSocket ss=new ServerSocket(8080);
		//Connect it to client socket by accept method.
		Socket s=ss.accept();
		System.out.println("connection established!!! ");
		DataInputStream dataRd=new DataInputStream(s.getInputStream());
		DataOutputStream dataWrite=new DataOutputStream(s.getOutputStream());
		BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
		String str="",str2="";
		while(!str.equals("Stay Safe"))
		{
			//reads whatever is sent by the client
			str=dataRd.readUTF();
			System.out.println("Client says: "+str);
			str2=br.readLine();
			dataWrite.writeUTF(str2);
			dataWrite.flush();
		}
		dataRd.close();
		s.close();
		ss.close();
	}
}