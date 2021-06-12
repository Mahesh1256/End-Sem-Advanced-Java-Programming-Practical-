//Name:Mukul Barthwal		Roll no:1018527
import java.net.*;
import java.io.*;

public class Q2_Server{
public static void main(String args[])throws Exception{


ServerSocket ss=new ServerSocket(8081);
Socket s=ss.accept();

System.out.println("Online");

DataInputStream dataRead=new DataInputStream(s.getInputStream());
DataOutputStream dataWrite=new DataOutputStream(s.getOutputStream());
BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

String str="",str2="";

while(!str.equals("close")){
str=dataRead.readUTF();
System.out.println("Client :"+str);
str2=br.readLine();
dataWrite.writeUTF(str2);
dataWrite.flush();
}
dataRead.close();
s.close();
}
}
//Name:Mukul Barthwal		Roll no:1018527