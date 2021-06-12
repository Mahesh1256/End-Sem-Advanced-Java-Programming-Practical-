/*22_1018480_Divya_Pathak
section:C
sem:VI*/
import java.io.*;

import java.net.*;


public class Client{

public static void main(String args[])throws Exception{


Socket s=new Socket("localhost",8081);


DataInputStream dataRead=new DataInputStream(s.getInputStream());


DataOutputStream dataWrite=new DataOutputStream(s.getOutputStream());


BufferedReader br=new BufferedReader(new InputStreamReader(System.in));


String str="",str2="";


while(!str.equals("Stay Safe")){

str=br.readLine();

dataWrite.writeUTF(str);

dataWrite.flush();

str2=dataRead.readUTF();

System.out.println("SERVER SAYS: "+str2);

}


dataRead.close();

s.close();

}

}