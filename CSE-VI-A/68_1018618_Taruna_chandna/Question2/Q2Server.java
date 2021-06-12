import java.net.*;  
import java.io.*;  
public class Q2Server{  
public static void main(String args[])throws Exception{  
ServerSocket ss=new ServerSocket(3333);  
Socket s=ss.accept();  
DataInputStream din=new DataInputStream(s.getInputStream());  
DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
  
String st1="",st2="";  
while(!str.equals("stop")){  
st1=din.readUTF();  
System.out.println("client says: "+st1);  
st2=br.readLine();  
dout.writeUTF(st2);  
dout.flush();  
}  
din.close();  
s.close();  
ss.close();  
}}