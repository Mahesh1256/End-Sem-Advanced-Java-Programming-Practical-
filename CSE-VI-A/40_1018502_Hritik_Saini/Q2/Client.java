import java.net.*;
import java.io.*;
public class Client{
public static void main(String args[])throws Exception{

Socket s= new Socket("localhost",8080);		//to get the server connection	
 
DataInputStream input =new DataInputStream(s.getInputStream());

DataOutputStream output = new DataOutputStream(s.getOutputStream());

BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

String str="", str2="";
while(!str.equals("bye")){
str=br.readLine();
output.writeUTF(str);
output.flush();
str2 = input.readUTF(); 			 //to read message from server
System.out.println("Server Says:-  "+str2);  	//to print message received from server
}
input.close();
s.close();
}}
