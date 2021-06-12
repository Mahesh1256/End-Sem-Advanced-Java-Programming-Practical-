//Atul_Lakhera_1018462
import java.net.*;
import java.io.*;

public class Server
  {
       public static void main(String args[])throws Exception
          {

	ServerSocket ss=new ServerSocket(8081);
	Socket s=ss.accept();

	System.out.println("Online");

	DataInputStream dataRead=new DataInputStream(s.getInputStream());
	DataOutputStream dataWrite=new DataOutputStream(s.getOutputStream());
	BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

	String str="",str2="";

	while(!str.equals("bye"))        //Atul_Lakhera1018462
	   {
	         str=dataRead.readUTF();
	         System.out.println("Client :"+str);
	         str2=br.readLine();
	         dataWrite.writeUTF(str2);
	         dataWrite.flush();
	   }
        dataRead.close();
	s.close();
            }
  }