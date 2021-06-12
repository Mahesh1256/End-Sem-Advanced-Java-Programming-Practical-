import java.io.*;
import java.net.*;

public class server
{
public static void main(String arg[])
{
   try{
	ServerSocket ss1 = new ServerSocket(8082);
	Socket s1 = ss1.accept();
	DataInputStream din = new DataInputStream(s1.getInputStream());
	DataOutputStream dout = new DataOutputStream(s1.getOutputStream());
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	String str1="",str2="";
	while(!str1.equals("bye"))
	{
		str1 = din.readUTF();
		System.out.println("Client says :"+str1);
		str2 = br.readLine();
		dout.writeUTF(str2);
		dout.flush();
	}
	ss1.close();
	s1.close();
	din.close();

     }
   catch(Exception e)
   {
	System.out.println(e);
   }
}
}