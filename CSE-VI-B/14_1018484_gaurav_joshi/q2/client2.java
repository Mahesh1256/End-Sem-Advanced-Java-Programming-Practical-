import java.io.*;
import java.net.*;

public class client2
{

public static void main(String arg[])
{
  try{
	Socket s = new Socket("localhost",8082);   //socket is one endpoint of a two-way communication link between two programs running on a network.

	DataInputStream din = new DataInputStream(s.getInputStream());   //class to create an input stream to receive response from the server.
	DataOutputStream dout = new DataOutputStream(s.getOutputStream());   //class to create output stream to send information to the server socket.
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

	s.close();
	din.close();
    }

    catch(Exception e)
    {
	System.out.println(e);
    }
}
}