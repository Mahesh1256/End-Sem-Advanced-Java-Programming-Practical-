import java.io.*;
import java.net.*;

// Program is done by tushar darmora 1018622
public class client {

    public static void main(String args[]) throws Exception {

        Socket s = new Socket("localhost", 8081); // used to establish the connection in client side

        DataInputStream dataRead = new DataInputStream(s.getInputStream()); // used to read something out of buffer

        DataOutputStream dataWrite = new DataOutputStream(s.getOutputStream());

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = "", str2 = "";

        while (!str.equals("Stay Safe")) { // used to terminate the program

            str = br.readLine(); // read line

            dataWrite.writeUTF(str); // uesd to write the given string

            dataWrite.flush();

            str2 = dataRead.readUTF();

            System.out.println("SERVER: " + str2);

        }

        dataRead.close();

        s.close();

    }

}