import java.net.*;
import java.io.*;

public class server { // code is one by tushar darmora 1018622
    public static void main(String args[]) throws Exception {
        ServerSocket ss = new ServerSocket(8081);
        Socket s = ss.accept(); // accept is used to return information
        DataInputStream din = new DataInputStream(s.getInputStream());
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = "", str2 = "";
        while (!str.equals("Stay Safe")) { // used to terminate the program
            str = din.readUTF();
            System.out.println("client says: " + str);
            str2 = br.readLine();
            dout.writeUTF(str2);
            dout.flush();
        }
        din.close();
        s.close();
        ss.close();
    }
}
