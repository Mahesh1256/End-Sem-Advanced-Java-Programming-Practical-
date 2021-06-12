// Created By SUSHMITA KANDARI SEC-A UNIVERSITY ROLL NO-1018615
import java.net.*;
import java.io.*;
public class Client{
	public static void main(String[] args) throws Exception {
	Socket s=new Socket("localhost",8080);
	DataInputStream dataRead=new DataInputStream(s.getInputStream());
	DataOutputStream dataWrite=new DataOutputStream(s.getOutputStream());
	BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
	String s1="",s2="";
	while(!s1.equals("Stop")){
		s1=br.readLine();//reading  from the keyboard 
		dataWrite.writeUTF(s1);
		dataWrite.flush();
		s2=dataRead.readUTF();
		System.out.println("Server says: "+s2);
	}
	dataRead.close();
	s.close();
	}
}
