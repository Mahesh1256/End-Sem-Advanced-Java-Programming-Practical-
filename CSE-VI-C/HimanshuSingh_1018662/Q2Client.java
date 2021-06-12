//Client side code by Himanshu Singh(1018662)//

import java.io.*;
import java.net.*;

public class Q2Client{
public static void main(String args[])throws Exception{

Socket s=new Socket("192.168.29.140",8080);

System.out.println("Client-Server Two way Communication by Himanshu Singh(1018662)");
System.out.println("\n");

DataInputStream dis=new DataInputStream(s.getInputStream());
DataOutputStream dos=new DataOutputStream(s.getOutputStream());
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

String str="",str2="";

while(!str.equals("quit")){
str=br.readLine();
dos.writeUTF(str);
dos.flush();
str2=dis.readUTF();
System.out.println("Server : "+str2);
}

dis.close();
s.close();
}
}
