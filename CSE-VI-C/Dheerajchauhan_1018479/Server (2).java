// package com.company;
import java.io.*;
import java.net.*;
//Client - Server Two Way Communication using Socket Programming in Java{Single Machine}
public class Server {
    public static void main(String[] args)throws Exception {
        try {
            ServerSocket ss = new ServerSocket(8080);
            System.out.println("Server is waiting for the client...");
            Socket sk = ss.accept(); // it will accept the client request.
            System.out.println("Connection has been Established...");
            DataInputStream dis = new DataInputStream(sk.getInputStream()); // it will take the input from the client;
            DataOutputStream dos = new DataOutputStream(sk.getOutputStream());
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str1 = "";
            String str2 = "";
            while(!str2.equals("bye")){
                str2=dis.readUTF();
                System.out.println("Client: "+ str2);
                str1 = br.readLine();
                dos.writeUTF(str1);
                dos.flush();
            }
            dis.close();
            dos.close();
        }
        catch (Exception e){
            System.out.println("Error");
        }
    }
}

