/*Soln2:Priyam Gupta
Roll no. 1018549
sec -C */
import java.net.*;
import java.io.*;
public class Server4{
	public static void main(String args[])throws Exception{
		ServerSocket ss=new ServerSocket(8080);
		//Socket class object to establish connection
		Socket s=ss.accept();//wait for establish connection confirmation and client details
		System.out.println("Connected");
		DataInputStream dataRead=new DataInputStream(s.getInputStream());
		// Input and output streams to get and write data over the buffer
		DataOutputStream dataWrite=new DataOutputStream(s.getOutputStream());
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		String str="",str2="";
		while(!str.equals("bye")){
			////recieving data from client
			str=dataRead.readUTF();
			System.out.println("Client :"+str);
			str2=br.readLine();
			//sending data over to the client

			dataWrite.writeUTF(str2);
			dataWrite.flush();
		}
		dataRead.close();
		ss.close();
	}
}