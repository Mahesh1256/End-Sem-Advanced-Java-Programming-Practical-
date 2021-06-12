import java.net.*;
import java.io.*;

public class Q2Client {
    public static void main(String args[]) throws Exception {
        Socket s = new Socket("localhost", 3333);
        DataInputStream din = new DataInputStream(s.getInputStream());
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String st1 = "", st2 = "";
        while (!str.equals("stop")) {
            st1 = br.readLine();
            dout.writeUTF(st1);
            dout.flush();
            st2 = din.readUTF();
            System.out.println("Server says: " + st2);
        }

        dout.close();
        s.close();
    }
}