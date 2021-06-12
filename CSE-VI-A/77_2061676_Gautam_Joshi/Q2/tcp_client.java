import java.io.*;
import java.net.*;
class tcp_client{
    public static void main(String args[]) throws Exception {
        Socket ss = new Socket("localhost",6565);
        DataOutputStream du = new DataOutputStream(ss.getOutputStream());
        DataInputStream di = new DataInputStream(ss.getInputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "", str2 = "";
        while (str2 != "stop") {
            str2 = br.readLine();
            du.writeUTF(str2);
            str = (String)di.readUTF();
            System.out.println("Server says: " + str);
            du.flush();
        }
        ss.close();
    }
}