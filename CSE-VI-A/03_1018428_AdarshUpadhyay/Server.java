import java.net.*;
import java.io.*;

public class Server{
	public static void main(String[] args) throws Exception{

		ServerSocket ss=new ServerSocket(8000);//This is the server socket
		Socket s=ss.accept(); //using accept() to establish connection.

		System.out.println("connection is stable now ");//connection is stable here

		
		DataInputStream dataRead=new DataInputStream(s.getInputStream());//to input data from one device to another

		DataOutputStream dataWrite=new DataOutputStream(s.getOutputStream());// to send data from this device to other

		BufferedReader br=new BufferedReader (new InputStreamReader(System.in));

		String str="",str2="";
		while(!str.equals("bye")){	
			str=dataRead.readUTF();//to read data from client
			System.out.println("Client says: "+str);
            System.out.println();
			str2=br.readLine();
			dataWrite.writeUTF(str2);
			dataWrite.flush();
			}

		dataRead.close();
		s.close();
		ss.close(); }}
