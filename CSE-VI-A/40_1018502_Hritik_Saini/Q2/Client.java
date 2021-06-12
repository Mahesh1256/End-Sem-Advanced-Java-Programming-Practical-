import java.net.*;
import java.io.*;
public class Client{
public static void main(String args[])throws Exception{

Socket s= new Socket("localhost",8080);		//to get the server connection	
 
DataInputStream dataRead =new DataInputStream(s.getInputStream());

DataOutputStream dataWrite = new DataOutputStream(s.getOutputStream());

BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

String str="", str2="";
while(!str.equals("bye")){
str=br.readLine();
dataWrite.writeUTF(str);
dataWrite.flush();
str2 = dataRead.readUTF(); 			 //to read message from server
System.out.println("Server Says:-  "+str2);  	//to print message received from server
}
dataRead.close();
s.close();
}}
