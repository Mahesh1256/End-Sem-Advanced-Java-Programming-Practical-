/*
    Name- Ranbir Aeir
    Father's Name- Nirmal Singh Aeir
    University Roll Number - 1018558
    Course- B.Tech
    Semester- 6th

    Advanced Java Programming Practical

 */

import java.net.*;
import java.io.*;

public class Server {
    public static void main(String args[]) throws Exception {
        ServerSocket ss = new ServerSocket(8080);
        System.out.println("Socket established ");
        System.out.println("Connect as a client");
        Socket s = ss.accept();
        DataInputStream din = new DataInputStream(s.getInputStream());
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str1 = "", str2 = "";
        while (!str1.equals("stop")) {
            str1 = din.readUTF();
            System.out.println("client says: " + str1);
            str2 = br.readLine();
            dout.writeUTF(str2);
            dout.flush();
        }
        din.close();
        s.close();
        ss.close();
    }
}