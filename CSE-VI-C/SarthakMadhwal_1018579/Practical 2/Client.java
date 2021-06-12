package daa;
import java.io.*;
import java.util.*;
import java.net.*;


public class Client{

public static void main(String args[])throws Exception{


Socket s=new Socket("localhost",8081);


DataInputStream dis=new DataInputStream(s.getInputStream());


DataOutputStream dout=new DataOutputStream(s.getOutputStream());


Scanner sc=new Scanner(System.in);


String str="",str2="";


while(!str.equals("bye")){

str=sc.nextLine();

dout.writeUTF(str);

dout.flush();

str2=dis.readUTF();

System.out.println("SERVER: "+str2);

}


dis.close();

s.close();

}

}
