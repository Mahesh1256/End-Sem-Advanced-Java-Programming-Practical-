/*22_1018480_Divya_Pathak
section:C
sem:VI*/
import java.net.*;

import java.io.*;


public class Server{

public static void main(String args[])throws Exception{



ServerSocket ss=new ServerSocket(8081);

Socket s=ss.accept();


System.out.println(".....CLIENT AND SERVER ARE NOW CONNECTED.....");


DataInputStream dataRead=new DataInputStream(s.getInputStream());

DataOutputStream dataWrite=new DataOutputStream(s.getOutputStream());

BufferedReader br =new BufferedReader(new InputStreamReader(System.in));


String str="",str2="";


while(!str.equals("Stay Safe")){

str=dataRead.readUTF();

System.out.println("CLIENT SAYS: "+str);

str2=br.readLine();

dataWrite.writeUTF(str2);

dataWrite.flush();

}

dataRead.close();

s.close();

ss.close();
}

}