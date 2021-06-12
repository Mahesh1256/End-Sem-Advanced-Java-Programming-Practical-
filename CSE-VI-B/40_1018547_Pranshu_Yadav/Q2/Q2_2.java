import java.io.*;
import java.net.*;
public class Q2_2
{
	public static void main(String[] args) throws Exception
	{
			ServerSocket ss=new ServerSocket(8070);
			Socket s= ss.accept();
			System.out.println("CONNECTION ESTABLISHED:");                                                                                                                                                                                                                                                                 
			DataOutputStream dout=new DataOutputStream(s.getOutputStream());
			DataInputStream dis=new DataInputStream(s.getInputStream());
			InputStreamReader k=new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(k);
			String str="", str2="";
			while(!str.equals("bye"))
			{
				str=dis.readUTF();
				System.out.println("Client Says: "+str);
				str2=br.readLine();
				dout.writeUTF(str2);				
				dout.flush();
			}
			dis.close();
			s.close();
			ss.close();
	}
}		