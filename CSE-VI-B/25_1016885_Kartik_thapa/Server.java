import java.net.*;
import java.io.*;
public class Server
{
public static void main(String args[])throws Exception
{
ServerSocket ss=new ServerSocket(9111);
Socket s=ss.accept();
System.out.println("Online");
DataInputStream dataRead=new DataInputStream(s.getInputStream());
DataOutputStream dataWrite=new DataOutputStream(s.getOutputStream());
BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
String s1="";
String s2="";
while(!s1.equals("bye"))
{
str=dataRead.readUTF();
System.out.println("Client :"+s1);
s2=br.readLine();
dataWrite.writeUTF(s2);
dataWrite.flush();
}
dataRead.close();
s.close();
}
}