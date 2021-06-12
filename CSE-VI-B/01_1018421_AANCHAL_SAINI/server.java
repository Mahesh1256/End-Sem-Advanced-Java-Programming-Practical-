import java.net.*;
import java.io.*;
public class server{
public static void main(String args[])throws Exception{
/*Aanchal saini_01_1018421_B*/
/*Aanchal saini_01_1018421_B*/
/*Aanchal saini_01_1018421_B*/
ServerSocket ss=new ServerSocket(8082);
Socket s=ss.accept();
/*Aanchal saini_01_1018421_B*/
/*Aanchal saini_01_1018421_B*/
/*Aanchal saini_01_1018421_B*/

DataInputStream dataRead=new DataInputStream(s.getInputStream());
DataOutputStream dataWrite=new DataOutputStream(s.getOutputStream());
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
/*Aanchal saini_01_1018421_B*/
/*Aanchal saini_01_1018421_B*/
String str="",str2="";
while(!str.equals("bye")){
str=dataRead.readUTF();
System.out.println("Client Says: "+str);
str2=br.readLine();
dataWrite.writeUTF(str2);
dataWrite.flush();
}
/*Aanchal saini_01_1018421_B*/
/*Aanchal saini_01_1018421_B*/
dataRead.close();
s.close();
}
}