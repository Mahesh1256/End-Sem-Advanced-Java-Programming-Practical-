package com.company;

import java.net.*;
import java.io.*;

//Name - Akhil Barthwal
//        Rollno - 06
//        section - C
//        University Rollno - 1018435

public class ServerQuestion{
    public static void main(String args[])throws Exception{


        ServerSocket ss=new ServerSocket(9090);
        Socket s=ss.accept();

        System.out.println("Connestion has been establised");

        DataInputStream dataRead=new DataInputStream(s.getInputStream());
        DataOutputStream dataWrite=new DataOutputStream(s.getOutputStream());
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

        String str="",str2="";

        while(!str.equals("Byee")){
            str=dataRead.readUTF();
            System.out.println("Client Says:"+str);
            str2=br.readLine();
            dataWrite.writeUTF(str2);
            dataWrite.flush();
        }
        dataRead.close();
        s.close();
    }
}
