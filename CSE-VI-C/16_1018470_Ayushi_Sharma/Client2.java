/*
AYUSHI SHARMA
SECTION : C
ROLL NO. : 16
UNIVERSITY ROLL NO.: 1018470
*/

import java.io.*;
import java.net.*;
public class Client2{
public static void main(String args[])throws Exception
{
    Socket s=new Socket("localhost",8080);                                      //To create a socket connection
    DataOutputStream dataWrite=new DataOutputStream(s.getOutputStream());       
    DataInputStream dataRead=new DataInputStream(s.getInputStream());
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    String str="",str2="";
    while(!str.equals("bye")){                  
    	str=br.readLine();
    	dataWrite.writeUTF(str);                                               //Ayushi converts the input string to UTF format and sending to server
    	dataWrite.flush();
    	str2=dataRead.readUTF();
    	System.out.println("Server says: "+str2);                              //Ayushi prints the response from the server
    }
    dataRead.close();
    s.close();
}
}