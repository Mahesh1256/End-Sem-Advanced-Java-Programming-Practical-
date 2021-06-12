/*
 Created by : Shubham Rana
 Sec : A
 rollno : 65
 
 */
 
import java.io.*;
//used for socket programming 
import java.net.*;
public class Client
{	
	public static void main(String args[])
	{
	try
	{	
		// starting server at port 9090 using socket class
		Socket s= new Socket("localhost",9090);
		
		// Creating input output streams
		DataInputStream din=new DataInputStream(s.getInputStream());
		DataOutputStream dout= new DataOutputStream(s.getOutputStream());
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String str1="",str2="";
		
		while(!str1.equals("bye"))
		{			str1=br.readLine();
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