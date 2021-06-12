//NAME      : ASHUTOSH RAWAT
//ROLL NO.  : 1018460(24)
//SECTION   : A


import java.io.*;
import java.net.*;
public class MyServer {
public static void main(String[] args) {
try{
ServerSocket ss = new ServerSocket(8050);
Socket s = ss.accept();
System.out.println("The Connection is  now stable!");
DataInputStream dRead = new DataInputStream(s.getInputStream()); //read data from stream
DataOutputStream dWrite = new DataOutputStream(s.getOutputStream()); //dwrite data into stream
BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in)); //read data from keyboard
String st1="",st2="";
while(!st1.equals("Bye")){
st1 = dRead.readUTF();
System.out.println("\nClient says: "+st1);
st2 = bReader.readLine();
dWrite.writeUTF(st2);
dWrite.flush();
}
dRead.close();
ss.close();
s.close();
}
catch(Exception e){
System.out.println(e);
}
}
}