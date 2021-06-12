import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String args[]) throws Exception {

        Socket s = new Socket("localhost",8085);

        DataOutputStream dataWrite = new DataOutputStream(s.getOutputStream());

        DataInputStream dataRead = new DataInputStream(s.getInputStream());

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//        Scanner sc = new Scanner(System.in);
        String str = "", str2 = "";

        while(!str.equals("bye")) {
            str = br.readLine();
            dataWrite.writeUTF(str);
            dataWrite.flush();
            str2 = dataRead.readUTF();
            System.out.println("Client says : " + str2);
        }
        dataRead.close();
        s.close();
    }
}