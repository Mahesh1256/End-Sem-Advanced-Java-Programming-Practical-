import java.net.*;
import java.io.*;
public class Client{
public static void main(String args[])throws Exception{
Socket s=new Socket("192.168.43.162",8080);

/*dataRead*/
DataInputStream dataRead=new DataInputStream(s.getInputStream());
/*dataWrite*/
DataOutputStream dataWrite=new DataOutputStream(s.getOutputStream());
/*KeyboardRead*/
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

String str="",str2="";

while(!str.equals("bye")){
str=br.readLine();
dataWrite.writeUTF(str);
dataWrite.flush();
str2=dataRead.readUTF();
System.out.println("Server says:"+str2);

}
dataRead.close();
s.close();
}}