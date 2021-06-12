//Name-Aniruddh Semalty  class-Rollno-08         University roll no-1018442    
                                      //This is SErver side program
import java.net.*;
import java.io.*;

public class Server
  {
       public static void main(String args[])throws Exception
          {

	ServerSocket ss=new ServerSocket(8081);
	Socket s=ss.accept();

	

	DataInputStream dataRead=new DataInputStream(s.getInputStream());
	DataOutputStream dataWrite=new DataOutputStream(s.getOutputStream());
	BufferedReader br =new BufferedReader(new InputStreamReader(System.in));  //Name-Aniruddh Semalty  class-Rollno-08         University roll no-1018442  

	String str="",str2="";

	while(!str.equals("Stay-Safe"))
	   {
	         str=dataRead.readUTF();
	         System.out.println("Client says :"+str);
	         str2=br.readLine();
	         dataWrite.writeUTF(str2);
	         dataWrite.flush();
	   }
	dataRead.close();
	s.close();
            }
  }
//Name-Aniruddh Semalty  class-Rollno-08         University roll no-1018442  