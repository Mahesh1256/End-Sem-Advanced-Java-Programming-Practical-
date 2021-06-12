//NAME      : ASHUTOSH RAWAT
//ROLL NO.  : 1018460(24)
//SECTION   : A


import java.io.*;
import java.net.*;
public class MyClient{
public static void main(String[] args) throws Exception {
Socket s = new Socket("localhost",8050);
DataInputStream dRead = new DataInputStream(s.getInputStream()); //read data from stream
DataOutputStream dWrite = new DataOutputStream(s.getOutputStream()); //dwrite data into stream
BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in)); //read data from keyboard
String st1="",st2="";
while(!st1.equals("Bye")){
st1 = bReader.readLine();
dWrite.writeUTF(st1);
dWrite.flush();
st2 = dRead.readUTF();
System.out.println("\nServer says : "+st2);
}
dRead.close();
s.close();
}
}