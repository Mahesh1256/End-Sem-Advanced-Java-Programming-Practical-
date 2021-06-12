//Name:Mukul Barthwal          Roll no:1018527
import java.io.*;
import java.net.*;

public class Q2_Client{
public static void main(String args[])throws Exception{

Socket s=new Socket("localhost",8081);

DataInputStream dataRead=new DataInputStream(s.getInputStream());

DataOutputStream dataWrite=new DataOutputStream(s.getOutputStream());

BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

String str="",str2="";

while(!str.equals("close")){
str=br.readLine();
dataWrite.writeUTF(str);
dataWrite.flush();
str2=dataRead.readUTF();
System.out.println("Server : "+str2);
}

dataRead.close();
s.close();
}
}
//Name:Mukul Barthwal		Roll no:1018527