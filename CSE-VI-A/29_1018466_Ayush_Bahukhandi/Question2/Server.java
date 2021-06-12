import java.io.*;
import java.net.*;
public class Server
{
	public static void main(String args[])
	{
		try
		{
			ServerSocket ss=new ServerSocket(8090);
			Socket s=ss.accept();
			DataOutputStream dout=new DataOutputStream(s.getOutputStream());
			DataInputStream din=new DataInputStream(s.getInputStream());
			BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
			String str1="",str2="";
			while(!str2.equals("bye"))
			{
				str1=din.readUTF();
				System.out.println("Client said : "+str1);
				str2=br.readLine();
				dout.writeUTF(str2);
				dout.flush();
			}
			ss.close();
			din.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
				
