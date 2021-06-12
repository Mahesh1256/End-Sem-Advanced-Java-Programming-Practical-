import java.io.*;
import java.net.*;
public class two_way_tcp_server {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ServerSocket ss = new ServerSocket(4321);
        Socket s = ss.accept();
        DataInputStream dis = new DataInputStream(s.getInputStream());
        DataOutputStream dos=new DataOutputStream(s.getOutputStream());
        String str = "";
        while (!str.equals("bye")) {
            str = dis.readUTF();
            System.out.println("Client:" + str);
            str=br.readLine();
            dos.writeUTF(str);
            dos.flush();
        }
        dis.close();
        s.close();
        ss.close();
    }
}
