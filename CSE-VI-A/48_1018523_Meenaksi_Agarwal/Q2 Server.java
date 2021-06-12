import java.net.*;  
import java.io.*;  
public class Server2{  
public static void main(String args[])throws Exception{  
ServerSocket ss=new ServerSocket(8002);  
Socket s=ss.accept();  
System.out.println("Connection Established");
DataInputStream din=new DataInputStream(s.getInputStream());  
DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
  
String s1="",s2="";  
while(!s1.equals("stop")){  
s1=din.readUTF();  
System.out.println("client says: "+s1);  
s2=br.readLine();  
dout.writeUTF(s2);  
dout.flush();  
}  
din.close();  
s.close();  
ss.close();  
}}