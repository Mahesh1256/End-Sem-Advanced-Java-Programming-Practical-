//Rohit Pokhriyal sec A roll no 56

//importing
import java.io.*;
import java.net.*;

public class Client{
    public static void main(String args[])throws Exception{

	Socket s=new Socket("localhost",999); //a socket object is created on port 999
	
    //necessary objects for data input and transfer
	DataInputStream dRead=new DataInputStream(s.getInputStream());
	DataOutputStream dWrite=new DataOutputStream(s.getOutputStream());
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

	String str1="",str2="";

//communication goes on till sever says Stay Safe
	while(!str1.equals("Stay Safe"))
	   {
	       str1=br.readLine();
	       dWrite.writeUTF(str1);
	       dWrite.flush();
	       str2=dRead.readUTF();
	       System.out.println("server says: "+str2);
	    }

 	dRead.close();
	s.close(); //closing connection
    }
}