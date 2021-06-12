import java.net.*;
import java.io.*; 
class Client
{ 
 public static void main(String[] args) throws Exception { 
 Socket s=new Socket("localhost",8080); 
 DataInputStream dataRead=new DataInputStream(s.getInputStream()); 
 DataOutputStream dataWrite=new DataOutputStream(s.getOutputStream()); 
 BufferedReader br=new BufferedReader (new InputStreamReader(System.in)); 
 String s1="",s2=""; 
 while(!s1.equalsIgnoreCase("stay safe")){ 
 s1=br.readLine();                //taking input from the user through keyboard in String format
 dataWrite.writeUTF(s1); 
 dataWrite.flush(); 
 s2=dataRead.readUTF();           // reads the message from server 
 System.out.println("Server says: "+s2); 
 } 
 dataRead.close(); 
 dataWrite.close();
 s.close(); 
 } }