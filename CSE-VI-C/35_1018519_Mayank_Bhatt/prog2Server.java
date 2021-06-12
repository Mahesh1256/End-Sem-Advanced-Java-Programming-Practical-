import java.net.*;
import java.io.*;

class Server
{
    public static void main(String args[])throws Exception
    {
        ServerSocket ssoc=new ServerSocket(8080);
        Socket soc=ssoc.accept();
 
        System.out.println("Online");

        DataInputStream dataR=new DataInputStream(soc.getInputStream());
        DataOutputStream dataW=new DataOutputStream(soc.getOutputStream());
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

        String string1="",string2="";

        while(!string1.equals("byebro"))
        {
	    string1=dataR.readUTF();
	    System.out.println("Mayank Bhatt :"+string1);
	    string2=br.readLine();
	    dataW.writeUTF(string2);
	    dataW.flush();
        }
        dataR.close();
        soc.close();
        ssoc.close();
    }
}