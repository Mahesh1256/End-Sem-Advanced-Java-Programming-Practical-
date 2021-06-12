import java.net.*;  
import java.io.*;  
public class server{  
public static void main(String args[])throws Exception{  
ServerSocket ss=new ServerSocket(4444);  
Socket s=ss.accept();  
DataInputStream inp=new DataInputStream(s.getInputStream());  
DataOutputStream outp=new DataOutputStream(s.getOutputStream());  
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
  
String msg="",msg2="";  
while(!msg.equals("stop")){  
msg=inp.readUTF();  
System.out.println("client says: "+msg);  
msg2=br.readLine();  
outp.writeUTF(msg2);  
outp.flush();  
}  
inp.close();  
s.close();  
ss.close();  
}}
