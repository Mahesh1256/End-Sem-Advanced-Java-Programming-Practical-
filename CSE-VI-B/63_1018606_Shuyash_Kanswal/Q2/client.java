import java.io.*;
import java.net.*;
public class client {
public static void main(String[] args){
try{
Socket s=new Socket("localhost",8080);
DataOutputStream dout=new DataOutputStream(s.getOutputStream());
DataInputStream din=new DataInputStream(s.getInputStream());
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String str="",str2="";
while(!str.equals("Stay safe")){
str=br.readLine();
dout.writeUTF(str);
dout.flush();
str2=din.readUTF();
System.out.println("Server says:"+str2);
}
din.close();
s.close();
}
catch(Exception e)
{
	System.out.println(e);
}
}
}