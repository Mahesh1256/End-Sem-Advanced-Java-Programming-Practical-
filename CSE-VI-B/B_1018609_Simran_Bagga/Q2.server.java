import java.net.*; 
import java.io.*; 
public class Server4
//server side page is made
{ 
 public static void main(String[] args) throws Exception
{ 
 ServerSocket ss=new ServerSocket(8080); 
  Socket s=ss.accept(); 
    System.out.println("online "); 
      DataInputStream dataRead=new DataInputStream(s.getInputStream()); 
 DataOutputStream dataWrite=new DataOutputStream(s.getOutputStream()); 
 BufferedReader br=new BufferedReader (new InputStreamReader(System.in)); 
      String str1="",str2=""; 
 while(!str1.equals("bye"))//use to read the request
{ 
    str1=dataRead.readUTF();//reads whatever is sent by the client 
    System.out.println("Client: "+str1); 
    str2=br.readLine(); 
    dataWrite.writeUTF(str2); 
    dataWrite.flush(); 
 } 
 
 dataRead.close(); 
     s.close(); 
     ss.close(); 
 } 
}