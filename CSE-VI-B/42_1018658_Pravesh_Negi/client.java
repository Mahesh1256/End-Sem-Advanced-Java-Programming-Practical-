import java.net.*;
import java.io.*;
public class client {
public static void main(String args[])throws Exception
{
Socket s=new Socket("localhost",2020);
DataInputStream dataRead = new DataInputStream(s.getInputStream());
DataOutputStream dataWrite;
dataWrite = new DataOutputStream(s.getOutputStream());
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String str="",str2="";
while(!str.equals("close"))
{
str=br.readLine();
dataWrite.writeUTF(str);
dataWrite.flush();
str2=dataRead.readUTF();
System.out.println("server says: "+str2);
}
dataRead.close();
s.close();
}
} 