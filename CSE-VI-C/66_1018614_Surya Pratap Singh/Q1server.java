/* Name= Surya Pratap Singh
   Roll Number: 66
   Section : C
   University Roll Number: 1018614 */

import java.net.*;
import java.io.*;

public class server{ // public class having  name server
public static void main(String args[])throws Exception{ // main function  and thwows exception



ServerSocket ss=new ServerSocket(8080); //using server socket programming 
Socket s=ss.accept(); // used to establish the connection

System.out.println("Connection is established between the client and the server");
// Displays the message that the connection is successfully established between the client and the server and both the client and server can communicate with each other.

DataInputStream dataRead=new DataInputStream(s.getInputStream());//data read from buffer
 //input is in client.java and output is generated in client.java

DataOutputStream dataWrite=new DataOutputStream(s.getOutputStream());//data write on buffer
// when server writes on buffer, client will read it.
//when client writes on buffer, server will read it.


BufferedReader br =new BufferedReader(new InputStreamReader(System.in)); //take input from keyboard

String str="",str2="";
 // two strings taken for the communication between client and server

while(!str.equals("bye")){
    // while condition to terminate the communication if bye occurs from client and server side.
    str=dataRead.readUTF();
    System.out.println("Client is saying :"+str);
    /*reading from the Keywboard Input */ 
    str2=br.readLine();
    dataWrite.writeUTF(str2);
    dataWrite.flush();
}
dataRead.close();
s.close(); // closes the connection
ss.close(); // closes the socket 
} // end of main function
} // end of program 
