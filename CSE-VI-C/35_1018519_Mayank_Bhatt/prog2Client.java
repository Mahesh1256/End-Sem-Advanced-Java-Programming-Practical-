import java.io.*;
import java.net.*;

class Client
{
    public static void main(String args[])throws Exception
    {
	Socket soc=new Socket("192.168.43.65",8080);

	DataInputStream dataR=new DataInputStream(soc.getInputStream());

	DataOutputStream dataW=new DataOutputStream(soc.getOutputStream());

	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

	String string1="",string2="";

	while(!string1.equals("byebro"))
        {
	    string1=br.readLine();
	    dataW.writeUTF(string1);
	    dataW.flush();
	    string2=dataR.readUTF();
	    System.out.println("Mayanks Computer : "+string2);
        }

        dataR.close();
        soc.close();
    }
}