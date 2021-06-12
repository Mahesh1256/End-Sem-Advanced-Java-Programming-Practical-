import java.io.*;
import java.net.*;
public class Server
{
public static void main(String args[])
{
try
{
ServerSocket ss=new ServerSocket(8080);
Socket s=ss.accept();

System.out.println("*******************Connection Established*****************");
DataInputStream dis=new DataInputStream(s.getInputStream());
DataOutputStream dos=new DataOutputStream(s.getOutputStream());
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

String str="",str2="";
while(!str.equals("bye"))
{
str=dis.readUTF();
System.out.println("Client Says: "+str);
str2=br.readLine();
dos.writeUTF(str2);
dos.flush();
}
dis.close();
s.close();
ss.close();
}
// created by Sarabjeet Singh
catch(Exception e)
{
System.out.println(e);
}
}
// created by Sarabjeet Singh
}



