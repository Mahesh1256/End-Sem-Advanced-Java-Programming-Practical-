import java.util.*;
import java.io.*;
import java.net.*;

public class Server{
	public static void main(String[] ar)throws IOException{
		ServerSocket Ss=new ServerSocket(9120);
		Socket S=Ss.accept();//Connection established and return to the socket object
		DataInputStream Datainputstream=new DataInputStream(S.getInputStream());
		DataOutputStream Dataoutputstream=new DataOutputStream(S.getOutputStream());
		BufferedReader bufferedreader=new BufferedReader(new InputStreamReader(System.in));
		String s1="",s2="";
		while(!s1.equals("bye")){
			s2=Datainputstream.readUTF();
			System.out.println("Client says :"+s2);
			s1=bufferedreader.readLine();
			Dataoutputstream.writeUTF(s1);
			Dataoutputstream.flush();
		}
		bufferedreader.close();
		Dataoutputstream.close();
		Datainputstream.close();
		S.close();
		Ss.close();
		
		
		
	}
	
	
	
	
}