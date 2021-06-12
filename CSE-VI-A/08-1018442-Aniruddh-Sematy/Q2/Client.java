//Name-Aniruddh Semalty  class-Rollno-08         University roll no-1018442  
                                        //This is client side program
import java.io.*;
import java.net.*;

public class Client
  {
       public static void main(String args[])throws Exception
         {                 
	Socket s=new Socket("localhost",8081);
	
	DataInputStream dataRead=new DataInputStream(s.getInputStream());
	DataOutputStream dataWrite=new DataOutputStream(s.getOutputStream());
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); //Name-Aniruddh Semalty  class-Rollno-08         University roll no-1018442  

	String str="",str2="";

	while(!str.equals("Stay-Safe"))
	   {
	       str=br.readLine();
	       dataWrite.writeUTF(str);
	       dataWrite.flush();
	       str2=dataRead.readUTF();
	       System.out.println("Server says : "+str2);
	    }

 	dataRead.close();
	s.close();
         }
  }
//Name-Aniruddh Semalty  class-Rollno-08         University roll no-1018442  