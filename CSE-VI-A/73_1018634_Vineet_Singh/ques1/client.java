import java.net.*;
import java.io.*;

public class client {
    public static void main(String args[]) throws Exception {
        Socket s = new Socket("localhost", 4444);
        DataInputStream inp = new DataInputStream(s.getInputStream());
        DataOutputStream outp = new DataOutputStream(s.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String msg = "", msg2 = "";
        while (!msg.equals("stop")) {
            msg = br.readLine();
            outp.writeUTF(msg);
            outp.flush();
            msg2 = inp.readUTF();
            System.out.println("Server says: " + msg2);
        }

        outp.close();
        s.close();
    }
}
