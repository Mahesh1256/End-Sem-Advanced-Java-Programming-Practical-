/*
AYUSHI SHARMA
SECTION : C
ROLL NO. : 16
UNIVERSITY ROLL NO.: 1018470
*/


import java.io.*;
import java.net.*;
public class Server2{
public static void main(String[] args)throws Exception{
  ServerSocket ss=new ServerSocket(8080);
  Socket s=ss.accept();
  System.out.println("Connection is stable now !!!\nWaiting..........");
  DataOutputStream dataWrite=new DataOutputStream(s.getOutputStream());
  DataInputStream dataRead=new DataInputStream(s.getInputStream());
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  String str="",str2="";
  while(!str.equals("bye")){
    str=dataRead.readUTF();
    System.out.println("Client says: "+str);                  //Ayushi prints the message from the client
    str2=br.readLine();
    dataWrite.writeUTF(str2);                                 //Ayushi sending response to the client from server
    dataWrite.flush();
    }
    dataRead.close();
    s.close();
    ss.close();
}
}