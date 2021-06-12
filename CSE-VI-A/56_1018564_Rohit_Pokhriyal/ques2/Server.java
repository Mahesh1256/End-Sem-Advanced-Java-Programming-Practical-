////Rohit Pokhriyal sec A roll no 56

//importing
import java.net.*;
import java.io.*;

public class Server{
    public static void main(String args[])throws Exception{

	ServerSocket ss=new ServerSocket(999); //a serversocket object is created for port 999
	Socket s=ss.accept();   //socket object listening to connection requests by clients

	System.out.println("Connection Established"); //confirmation of connection

    //necessary objects for data input and transfer
	DataInputStream dRead=new DataInputStream(s.getInputStream());
	DataOutputStream dWrite=new DataOutputStream(s.getOutputStream());
	BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

	String str1="",str2="";

    //communication goes on till client says Stay Safe
	while(!str1.equals("Stay Safe"))
	   {
	         str1=dRead.readUTF();
	         System.out.println("Client says:"+str1);
	         str2=br.readLine();
	         dWrite.writeUTF(str2);
	         dWrite.flush();
	   }

	dRead.close();
	s.close(); //closing connection
    }
}