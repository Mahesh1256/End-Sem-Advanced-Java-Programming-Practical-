/*
Name :- Himanshu Pant                   Subject :- Advance Java Programming (Practical)
Sec :- B                                Course :- BTech (Cse)
Roll :- (1018499)
*/

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class client1 {
    public static void main(String args[]) throws Exception {

        Socket s = new Socket("localhost",8089);

        DataOutputStream dataWrite = new DataOutputStream(s.getOutputStream());

        DataInputStream dataRead = new DataInputStream(s.getInputStream());

        Scanner sc = new Scanner(System.in);
        String str = "", str2 = "";

        while(!str.equals("Stay Safe")) {
            str = sc.nextLine();
            dataWrite.writeUTF(str);
            dataWrite.flush();
            str2 = dataRead.readUTF();
            System.out.println("Cortana : " + str2);
        }
        dataRead.close();
        s.close();
    }
}