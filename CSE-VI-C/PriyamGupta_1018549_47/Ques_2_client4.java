/*Soln2:Priyam Gupta
Roll no. 1018549
sec -C */
import java.io.*;
import java.net.*;
public class client4{
	public static void main(String args[])throws Exception{
		Socket s=new Socket("localhost",8080);
		//Socket class object to establish connection
		DataInputStream dataRead=new DataInputStream(s.getInputStream());
		// Input and output streams to get and write data over the buffer
		DataOutputStream dataWrite=new DataOutputStream(s.getOutputStream());
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str="",str2="";
		while(!str.equals("bye")){
			str=br.readLine();
			//sending data over to the server
			dataWrite.writeUTF(str);
			dataWrite.flush();
			//recieving data from server
			str2=dataRead.readUTF();
			System.out.println("Server : "+str2);
		}
		dataRead.close();
		s.close();
	}
}