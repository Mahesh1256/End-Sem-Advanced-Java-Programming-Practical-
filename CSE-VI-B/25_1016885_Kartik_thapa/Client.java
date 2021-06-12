import java.io.*;
import java.net.*;
public class Client
{
public static void main(String args[])throws Exception
{
Socket s=new Socket("localhost",9111);
DataInputStream dataRead=new DataInputStream(s.getInputStream());
DataOutputStream dataWrite=new DataOutputStream(s.getOutputStream());
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String s1="",s2="";
while(!s1.equals("bye"))
{
s1=br.readLine();
dataWrite.writeUTF(s1);
dataWrite.flush();
str2=dataRead.readUTF();
System.out.println("Alexa : "+s2);
}
dataRead.close();
s.close();
}
}