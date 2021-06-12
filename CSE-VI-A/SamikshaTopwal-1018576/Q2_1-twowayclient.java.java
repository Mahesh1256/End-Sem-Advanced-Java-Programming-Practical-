

import java.io.*;
import java.net.*;

public class twowayclient {

	public static void main(String[] args) throws Exception
	{
		Socket S=new Socket("localhost",8087);
		DataInputStream dataRead=new DataInputStream(S.getInputStream());
        DataOutputStream dataWrite=new DataOutputStream(S.getOutputStream());
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str=" ",str2=" ";
        while(!str.equals("Bye"))
        {
        	str=br.readLine();
        	dataWrite.writeUTF(str);
        	dataWrite.flush();
        	str2=dataRead.readUTF();
        	System.out.println("Server Says : "+str2);
        }
        dataRead.close();
        S.close();
	}

}
