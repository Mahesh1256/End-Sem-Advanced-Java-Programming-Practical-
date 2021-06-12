import java.io.*;
import java.net.*;

//by manan upadhyay
//btech sem 6 sec-a 
//roll no.1018515

public class client {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", 3000);

            DataInputStream din = new DataInputStream(s.getInputStream());
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String str = " ", str1 = " ";
            while (!str.equals("bye")) {
                str = br.readLine();
                dout.writeUTF(str);
                dout.flush();
                str1 = (String) din.readUTF();
                System.out.println("Server Says :" + str1);
            }
            dout.close();
            din.close();
            s.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}