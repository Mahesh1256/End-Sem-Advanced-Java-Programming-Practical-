import java.net.*;
import java.io.*;
public class server{
public static void main(String args[])throws Exception{

ServerSocket ss=new ServerSocket(8082);
Socket s=ss.accept();

System.out.println("Connection is Stable now!");
DataInputStream dataRead=new DataInputStream(s.getInputStream());
DataOutputStream dataWrite=new DataOutputStream(s.getOutputStream());
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

String str="",str2="";
while(!str.equals("bye")){
str=dataRead.readUTF();
System.out.println("Client Says: "+str);
str2=br.readLine();
dataWrite.writeUTF(str2);
dataWrite.flush();
}

dataRead.close();
s.close();
}
}