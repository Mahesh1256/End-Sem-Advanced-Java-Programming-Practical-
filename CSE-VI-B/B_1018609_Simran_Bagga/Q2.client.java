import java.net.*;
import java.io.*; 
public class Client3
// client side java file is made{
 
 public static void main(String[] args) throws Exception
 { 

    Socket s=new Socket("192.168.43.128",8080); 
    DataInputStream dataRead=new DataInputStream(s.getInputStream()); 
 DataOutputStream dataWrite=new DataOutputStream(s.getOutputStream()); 
 BufferedReader br=new BufferedReader (new InputStreamReader(System.in)); 
          String str1="",str2=""; 
              while(!str.equals("bye")){ 
 str1=br.readLine();

//use to read  something from the keyboard which is converted to string and than use to print 
    dataWrite.writeUTF(str1); 
    dataWrite.flush(); 
    str2=dataRead.readUTF(); 
    System.out.println("Alexa: "+str2); 
  } 
 dataRead.close(); 
 s.close(); 
  } 
}