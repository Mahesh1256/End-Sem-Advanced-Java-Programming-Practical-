import java.net.*;
import java.io.*;
import java.util.Scanner;

public class Server {
    public static void main(String args[]) throws Exception {

        ServerSocket ss = new ServerSocket(8085);
        Socket s = ss.accept(); // connection establish

        System.out.println("Online");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        DataOutputStream dataWrite = new DataOutputStream(s.getOutputStream());

        DataInputStream dataRead = new DataInputStream(s.getInputStream());

        String str = "" , str2 = "";

        while(!str.equals("bye")) {
            str = dataRead.readUTF();
            System.out.println("Client :" + str);
            str2 = br.readLine();
            dataWrite.writeUTF(str2);
            dataWrite.flush();
        }
        dataRead.close();
        ss.close();
        s.close();
    }
}