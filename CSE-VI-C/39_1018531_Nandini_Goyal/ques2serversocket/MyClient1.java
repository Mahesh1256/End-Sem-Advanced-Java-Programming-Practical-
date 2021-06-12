//Nandini Goyal
//Roll no-1018531
import java.io.*;
import java.net.*;

public class MyClient1{
public static void main(String[] args)throws Exception{

//Socket class to send connnection request to server requires the port no. and the IP address of the machine.

	Socket s=new Socket("192.168.43.142",8082);
	
DataInputStream dataRead=new DataInputStream(s.getInputStream()); 

DataOutputStream dataWrite=new DataOutputStream(s.getOutputStream()); 

BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

//if string equals bye the communication will stop
String str="", str2="";
while(!str.equals("bye")){
	str=br.readLine();
	dataWrite.writeUTF(str); //writing something on the buffer
	dataWrite.flush();//flushing or removing msg from the buffer once the server has read it.

	str2=dataRead.readUTF(); //reading from the buffer when server writes something
	System.out.println("Server says: "+str2);
}
dataRead.close();
s.close();
}
}
