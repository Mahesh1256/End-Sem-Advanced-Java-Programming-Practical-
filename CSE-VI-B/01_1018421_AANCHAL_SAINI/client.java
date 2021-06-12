import java.net.*;
import java.io.*;
public class client{
public static void main(String args[])throws Exception{
/*Aanchal saini_01_1018421_B*/
/*Aanchal saini_01_1018421_B*/
Socket s=new Socket("localhost",8082);
/*Aanchal saini_01_1018421_B*/
/*Aanchal saini_01_1018421_B*/
/*Aanchal saini_01_1018421_B*/
/*Aanchal saini_01_1018421_B*/
DataInputStream dataRead=new DataInputStream(s.getInputStream());
DataOutputStream dataWrite=new DataOutputStream(s.getOutputStream());
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
/*Aanchal saini_01_1018421_B*/
/*Aanchal saini_01_1018421_B*/
/*Aanchal saini_01_1018421_B*/
String str="",str2="";
while(!str.equals("bye")){
str=br.readLine();
dataWrite.writeUTF(str);
dataWrite.flush();
str2=dataRead.readUTF();
System.out.println("Server says: "+str2);
}
/*Aanchal saini_01_1018421_B*/
/*Aanchal saini_01_1018421_B*/
dataRead.close();
s.close();
}
}

/*Aanchal saini_01_1018421_B*/