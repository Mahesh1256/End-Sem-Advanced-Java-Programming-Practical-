// package com.company;
import java.io.*;
import java.net.*;
//Client - Server Two Way Communication using Socket Programming in Java{Single Machine}
public class Client{
    public static void main(String[] args) throws Exception {
        try{
            Socket sk = new Socket("192.168.43.154", 8080);{
            DataOutputStream dos = new DataOutputStream(sk.getOutputStream()); // for sending message to the server.
            DataInputStream dis = new DataInputStream(sk.getInputStream());
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str1  = "";
            String str2 = "";
            while(!str1.equals("bye")){
                 str1 = br.readLine();
                dos.writeUTF(str1);
                dos.flush();
                str2 = dis.readUTF();
                System.out.println("Server: "+ str2);
            }
            dos.close();
            dis.close();
        }
    }
    catch (Exception e){
            System.out.println("Error..");
    }
}
}
