package bin;
import java.io.*;
import java.net.*;
public class prog3server {
public static void main(String args[])throws Exception{
	ServerSocket ss = new ServerSocket(8080);
	Socket s = ss.accept();
/data read/
	DataInputStream dataRead = new DataInputStream(s.getInputStream());
	/data write/
	DataOutputStream dataWrite = new DataOutputStream(s.getOutputStream());
	/keyboardRead/
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
	String str="",str2="";
	while(!str.equals("bye")) {
		str=dataRead.readUTF();
		System.out.println("Client says: "+str);
		str2=br.readLine();
		dataWrite.writeUTF(str2);
		dataWrite.flush();		
	}
dataRead.close();
s.close();
ss.close();
}
}