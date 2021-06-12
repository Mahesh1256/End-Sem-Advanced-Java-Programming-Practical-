import java.net.*;
import java.io.*;
public class Client{
public static void main (String args[]) throws Exception
{
Socket s=new Socket("localhost",8082);

DataInputStream dr=new DataInputStream(s.getInputStream());
DataOutputStream dw=new DataOutputStream(s.getOutputStream());
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String s1="",s2="";
while(!s1.equals("bye")){

s2=dr.readUTF();
System.out.println("Server says:"+s2); 
//printing server side conversation
s1=br.readLine();
//Taking input from client
dw.writeUTF(s1);
dw.flush();
}
dr.close();
s.close();
}
}

//Heena Rajput-SecA-39