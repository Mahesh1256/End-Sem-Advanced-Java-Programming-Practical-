import java.net.*;
import java.io.*;
class tcp_server{
    public static void main(String args[]) throws Exception {
        ServerSocket sc = new ServerSocket(6565);
        Socket ss = sc.accept();
        DataInputStream ds = new DataInputStream(ss.getInputStream());
        DataOutputStream dd = new DataOutputStream(ss.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "", str2 = "";
        while (str2 != "stop") {
            str = (String)ds.readUTF();
            System.out.println("Client Says: " + str);
            str2 = br.readLine();
            dd.writeUTF(str2);
            dd.flush();
        }
        ss.close();
    }
}