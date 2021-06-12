import java.net.*;
import java.io.*;
public class Q2Client
{
	public static void main(String[] args) throws Exception 
	{
		//Create Client Socket
		Socket s=new Socket("localhost",8080);	
		DataInputStream dataRd=new DataInputStream(s.getInputStream());
		DataOutputStream dataWrite=new DataOutputStream(s.getOutputStream());
		//To Read Data Coming from the Client.
		BufferedReader br=new BufferedReader (new InputStreamReader(System.in));	
		String str="",str2="";
		while(!str.equals("Stay Safe"))
		{
			//Reading something from the keyboard which is converted to String.
			str=br.readLine();
			//Send to the Server.
			dataWrite.writeUTF(str);
			dataWrite.flush();
			//Receive msg from server.
			str2=dataRd.readUTF();
			System.out.println("Server says: "+str2);
		}
		//close the connection.
		dataRd.close();
		s.close();
		} 
}