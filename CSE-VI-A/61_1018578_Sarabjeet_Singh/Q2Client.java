import java.net.*;
import java.io.*;
public class Client
{
public static void main(String args[])
{
try
{
Socket s=new Socket("localhost",8080);

DataInputStream dis=new DataInputStream(s.getInputStream());
DataOutputStream dos=new DataOutputStream(s.getOutputStream());
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

String str="",str2="";

while(!str.equals("bye"))
{
str=br.readLine();
dos.writeUTF(str);
dos.flush();
str2=dis.readUTF();
System.out.println("Server Says : "+str2);
}
dis.close();
s.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
//created by Sarabjeet Singh
}