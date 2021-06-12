/*Program Description : This program shows the server side code of a two way communication taking place between the client and the server.The communication will end when a string containing "bye" is encountered
Name : Harshita Bora
Section : C
University Roll No : 1018495
Subject : Advanced Java Programming Lab (PCS-605)*/

import java.net.*;
import java.io.*;
public class Server{
public static void main(String args[])throws Exception{
ServerSocket ss=new ServerSocket(8080);
Socket s=ss.accept();
System.out.println("Online");
DataInputStream dataRead=new DataInputStream(s.getInputStream());
DataOutputStream dataWrite=new DataOutputStream(s.getOutputStream());
BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
String str="",str2="";
while(!str.equals("bye")){
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