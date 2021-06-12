import java.io.*;
import java.net.*;
public class q2_1
{
	public static void main(String[] args) throws Exception
	{
		Socket s= new Socket("localhost",8070);
		DataOutputStream dout=new DataOutputStream(s.getOutputStream());
		DataInputStream dis=new DataInputStream(s.getInputStream());
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str="", str2="";
		while(!str.equals("bye"))
		{
			str=br.readLine();	
			dout.writeUTF(str);
			dout.flush();
			str2=dis.readUTF();
			System.out.println("Server : "+str2);
		}
		dis.close();
		s.close();
	} 
}