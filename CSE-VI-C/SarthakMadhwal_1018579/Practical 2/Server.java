package daa;

import java.net.*;
import java.util.*;
import java.io.*;


public class Server{

public static void main(String args[])throws Exception{



ServerSocket ss=new ServerSocket(8081);

Socket s=ss.accept();


System.out.println("CONNECTION ESTABLISHED...");


DataInputStream dis=new DataInputStream(s.getInputStream());

DataOutputStream dout=new DataOutputStream(s.getOutputStream());

Scanner sc=new Scanner(System.in);


String str="",str2="";


while(!str.equals("bye")){

str=dis.readUTF();

System.out.println("CLIENT: "+str);

str2=sc.nextLine();

dout.writeUTF(str2);

dout.flush();

}

dis.close();

s.close();

ss.close();
}

}