/* Name= Surya Pratap Singh
   Roll Number: 66
   Section : C
   University Roll Number: 1018614 */

   
import java.io.*; //importing essential libraries/packages
import java.net.*;

public class client{ // public class having  name client
public static void main(String args[])throws Exception{ // main function  

    Socket s=new Socket("localhost",8080); // using Socket protocol
    //here localhost = 8080 refers to the IP Address of the system.

    DataInputStream dataRead=new DataInputStream(s.getInputStream()); 
    //input is in client.java and output is generated in client.java

    DataOutputStream dataWrite=new DataOutputStream(s.getOutputStream());
    // when server writes on buffer, client will read it.
    //when client writes on buffer, server will read it.

    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    // for taking the input from the keyboard

    String str="",str2=""; 
    // two strings taken for the communication between client and server

    while(!str.equals("bye")){ 
        // while condition to terminate the communication if bye occurs from client and server side.
        str=br.readLine();
        dataWrite.writeUTF(str);
        dataWrite.flush();
        str2=dataRead.readUTF();
        System.out.println("The Message from Server Side is : "+str2);

    }
    dataRead.close();
    s.close(); // closes the connection
    }
}