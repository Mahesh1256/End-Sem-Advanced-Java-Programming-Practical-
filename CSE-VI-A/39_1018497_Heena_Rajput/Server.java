import java.net.*;
import java.io.*;
public class Server{
public static void main (String args[]) throws Exception
{
ServerSocket ss=new ServerSocket(8082);
Socket s=ss.accept();

DataInputStream dr=new DataInputStream(s.getInputStream());
DataOutputStream dw=new DataOutputStream(s.getOutputStream());
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String s1="",s2="";
while(!s1.equals("bye")){

s2=br.readLine();
dw.writeUTF(s2);
dw.flush();
//writing on buffer

s1=dr.readUTF();
System.out.println("Client Says: "+s1);
//printing what user sent
}
dr.close();
s.close();
ss.close();
}
}

//Heena Rajput-SecA-39