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

public class Client {
    public static void main(String args[]) throws Exception {
        Socket s = new Socket("localhost", 8080);
        System.out.println("Connected");
        DataInputStream din = new DataInputStream(s.getInputStream());
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str1 = "", str2 = "";
        while (!str1.equals("stop")) {
            str1 = br.readLine();
            dout.writeUTF(str1);
            dout.flush();
            str2 = din.readUTF();
            System.out.println("Server says: " + str2);
        }

        dout.close();
        s.close();
    }
}