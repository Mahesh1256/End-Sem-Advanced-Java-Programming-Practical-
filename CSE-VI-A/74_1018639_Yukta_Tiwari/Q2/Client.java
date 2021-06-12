import java.io.*;
import java.net.*;
public class Client
{
public static void main(String args[])throws Exception
{
Socket s=new Socket("localhost",8083);    
DataInputStream dataRead=new DataInputStream(s.getInputStream());
DataOutputStream dataWrite=new DataOutputStream(s.getOutputStream());
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String str1="",str2="";
while(!str1.equals("Stay Safe"))
{
        str1=br.readLine();
        dataWrite.writeUTF(str1);
        dataWrite.flush();
        str2=dataRead.readUTF();
        System.out.println("Server says : "+str2);
    }
    dataRead.close();
    s.close();
    }
}
