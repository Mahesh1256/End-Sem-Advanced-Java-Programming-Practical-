import java.net.*;
import java.io.*;

class Client {
public static void main(String args[]) throws Exception {
Socket s = new Socket("localhost", 8002);
DataInputStream din = new DataInputStream(s.getInputStream());
DataOutputStream dout = new DataOutputStream(s.getOutputStream());
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

String s1 = "", s2 = "";
while (!str.equals("stop")) {
s1 = br.readLine();
dout.writeUTF(s1);
dout.flush();
s2 = din.readUTF();
System.out.println("Server says: " + s2);
}

        dout.close();
        s.close();
}
}