import java.net.*;
import java.io.*;
public class two_way_tcp_client {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Socket s = new Socket("localhost", 4321);
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        DataInputStream dis=new DataInputStream(s.getInputStream());
        String str = "";
        while (!str.equals("bye")) {
            System.out.print("Message:");
            str = br.readLine();
            dos.writeUTF(str);
            dos.flush();
            str=dis.readUTF();
            System.out.println("Server:"+str);
        }
        dos.close();
        s.close();
    }
}
