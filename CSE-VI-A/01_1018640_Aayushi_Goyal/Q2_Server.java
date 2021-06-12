import java.net.*; 
import java.io.*; 
class Server
{ 
 public static void main(String[] args) throws Exception{ 
 ServerSocket ss=new ServerSocket(8080); 
 Socket s=ss.accept(); 
 System.out.println("Connection is stable now!"); 
 DataInputStream dataRead=new DataInputStream(s.getInputStream()); 
 DataOutputStream dataWrite=new DataOutputStream(s.getOutputStream()); 
 BufferedReader br=new BufferedReader (new InputStreamReader(System.in)); 
 String s1="",s2=""; 
 while(!s1.equalsIgnoreCase("stay safe")){ 
 s1=dataRead.readUTF();   // reads the message from client 
 System.out.println("Client says: "+s1); 
 s2=br.readLine();        // taking input from the user through keyboard in String format
 dataWrite.writeUTF(s2); 
 dataWrite.flush(); 
 } 
 dataRead.close(); 
 dataWrite.close();
 s.close(); 
 ss.close(); 
 } 
}