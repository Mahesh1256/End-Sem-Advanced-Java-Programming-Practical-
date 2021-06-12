import java.net.*;
import java.io.*;
public class MyClient{
public static void main(String args[])throws Exception{

Socket s=new Socket("localhost",8080); 

DataInputStream dataRead=new DataInputStream(s.getInputStream());   //This is used to read the data contents

DataOutputStream dataWrite=new DataOutputStream(s.getOutputStream());   //This is used to write the data contents

BufferedReader br=new BufferedReader(new InputStreamReader(System.in));    //This is to read the data from keyboard or user

String str="",str2="";		//Taking 2 strings
while(!str.equals("Stay Safe"))                 //This is the terminating condition
{
	str=br.readLine();		//To read the user input
	dataWrite.writeUTF(str);	//To write it on buffer whatever is read
	dataWrite.flush();				
	str2=dataRead.readUTF();	//To read the buffer what the server has said
	System.out.println("Server is saying: "+str2);	//To print whatever the server said
}

dataRead.close();
s.close();
}
}