import java.net.*;
import java.io.*;
public class MyServer{
public static void main(String args[])throws Exception{

ServerSocket ss=new ServerSocket(8080);
Socket s=ss.accept();

System.out.println("Connection is Stable now!");
DataInputStream dataRead=new DataInputStream(s.getInputStream()); 		//This is used to read the data contents

DataOutputStream dataWrite=new DataOutputStream(s.getOutputStream());		//This is used to write the data contents

BufferedReader br=new BufferedReader(new InputStreamReader(System.in));		//This is to read the data from keyboard or user

String str="",str2="";			//Taking 2 strings
while(!str.equals("Stay Safe"))			 //This is the terminating condition
{
	str=dataRead.readUTF();		//To read the buffer what the client has said
	System.out.println("Client Says: "+str);	//To print whatever the client said
	str2=br.readLine();			//To read the user input
	dataWrite.writeUTF(str2);		//To write it on buffer whatever is read
	dataWrite.flush();
}

dataRead.close();
s.close();
}
}