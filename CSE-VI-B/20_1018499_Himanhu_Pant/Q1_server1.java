/*
Name :- Himanshu Pant                   Subject :- Advance Java Programming (Practical)
Sec :- B                                Course :- BTech (Cse)
Roll :- (1018499)
*/

import java.net.*;
import java.io.*;
import java.util.*;

public class server1 {
    public static void main(String args[]) throws Exception {

        ServerSocket ss = new ServerSocket(8089);
        Socket s = ss.accept();

        System.out.println("Welcome Himanshu Pant (1018499)");

        DataInputStream dataRead = new DataInputStream(s.getInputStream());

        DataOutputStream dataWrite = new DataOutputStream(s.getOutputStream());

        Scanner sc = new Scanner(System.in);

        String str1 = "" , str2 = "";

        while(!str1.equals("Stay Safe")) {
            str1 = dataRead.readUTF();
            System.out.println("Client :" + str1);
            str2 = sc.nextLine();
            dataWrite.writeUTF(str2);
            dataWrite.flush();
        }
        dataRead.close();
        ss.close();
        s.close();
    }
}