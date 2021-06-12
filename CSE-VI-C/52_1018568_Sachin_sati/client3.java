import java.net.*;
import java.io.*;	
public class client3{
	public static void main(String[] args) throws Exception {
	Socket s=new Socket("localhost",8081);
	DataInputStream dataRead=new DataInputStream(s.getInputStream());
	DataOutputStream dataWrite=new DataOutputStream(s.getOutputStream());
	BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
	String str="",str2="";
	while(!str.equals("bye")){
		str=br.readLine();//reading something from the keyboard which is converted to string
		dataWrite.writeUTF(str);
		dataWrite.flush();
		str2=dataRead.readUTF();
		System.out.println("Server says: "+str2);
	}
	dataRead.close();
	s.close();
	} }
