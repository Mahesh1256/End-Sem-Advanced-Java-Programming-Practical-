//Ashish Kumar Joshi
//SEC a
//1018454


import java.io.*; //input output stream
import java.net.*;

public class Client
  {
       public static void main(String args[])throws Exception
         {
	Socket s=new Socket("localhost",729);
	
	DataInputStream dataRead=new DataInputStream(s.getInputStream());
	DataOutputStream dataWrite=new DataOutputStream(s.getOutputStream());
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); // for reading keyboard input

	String str="",str2="";

	while(!str.equals("stay safe"))
	   {
	       str=br.readLine();
	       dataWrite.writeUTF(str);
	       dataWrite.flush();
	       str2=dataRead.readUTF();
	       System.out.println("server : "+str2);
	    }

 	dataRead.close();
	s.close();
         }
  }