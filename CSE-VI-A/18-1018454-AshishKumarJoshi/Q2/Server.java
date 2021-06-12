//Ashish Kumar Joshi
//SEC A
//1018454

import java.net.*;
import java.io.*; // for input output stream

public class Server
  {
       public static void main(String args[])throws Exception // main class
          {

	ServerSocket ss=new ServerSocket(729);
	Socket s=ss.accept();

	System.out.println("r1");

	DataInputStream dataRead=new DataInputStream(s.getInputStream());
	DataOutputStream dataWrite=new DataOutputStream(s.getOutputStream());
	BufferedReader br =new BufferedReader(new InputStreamReader(System.in)); // for keyboard input

	String str="",str2="";

	while(!str.equals("stay safe"))
	   {
	         str=dataRead.readUTF();
	         System.out.println("Client :"+str);
	         str2=br.readLine();
	         dataWrite.writeUTF(str2);
	         dataWrite.flush();
	   }
	dataRead.close();
	s.close();
            }
  }