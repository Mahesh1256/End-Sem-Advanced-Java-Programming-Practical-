import java.io.*;
import java.net.*;

public class Client{
public static void main(String args[])throws Exception{

    Socket s=new Socket("localhost",8080);
    
    //data read
    DataInputStream dataRead=new DataInputStream(s.getInputStream());

    //data write
    DataOutputStream dataWrite=new DataOutputStream(s.getOutputStream());

    // read from keyboard
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

    String str="",str2="";

    while(!str.equals("bye")){
       // reading from the Keywboard Input   
        str=br.readLine();
        
      //writing the above message we want to write 
       dataWrite.writeUTF(str);
        //Flushed the written message
        dataWrite.flush();
        //Reading the message
        str2=dataRead.readUTF();
        //For Output
        System.out.println("Server says : "+str2);
    }
    dataRead.close();
    s.close();
    }
}