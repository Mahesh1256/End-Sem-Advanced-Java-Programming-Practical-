import java.net.*;
import java.io.*;
public class Server{
public static void main(String args[])throws Exception
{
ServerSocket ss=new ServerSocket(8083);
Socket s=ss.accept();
System.out.println("Connection is Stable now.....");
DataInputStream dataRead=new DataInputStream(s.getInputStream());
DataOutputStream dataWrite=new DataOutputStream(s.getOutputStream());
BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
String str1="",str2="";
while(!str1.equals("Stay Safe"))
{
    str1=dataRead.readUTF();
    System.out.println("Client says :"+str1);
    str2=br.readLine();
    dataWrite.writeUTF(str2);
    dataWrite.flush();
}
dataRead.close();
s.close();
ss.close();
}
}
