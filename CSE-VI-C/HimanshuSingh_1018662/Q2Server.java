//Server side code by Himanshu Singh(1018662)//

import java.net.*;
import java.io.*;

public class Q2Server{
public static void main(String args[])throws Exception{


ServerSocket ss=new ServerSocket(8080);
Socket s=ss.accept();

System.out.println("Server created by Himanshu Singh");
System.out.println("\n");
System.out.println("Server is online");
System.out.println("\n");

DataInputStream dis=new DataInputStream(s.getInputStream());
DataOutputStream dos=new DataOutputStream(s.getOutputStream());
BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

String str="",str2="";

while(!str.equals("quit")){
str=dis.readUTF();
System.out.println("Client :"+str);
str2=br.readLine();
dos.writeUTF(str2);
dos.flush();
}
dis.close();
s.close();
ss.close();
}
}
