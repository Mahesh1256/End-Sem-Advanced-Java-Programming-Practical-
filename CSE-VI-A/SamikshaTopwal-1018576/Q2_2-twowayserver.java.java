
import java.io.*;
import java.net.*;

public class twowayserver {

	public static void main(String[] args) throws Exception
	{
		ServerSocket SS= new ServerSocket(8087);
		Socket S=SS.accept();
		System.out.println("Connection is stable now... ");
		DataInputStream dataRead=new DataInputStream(S.getInputStream());
		DataOutputStream dataWrite=new DataOutputStream(S.getOutputStream());
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str=" ",str2=" ";
        while(!str.equals("bye"))
        {
        	str=dataRead.readUTF();
        	System.out.println("Client says: "+ str);
        	str2=br.readLine();
        	dataWrite.writeUTF(str2);
        	dataWrite.flush();
        }
        dataRead.close();
        S.close();
	}

}
