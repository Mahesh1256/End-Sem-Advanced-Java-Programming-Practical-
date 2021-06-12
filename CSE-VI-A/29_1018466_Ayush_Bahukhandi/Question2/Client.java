import java.io.*;
import java.net.*;
public class Client
{	
	public static void main(String args[])
	{
	try
	{
		Socket s= new Socket("localhost",8090);
		DataInputStream din=new DataInputStream(s.getInputStream());
		DataOutputStream dout= new DataOutputStream(s.getOutputStream());
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String str1="",str2="";
		while(!str1.equals("bye"))
		{
			str1=br.readLine();
			dout.writeUTF(str1);
			dout.flush();
			str2=din.readUTF();	
			System.out.println("Server said : "+str2);
		}
		din.close();
		s.close();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}}
}