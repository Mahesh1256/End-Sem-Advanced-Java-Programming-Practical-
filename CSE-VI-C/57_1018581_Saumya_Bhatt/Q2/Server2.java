import java.net.*;
import java.io.*;
public class Server2{
	public static void main(String args[])throws Exception{
		ServerSocket ss=new ServerSocket(8080);
		Socket s=ss.accept();
//connection made
		DataInputStream dataRead=new DataInputStream(s.getInputStream());
		DataOutputStream dataWrite=new DataOutputStream(s.getOutputStream());
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		String str="",str2="";
		while(!str.equals("bye")){
			str=dataRead.readUTF();
			System.out.println("Client says: "+str);
			str2=br.readLine();
			dataWrite.writeUTF(str2);
			dataWrite.flush();
		}
		dataRead.close();
		s.close();
	}
}