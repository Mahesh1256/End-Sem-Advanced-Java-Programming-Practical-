//Nandini Goyal
//Roll no- 1018531
import java.io.*;
import java.net.*;

public class MyServer1{
public static void main(String[] args)throws Exception{

// ServerSocket class in server only accepts the port number  on which the client is going to connect.
	ServerSocket ss=new ServerSocket(8082);
	Socket s=ss.accept(); // accept method accept the connection request from the client.
	
System.out.println("Connection stable!");

DataInputStream dataRead=new DataInputStream(s.getInputStream()); //inputstream to read the text that is wriiten by the client on the bufffer.

DataOutputStream dataWrite=new DataOutputStream(s.getOutputStream()); //outputstream to wrute text on buffer after the client side text is flushed.

BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

//if the string equals to bye the communication will stop
String str="", str2="";
while(!str.equals("bye")){
	str=dataRead.readUTF(); // to read msg on the buffer written by server
	System.out.println("Client says: "+str);
	str2=br.readLine();
	dataWrite.writeUTF(str2); //write msg on buffer 
	dataWrite.flush(); //after te msg is seen by client it will flush or delete the msg from the buffer
}
dataRead.close();
s.close();
ss.close();
}
}
