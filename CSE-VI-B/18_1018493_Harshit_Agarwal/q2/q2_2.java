import java.io.*;
import java.net.*;
public class q2_2
{
	public static void main(String[] args) throws Exception
	{
		ServerSocket ss=new ServerSocket(8070);
		Socket s= ss.accept();
		System.out.println("CONNECTION ESTABLISHED:"); 
		DataOutputStream dout=new DataOutputStream(s.getOutputStream());
		DataInputStream dis=new DataInputStream(s.getInputStream());
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str="", str2="";
		while(!str.equals("bye"))
		{
			str=dis.readUTF();
			System.out.println("Client : "+str);
			str2=br.readLine();
			dout.writeUTF(str2);
			dout.flush(); 
		}
		dis.close();
		s.close();
		ss.close();
	}
}