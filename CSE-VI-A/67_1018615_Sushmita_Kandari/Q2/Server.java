// Created By SUSHMITA KANDARI SEC-A UNIVERSITY ROLL NO-1018615
import java.net.*;
import java.io.*;
public class Server{
	public static void main(String[] args) throws Exception{
	ServerSocket ss=new ServerSocket(8080);
	Socket s=ss.accept();
	DataInputStream dataRead=new DataInputStream(s.getInputStream());
	DataOutputStream dataWrite=new DataOutputStream(s.getOutputStream());
	BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
	String s1="",s2="";
	while(!s1.equals("Stop")){	
		s1=dataRead.readUTF();// Read what client has sent
		System.out.println("client says: "+s1);
		s2=br.readLine();
		dataWrite.writeUTF(s2);
		dataWrite.flush();
	}
	dataRead.close();
	s.close();
	ss.close();
	}
}
