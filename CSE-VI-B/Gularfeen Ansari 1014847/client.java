import java.io.*;
import java.net.*;

public class client
{

public static void main(String arg[])
{
  try{
	Socket s1 = new Socket("localhost",8082);
	DataInputStream din = new DataInputStream(s1.getInputStream());
	DataOutputStream dout = new DataOutputStream(s1.getOutputStream());
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	String str1="",str2="";
	while(!str1.equals("bye"))
	{
		str1 = br.readLine();
		dout.writeUTF(str1);
		dout.flush();
		str2 = din.readUTF();
		System.out.println("Server Says : "+str2);
	}
	s1.close();
	din.close();
    }
    catch(Exception e)
    {
	System.out.println(e);
    }
}
}