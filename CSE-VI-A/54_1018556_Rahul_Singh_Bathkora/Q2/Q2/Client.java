import java.util.*;
import java.net.*;
import java.io.*;

public class Client{
	public static void main(String[] arg)throws IOException{
		Socket S=new Socket("localhost",9120);
		DataInputStream Datainputstream=new DataInputStream(S.getInputStream());
		DataOutputStream Dataoutputstream=new DataOutputStream(S.getOutputStream());
		BufferedReader bufferedreader=new BufferedReader(new InputStreamReader(System.in));
		String s2="",s1="";
		while(!s1.equals("bye")){
			s1=bufferedreader.readLine();
			Dataoutputstream.writeUTF(s1);
			Dataoutputstream.flush();
			s2=Datainputstream.readUTF();
			System.out.println("Server says :" + s2);
		}
		bufferedreader.close();
		Dataoutputstream.close();
		Datainputstream.close();
		S.close();
		
		
	}
	
	
}